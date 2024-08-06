/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {

        //PEGANDO O NOME DA CLASSE MÉTODO 1
        System.out.println(" ");
        System.out.println("IMPRIMINDO O NOME DA CLASSE:");
        Class clazz = Produto.class;
        System.out.println(clazz);

        //PEGANDO O NOME DA CLASSE MÉTODO 2
        System.out.println(" ");
        System.out.println("IMPRIMINDO O NOME DA CLASSE DE OUTRA FORMA:");
        Produto prod = new Produto();
        Class clazz2 = prod.getClass();
        System.out.println(clazz);

        //PEGANDO O NOME DA CLASSE PELO CONSTRUTOR
        try {
            System.out.println(" ");
            System.out.println("IMPRIMINDO O NOME DA CLASSE (SEM HASH) DO CONSTRUTOR VAZIO:");
            Constructor cons = clazz.getConstructor();
            System.out.println(cons);

            //INSTANCIANDO O PROD1 A PARTIR DO CONSTRUTOR
            System.out.println(" ");
            System.out.println("IMPRIMINDO O NOME DA CLASSE (COM HASH) DO CONSTRUTOR VAZIO:");
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(prod1);


            //PEGANDO AS PROPRIEDADES DA CLASSE
            Field[] fields = prod1.getClass().getDeclaredFields();
            System.out.println(" ");
            System.out.println("IMPRIMINDO O NOME E TIPO DE CADA ATRIBUTO PELO CONSTRUTOR:");

            for (Field field : fields) {

                Class<?> tipoDaClasse = field.getType();
                String nomeDaClasse = field.getName();
                System.out.println(nomeDaClasse + ": " + tipoDaClasse);
            }

            //PEGANDA OS MÉTODOS GETTERS E SETTERS
            System.out.println(" ");
            System.out.println("IMPRIMINDO O NOME E RETORNO DE CADA MÉTODO PELO CONSTRUTOR:");
            Method[] methods = prod1.getClass().getDeclaredMethods();

            for (Method method : methods) {

                Class<?> tipoDaClasse = method.getReturnType();
                String nomeDaClasse = method.getName();
                System.out.println(nomeDaClasse + ": " + tipoDaClasse);

                System.out.println(" ");
                System.out.println("EXECUTANDO MÉTODOS:");
                if (method.getName().startsWith("get")) {
                    System.out.println(method.invoke(prod1));
                } else {
                    for (Class classesTypes : method.getParameterTypes()) {
                        if (classesTypes.equals(String.class)) {
                            System.out.println(method.invoke(prod1, "Lucas"));
                        } else if (classesTypes.equals(Long.class)) {
                            System.out.println(method.invoke(prod1, 1L));
                        } else {
                            System.out.println(method.invoke(prod1, 2d));
                        }
                    }
                }
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
