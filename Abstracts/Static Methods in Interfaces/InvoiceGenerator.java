import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatUtil {

    // Static method to format date
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateFormatUtil.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatUtil.formatDate(today, "yyyy/MM/dd");
        String format3 = DateFormatUtil.formatDate(today, "MMM dd, yyyy");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }
}
