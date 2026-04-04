package wrapperClasses;
import java.util.ArrayList;
import java.util.Collections;

public class EmpolyeeDataProcessing {

        public static void main(String[] args) {

            // Primitive array of ages
            int[] ages = {25, 30, 22, 40, 28};

            // Convert int[] to ArrayList<Integer>
            ArrayList<Integer> ageList = new ArrayList<>();

            for (int age : ages) {
                ageList.add(age); // auto-boxing (int → Integer)
            }

            // Find youngest and oldest
            int youngest = Collections.min(ageList);
            int oldest = Collections.max(ageList);

            // Output
            System.out.println("Employee Ages: " + ageList);
            System.out.println("Youngest Age: " + youngest);
            System.out.println("Oldest Age: " + oldest);
        }
    }

