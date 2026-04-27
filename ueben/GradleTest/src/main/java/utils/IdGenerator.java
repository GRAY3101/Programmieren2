package utils;

public class IdGenerator {

    private static int counter = 0;

    public static String nextId(String prefix) {
        counter++;
        return prefix + counter;
    }

    private IdGenerator() {
        // must not be instantiated
    }
}
