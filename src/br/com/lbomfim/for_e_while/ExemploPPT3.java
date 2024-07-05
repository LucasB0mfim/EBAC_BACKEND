/**
 * @author Lucas
 */
package br.com.lbomfim.for_e_while;

public class ExemploPPT3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i%5 !=0) {
                continue;
            }
            System.out.println("Multiplos de 5: " + i);
        }
    }
}
