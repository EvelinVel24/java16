public class Venta {
    private Vendedor vendedor;
    private double ganancia;

    public Venta(Vendedor vendedor) {
        this.vendedor = vendedor;
        this.ganancia = 0;
    }

    public void agregarGanancia(double monto) {
        this.ganancia += monto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public String resumenVenta() {
        return vendedor.toString() + " - Total Ganado: " + ganancia;
    }
}
