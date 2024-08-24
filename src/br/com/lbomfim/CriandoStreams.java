/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
//      Stream<String> stream = List.of("Lucas", "Bomfim", "Teste").stream();
        Stream<String> stream = Stream.of("Lucas", "Bomfim", "Teste");

        Stream<String> set = Set.of("Lucas", "Bomfim", "Teste").stream();

        Map<String, String> map = Map.of("Rodrigo", "Pires");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("Vitor", "Coelho");
    }
}
