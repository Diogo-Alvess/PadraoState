package org.example;

public class PedidoEstadoEmPreparo implements PedidoEstado {

    @Override
    public String getNomeEstado() {
        return "Em Preparo";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEstadoEmTransporte());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(new PedidoEstadoCancelado());
        return true;
    }
}
