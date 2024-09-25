public class Vestuario extends Producto {
    private String talla;
    private String color;

    public Vestuario(String nombre, String codigo, double precio, String talla, String color) {
        super(nombre, codigo, precio);
        this.talla = talla;
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre + " [Código: " + codigo + ", Precio: " + precio + ", Talla: " + talla + ", Color: " + color + "]";
    }
}
