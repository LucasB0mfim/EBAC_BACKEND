package generics;

/**
 * @author Lucas
 */

public class ExemplosGenericEntry {

    public static void main(String[] args) {

        GenericEntry<String, Long> entry = new GenericEntry<>("teste", 10L);
        System.out.println(entry.getData() + " " + entry.getCodigo());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>(10L, 11);
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}
