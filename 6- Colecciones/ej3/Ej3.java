package ej3;

public class Ej3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1. Crear 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P001", "Brian Gutierrez", "Sistemas");
        Profesor p2 = new Profesor("P002", "Luciana Decaux", "Programación");
        Profesor p3 = new Profesor("P003", "Gabriel Sanchez", "Ingles");

        Curso c1 = new Curso("C001", "Sistemas Operativos");
        Curso c2 = new Curso("C002", "Estructuras de Datos");
        Curso c3 = new Curso("C003", "Ingles 1");
        Curso c4 = new Curso("C004", "Bases de Datos");
        Curso c5 = new Curso("C005", "Sistemas y Análisis Matemático");

        // 2. Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C005", "P001");
        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C004", "P002");
        uni.asignarProfesorACurso("C003", "P003");

        // 4. Listar
        System.out.println("\n--- CURSOS ---");
        uni.listarCursos();
        System.out.println("\n--- PROFESORES ---");
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\n--- CAMBIAR PROFESOR DE C001 A P002 ---");
        uni.asignarProfesorACurso("C001", "P002");
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Eliminar curso
        System.out.println("\n--- ELIMINAR CURSO C004 ---");
        uni.eliminarCurso("C004");
        uni.listarCursos();
        uni.listarProfesores();

        // 7. Eliminar profesor
        System.out.println("\n--- ELIMINAR PROFESOR P001 ---");
        uni.eliminarProfesor("P001");
        uni.listarProfesores();
        uni.listarCursos();

        // 8. Reporte
        System.out.println("\n--- REPORTE DE CURSOS POR PROFESOR ---");
        uni.reporteCursosPorProfesor();
    }
}
