package br.inatel.cdg.jogos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompradeJogos {

    @Test
    public void testSomaTotalCompra() throws NumeroNegativoException {

        Jogo jg1 = new Jogo("Call Of Duty: Warzone",1, 200,"10 de março de 2020");
        Jogo jg2 = new Jogo("Grand Theft Auto V",1,150,"17 de setembro de 2013");

        Compras compra = new Compras();

        compra.adiciona(jg1);
        compra.adiciona(jg2);

        assertEquals(350, compra.somaTotal(),0.01);

    }

    @Test
    public void testSomaTotalQtd() throws NumeroNegativoException {

        Jogo jg1 = new Jogo("Elden Ring",1,250,"25 de fevereiro de 2022");
        Jogo jg2 = new Jogo("Sea of Thieves", 1, 150,"20 de março de 2018");

        Compras carrinho = new Compras();

        carrinho.adiciona(jg1);
        carrinho.adiciona(jg2);
        assertEquals(2, carrinho.somaTotalItens(),0.01);


    }

    @Test(expected = NumeroNegativoException.class)
    public void testSomaNegativo() throws NumeroNegativoException {

        Jogo jg1 = new Jogo("Stardew Valley", -1, 30,"26 de fevereiro de 2016");
        Jogo jg2 = new Jogo("Hollow Knight", -1, 30,"24 de fevereiro de 2017");

        Compras compra = new Compras();

        compra.adiciona(jg1);
        compra.adiciona(jg2);

    }

    @Test
    public void testIntegracaoDesconto() throws NumeroNegativoException {

        Jogo jg1 = new Jogo("Resident Evil 4", 1, 10,"11 de janeiro de 2005");
        Jogo jg2 = new Jogo("Grand Theft Auto: San Andreas", 1, 15,"26 de outubro de 2004");

        Compras compra = new Compras();
        Desconto desconto = new Desconto((float) 0.20);
        compra.setDesconto(desconto);

        compra.adiciona(jg1);
        compra.adiciona(jg2);
        compra.somaTotal();

        assertEquals(200, compra.somaTotal(), 0.1);

    }


}
