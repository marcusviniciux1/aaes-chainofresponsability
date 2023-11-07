package org.example;

public class TipoPedidoReembolso implements TipoPedido {

    private static TipoPedidoReembolso tipoPedidoReembolso = new TipoPedidoReembolso();

    private TipoPedidoReembolso() {
    }

    ;

    public static TipoPedidoReembolso getTipoPedidoReembolso() {
        return tipoPedidoReembolso;
    }
}