package br.com.exceptions;

/**
 * Exeção lançada no caso de erro de conversão de escalas
 */
public class ErroDeConversaoException extends Exception {

    private String msg;

    public ErroDeConversaoException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
