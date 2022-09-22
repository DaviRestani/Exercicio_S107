package br.inatel.cdg.jogos;

public class NumeroNegativoException extends Exception{

    public NumeroNegativoException(String msg){
        super(msg);
    }

    public NumeroNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
}
