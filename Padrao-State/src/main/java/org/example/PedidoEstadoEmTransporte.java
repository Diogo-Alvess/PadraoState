package org.example;

public class PedidoEstadoEmTransporte implements PedidoEstado {

    @Override
    public String getNomeEstado() {
        return "Em Transporte";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEstadoEntregue());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        return false; // não pode cancelar um pedido já em transporte
    }
}
