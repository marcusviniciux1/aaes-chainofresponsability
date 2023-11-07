package org.example;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        tiposAprovacao.add(TipoPedidoCompra.getTipoPedidoCompra());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}