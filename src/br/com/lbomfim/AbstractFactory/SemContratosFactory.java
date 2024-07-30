/**
 * @author Lucas
 */
package br.com.lbomfim.AbstractFactory;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
