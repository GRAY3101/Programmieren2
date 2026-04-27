package utils;

import java.time.LocalDate;

public class DateUtil {

    public static LocalDate today() {
        return LocalDate.now();
    }

    public static LocalDate inDays(int days) {
        return LocalDate.now().plusDays(days);
    }

    private DateUtil() {
        // must not be instantiated
    }
}
