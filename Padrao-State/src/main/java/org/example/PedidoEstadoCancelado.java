package org.example;

public class PedidoEstadoCancelado implements PedidoEstado {

    @Override
    public String getNomeEstado() {
        return "Cancelado";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        return false; // pedido cancelado não avança
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        return false; // já está cancelado
    }
}
