package br.com.tddbyexample;

public interface Expression {

    Expression plus(Expression addend);

    Money reduce(Bank bank, String to);
}
