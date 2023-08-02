package services;

import java.util.HashMap;

import entities.Producto;

public class ProductoService {

    HashMap<String, Double> productos = new HashMap<>();

    private Producto crearProducto() {
        System.out.println("Ingrese el nombre del nuevo producto");
        String nombre = System.console().readLine().toLowerCase();

        System.out.println("Ingrese el precio de " + nombre + ":");
        Double precio = Double.parseDouble(System.console().readLine());

        return new Producto(nombre, precio);

    }

    private void agregarProducto() {
        Producto producto = crearProducto();

        productos.put(producto.getNombre(), producto.getPrecio());

    }

    private void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombreProducto = System.console().readLine().toLowerCase();

        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
            System.out.println("El producto existe en el mapa y fue eliminado");
        } else {
            System.out.println("El producto no existe en el mapa");
        }
    }

    private void modificarProducto() {
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombreProducto = System.console().readLine().toLowerCase();

        if (productos.containsKey(nombreProducto)) {
            System.out.println("Ingrese el nuevo precio de " + nombreProducto + ":");
            Double nuevoPrecio = Double.parseDouble(System.console().readLine());
            productos.replace(nombreProducto, nuevoPrecio);
            System.out.println("El producto fue modificado exitosamente");
        } else {
            System.out.println("El producto no existe en el mapa");
        }
    }

    private void mostrarProductos() {
        System.out.println(productos);
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("\n1. Agregar un producto");
            System.out.println("2. Modificar un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar el mapa de productos");
            System.out.println("5. Salir\n");

            System.out.println("Ingrese su opcion:");
            opcion = Integer.parseInt(System.console().readLine());
            
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion < 5);
    }

}
