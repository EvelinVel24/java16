public class Vegetal extends Producto {
    private String fechaEnvasado;
    private String fechaCaducidad;

    public Vegetal(String nombre, String codigo, double precio, String fechaEnvasado, String fechaCaducidad) {
        super(nombre, codigo, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return nombre + " [Código: " + codigo + ", Precio: " + precio + ", Envasado: " + fechaEnvasado + ", Caducidad: " + fechaCaducidad + "]";
    }
}
