package org.example;

public class PedidoEstadoEntregue implements PedidoEstado {

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        return false; // já é o último estado
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        return false; // não pode cancelar após entrega
    }
}
