package br.com.lbomfim.Atividade;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})

public @interface AnotacaoTabela {
    String nome();
}
