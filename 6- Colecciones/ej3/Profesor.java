package ej3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincronizar lado del curso
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null); // sincronizar lado del curso
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No dicta cursos.");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor{id='" + id + "', nombre='" + nombre +
                "', especialidad='" + especialidad + "', cursos=" + cursos.size() + "}");
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
}
