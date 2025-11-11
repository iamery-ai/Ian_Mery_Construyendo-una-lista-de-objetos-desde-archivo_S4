package model;

public class Centro {
    private String centroCultivo;
    private String tour;
    private String producto;
    private int cantidad;

    //Inicializar el Constructor
    public Centro(String centroCultivo, String tour, String producto, int cantidad){
        this.centroCultivo = centroCultivo;
        this.tour = tour;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public String getCentroCultivo() {
        return centroCultivo;
    }

    public void setCentroCultivo(String centroCultivo) {
        this.centroCultivo = centroCultivo;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //Metodo toString para ver reprecentacion del archivo
    @Override
    public String toString() {
        return "Centro:" + centroCultivo + ", Tour:" + tour + ", Producto:" + producto + ", Cantidad:" + cantidad;
    }
}
