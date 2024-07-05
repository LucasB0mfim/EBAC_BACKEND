/**
 * @author Lucas
 */
package br.com.lbomfim.for_e_while;

public class ExemploPPT2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            System.out.println("Esta é a repetição número: " + i);
            if (i == 10)
                break;
        }
    }
}
