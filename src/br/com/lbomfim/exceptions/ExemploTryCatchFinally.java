/**
 * @author Lucas
 */
package br.com.lbomfim.exceptions;

public class ExemploTryCatchFinally {

    public static void main(String[] args) {
        comTratamentoException();
        comTratamentoExceptionComFinally();
        lancarRuntimeException();
    }

    private static void comTratamentoException() {

        String frase = null;
        String novaFrase = null;

        try {
            //TENTANDO EXECUTAR...
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            //TRATAMENTO DO ERRO CASO OCORRA
            System.out.println("A frase inicial está nula! Vou inserir um valor para ela!");
            frase = "frase nula";
            novaFrase = frase.toUpperCase();
        }

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void comTratamentoExceptionComFinally() {

        String frase = null;
        String novaFrase = null;

        try {
            //TENTANDO EXECUTAR...
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            //TRATAMENTO DO ERRO CASO OCORRA
            System.out.println("A frase inicial está nula! Vou inserir um valor para ela!");
            frase = "frase nula";
        } finally {
            //ESSE TRECHO DEVE SER INICIADO DE QUALQUER JEITO
            novaFrase = frase.toUpperCase();
        }

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void lancarRuntimeException() {
        try {
            String frase = null;
            String novaFrase = null;
            novaFrase.toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException("Parando o sistema!");
        }
    }
}
