package org.example;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        tiposAprovacao.add(TipoPedidoReembolso.getTipoPedidoReembolso());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}