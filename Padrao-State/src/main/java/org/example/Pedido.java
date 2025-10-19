package org.example;

public class Pedido {

    private PedidoEstado estado;

    public Pedido() {
        this.estado = new PedidoEstadoCriado(); // estado inicial
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public boolean avancar() {
        return estado.avancar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getNomeEstado();
    }
}