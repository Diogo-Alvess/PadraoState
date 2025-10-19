package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void devePermitirAvancarDoEstadoCriado() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.avancar());
        assertEquals("Em Preparo", pedido.getNomeEstado());
    }

    @Test
    void devePermitirCancelarDoEstadoCriado() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.cancelar());
        assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    void deveAvancarAteEntrega() {
        Pedido pedido = new Pedido();
        pedido.avancar(); // Em Preparo
        pedido.avancar(); // Em Transporte
        pedido.avancar(); // Entregue
        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    void naoDeveCancelarQuandoEmTransporte() {
        Pedido pedido = new Pedido();
        pedido.avancar(); // Em Preparo
        pedido.avancar(); // Em Transporte
        assertFalse(pedido.cancelar());
    }
}
