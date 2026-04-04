package wrapperClasses;
import java.util.ArrayList;
import java.util.List;

    public class PerformanceBenchmark {
        public static void main(String[] args) {
            int size = 1_000_000;

            // --- ArrayList<Integer> ---
            List<Integer> list = new ArrayList<>(size);
            long startTime = System.currentTimeMillis();
            // Fill
            for (int i = 0; i < size; i++) {
                list.add(i); // Autoboxing
            }
            // Sum
            long listSum = 0;
            for (int i = 0; i < size; i++) {
                listSum += list.get(i); // Unboxing
            }
            long listTime = System.currentTimeMillis() - startTime;
            System.out.println("ArrayList<Integer> Time: " + listTime + "ms");

            // --- int[] ---
            int[] array = new int[size];
            startTime = System.currentTimeMillis();
            // Fill
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }
            // Sum
            long arraySum = 0;
            for (int i = 0; i < size; i++) {
                arraySum += array[i];
            }
            long arrayTime = System.currentTimeMillis() - startTime;
            System.out.println("int[] Time: " + arrayTime + "ms");
        }
    }


