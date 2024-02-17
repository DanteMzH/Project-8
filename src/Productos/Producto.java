package Productos;

public class Producto {

    private int codigo;
    private String nameProduct;
    private float precio;

    private int ultimocodigo;

    public Producto(int codigo) {
        this.codigo = ++ultimocodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
