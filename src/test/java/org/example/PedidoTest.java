package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    FuncionarioPresidente presidente;
    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;


    @BeforeEach
    void setUp() {
        presidente = new FuncionarioPresidente(null);
        diretor = new FuncionarioDiretor(presidente);
        gerente = new FuncionarioGerente(diretor);
    }

    @Test
    void deveRetornarGerenteParaAprovacaoCompra() {
        assertEquals("Gerente", gerente.aprovarPedido(new Pedido(TipoPedidoCompra.getTipoPedidoCompra())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoReembolso() {
        assertEquals("Diretor", gerente.aprovarPedido(new Pedido(TipoPedidoReembolso.getTipoPedidoReembolso())));
    }

    @Test
    void deveRetornarPresidenteParaAprovacaoDesconto() {
        assertEquals("Presidente", gerente.aprovarPedido(new Pedido(TipoPedidoDesconto.getTipoPedidoDesconto())));
    }

    @Test
    void deveRetornarPedidoRejeitadoParaAprovacaoDesconto() {
        assertEquals("Pedido rejeitado", gerente.aprovarPedido(new Pedido(TipoPedidoEspecial.getTipoPedidoEspecial())));
    }

}