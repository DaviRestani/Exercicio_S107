package br.inatel.cdg.jogos;

public class Jogo {

    private String nome;
    private int qtd;
    private float preco;
    private String data_lancamento;

    public Jogo(String nome, int qtd, float preco, String data_lancamento) {
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
        this.data_lancamento = data_lancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public float getPreco() {
        return preco;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }
}
