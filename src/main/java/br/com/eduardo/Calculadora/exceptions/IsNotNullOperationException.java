package br.com.eduardo.Calculadora.exceptions;

public class IsNotNullOperationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

//retorna uma string contendo o erro (exception)

    public IsNotNullOperationException(String exception) {
        super(exception);
    }
}
