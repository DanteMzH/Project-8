package Facturas;

import Cliente.Cliente;

import java.util.Date;

public class Factura {

    private String description;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] itemFactura;
    private int indice;

    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.itemFactura = new ItemFactura[10];
        this.fecha = new Date();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItemFactura(ItemFactura itemFactura){
        this.itemFactura[ indice ++ ] = itemFactura;
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (ItemFactura itemFactura: this.itemFactura){
            total += itemFactura.calcularImporte();
        }

        return total;

    }


}
