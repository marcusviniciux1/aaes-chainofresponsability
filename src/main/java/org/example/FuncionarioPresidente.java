package org.example;

public class FuncionarioPresidente extends Funcionario {

    public FuncionarioPresidente(Funcionario superior) {
        tiposAprovacao.add(TipoPedidoDesconto.getTipoPedidoDesconto());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Presidente";
    }
}