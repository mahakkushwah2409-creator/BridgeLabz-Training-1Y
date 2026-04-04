package wrapperClasses;
import java.util.ArrayList;
import java.util.List;

    public class StudentMarksReport {
        public static void main(String[] args) {
            // Raw Input Data
            Object[] rawMarks = {"85", 95, Integer.valueOf(88), "null", "not_a_number", null, "75", "100"};

            List<Integer> validMarks = new ArrayList<>();
            int sum = 0;

            for (Object mark : rawMarks) {
                try {
                    if (mark != null) {
                        // Convert all to String first, then parse
                        Integer parsedMark = Integer.parseInt(mark.toString().trim());
                        validMarks.add(parsedMark);
                        sum += parsedMark;
                    }
                } catch (NumberFormatException e) {
                    // Ignore invalid entries like "null" or "not_a_number"
                    System.out.println("Invalid entry ignored: " + mark);
                }
            }

            // Calculate Average
            if (!validMarks.isEmpty()) {
                double average = (double) sum / validMarks.size();
                System.out.println("Valid Marks: " + validMarks);
                System.out.println("Average Mark: " + average);
            } else {
                System.out.println("No valid marks available.");
            }
        }
    }

