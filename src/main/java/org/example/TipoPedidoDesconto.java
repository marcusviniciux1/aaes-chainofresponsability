package org.example;

public class TipoPedidoDesconto implements TipoPedido {

    private static TipoPedidoDesconto tipoPedidoDesconto = new TipoPedidoDesconto();

    private TipoPedidoDesconto() {
    }

    ;

    public static TipoPedidoDesconto getTipoPedidoDesconto() {
        return tipoPedidoDesconto;
    }
}