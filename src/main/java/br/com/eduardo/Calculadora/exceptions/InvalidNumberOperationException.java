package br.com.eduardo.Calculadora.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidNumberOperationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

//retorna uma string contendo o erro (exception)

    public InvalidNumberOperationException(String exception) {
        super(exception);
    }
}
