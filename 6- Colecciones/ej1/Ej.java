package ej1;

public class Ej1 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear 5 productos
        Producto p1 = new Producto("P001", "Harina", 500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Pantalon", 1200, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Mesa", 8000, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Televisor", 3000, 15, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar productos
        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        inventario.listarProductos();

        // 3. Buscar por ID
        System.out.println("\n--- BUSCAR PRODUCTO P003 ---");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n--- FILTRO ELECTRÓNICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto
        System.out.println("\n--- ELIMINAR PRODUCTO P004 ---");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n--- ACTUALIZAR STOCK P002 ---");
        inventario.actualizarStock("P002", 30);
        inventario.buscarProductoPorId("P002").mostrarInfo();

        // 7. Total stock
        System.out.println("\n--- TOTAL DE STOCK ---");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        System.out.println(inventario.obtenerProductoConMayorStock());

        // 9. Filtrar por precio
        System.out.println("\n--- PRODUCTOS ENTRE $1000 Y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Categorías disponibles
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }

}
