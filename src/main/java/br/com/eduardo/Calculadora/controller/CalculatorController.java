package br.com.eduardo.Calculadora.controller;

import br.com.eduardo.Calculadora.exceptions.InvalidNumberOperationException;
import br.com.eduardo.Calculadora.exceptions.IsNotNullOperationException;
import br.com.eduardo.Calculadora.model.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    //criação de uma rota / sum com passagem dos valores necessários para
    //execução sendo enviados em conjunto coma rote sem a definição dos nomes dos parâmetros

    @RequestMapping(value = "sum", method = RequestMethod.GET)

    //leitura dos valores inseridos na URI para executar o método de cálculo
    public float sum(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if (isNull(n1) || isNull(n2)) {
            throw new IsNotNullOperationException("Please, put the numbers");
        }

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("Please, set valid numeric value");
        }

        //os valores são enviados para o model realizar o método de soma
        return Calculator.sum(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "minus", method = RequestMethod.GET)

    //leitura dos valores inseridos na URI para executar o método de cálculo
    public float minus(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if (isNull(n1) || isNull(n2)) {
            throw new IsNotNullOperationException("Please, put the numbers");
        }

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("Please, set valid numeric value");
        }
        //os valores são enviados para o model realizar o método de soma
        return Calculator.minus(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "mult", method = RequestMethod.GET)

    //leitura dos valores inseridos na URI para executar o método de cálculo
    public float mult(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if (isNull(n1) || isNull(n2)) {
            throw new IsNotNullOperationException("Please, put the numbers");
        }

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("Please, set valid numeric value");
        }
        //os valores são enviados para o model realizar o método de soma
        return Calculator.mult(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "div", method = RequestMethod.GET)

    //leitura dos valores inseridos na URI para executar o método de cálculo
    public float div(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if (isNull(n1) || isNull(n2)) {
            throw new IsNotNullOperationException("Please, put the numbers");
        }

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("Please, set valid numeric value");
        }
        //os valores são enviados para o model realizar o método de soma
        return Calculator.div(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    public boolean isNumeric(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isNull(String value) {
        if (value.isBlank()){
            return true;
        } else {
            return false;
        }
    }
}