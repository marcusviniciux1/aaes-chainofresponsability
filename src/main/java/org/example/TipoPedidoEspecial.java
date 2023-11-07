package org.example;

public class TipoPedidoEspecial implements TipoPedido {

    private static TipoPedidoEspecial tipoPedidoEspecial = new TipoPedidoEspecial();

    private TipoPedidoEspecial() {
    }

    ;

    public static TipoPedidoEspecial getTipoPedidoEspecial() {
        return tipoPedidoEspecial;
    }
}