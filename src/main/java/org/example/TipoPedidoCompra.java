package org.example;

public class TipoPedidoCompra implements TipoPedido {

    private static TipoPedidoCompra tipoPedidoCompra = new TipoPedidoCompra();

    private TipoPedidoCompra() {
    }

    ;

    public static TipoPedidoCompra getTipoPedidoCompra() {
        return tipoPedidoCompra;
    }
}