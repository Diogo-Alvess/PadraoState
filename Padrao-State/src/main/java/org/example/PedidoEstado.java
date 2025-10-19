package org.example;

public interface PedidoEstado {
    String getNomeEstado();
    boolean avancar(Pedido pedido);
    boolean cancelar(Pedido pedido);
}