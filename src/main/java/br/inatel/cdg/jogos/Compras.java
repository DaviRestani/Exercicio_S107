package br.inatel.cdg.jogos;

import java.util.ArrayList;
import java.util.List;

public class Compras {

    private List<Jogo> jogos;
    private Desconto desconto;

    public Compras() {
        jogos = new ArrayList<Jogo>();

    }

    public void adiciona(Jogo jg) throws NumeroNegativoException {

        if(jg.getQtd() > 0){
            jogos.add(jg);
        }else{
            throw new NumeroNegativoException("Não é possivel adicionar uma quantidade negativa");
        }
    }

    private double somaTotalComDesconto(double total, double desconto){
        return total = total - (total*desconto);
    }

    public double somaTotal() {
        double total = 0;
        for (Jogo jogo : jogos) {
            total += jogo.getPreco();
        }

        if(desconto != null && desconto.getDesconto() > 0){
            return somaTotalComDesconto(total, desconto.getDesconto());
        }else{
            return total;
        }
    }

    public double somaTotalItens() {
        double total = 0;
        for (Jogo jogo : jogos) {

            total += jogo.getQtd();
        }
        return total;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }



}
