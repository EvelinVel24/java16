import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear algunos productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Vegetal("Tomate", "V001", 1.50, "01/09/2023", "01/10/2023"));
        productos.add(new Vegetal("Zanahoria", "V002", 0.90, "02/09/2023", "02/10/2023"));
        productos.add(new Vestuario("Camiseta", "R001", 15.00, "M", "Rojo"));
        productos.add(new Vestuario("Pantalones", "R002", 25.00, "L", "Azul"));

        // Crear vendedor
        Vendedor vendedor = new Vendedor("Carlos", "12345678-9");

        // Carro de compras
        List<Producto> carroDeCompras = new ArrayList<>();

        // Menú interactivo
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Listar productos");
            System.out.println("2. Agregar producto al carro de compras");
            System.out.println("3. Ver carro de compras");
            System.out.println("4. Pagar");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Productos disponibles:");
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el código del producto a agregar:");
                    String codigo = sc.nextLine();
                    boolean encontrado = false;
                    for (Producto producto : productos) {
                        if (producto.getCodigo().equals(codigo)) {
                            if (carroDeCompras.size() < 10) {
                                carroDeCompras.add(producto);
                                System.out.println("Producto agregado al carro.");
                            } else {
                                System.out.println("Carro lleno (máximo 10 productos).");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Productos en el carro:");
                    for (Producto producto : carroDeCompras) {
                        System.out.println(producto);
                    }
                    break;
                case 4:
                    double total = 0;
                    for (Producto producto : carroDeCompras) {
                        total += producto.getPrecio();
                    }
                    System.out.println("Total a pagar: $" + total);
                    System.out.println("Vendedor: " + vendedor.getNombre() + " [RUT: " + vendedor.getRut() + "]");
                    carroDeCompras.clear(); // Limpiar el carro tras el pago
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        sc.close();
    }
}
