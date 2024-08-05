package br.com.lbomfim.anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE) = para @PrimeiraAnotacao em cima da classe
//@Target(ElementType.FIELD) = para @PrimeiraAnotacao dentro da classe
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface PrimeiraAnotacao {

    String value();
    String[] bairros();
    long numeroCasa();
    double valores() default 10d;
}
