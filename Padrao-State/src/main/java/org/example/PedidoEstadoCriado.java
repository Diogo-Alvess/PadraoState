package org.example;

public class PedidoEstadoCriado implements PedidoEstado {

    @Override
    public String getNomeEstado() {
        return "Criado";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEstadoEmPreparo());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(new PedidoEstadoCancelado());
        return true;
    }
}