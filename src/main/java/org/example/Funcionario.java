package org.example;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoPedido> tiposAprovacao = new ArrayList<>();
    private Funcionario superior;

    public Funcionario getSuperior() {
        return superior;
    }

    public void setSuperior(Funcionario superior) {
        this.superior = superior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarPedido(Pedido pedido) {
        if (tiposAprovacao.contains(pedido.getTipoPedido())) {
            return getDescricaoCargo();
        } else if (superior != null) {
            return superior.aprovarPedido(pedido);
        } else {
            return "Pedido rejeitado";
        }
    }
}