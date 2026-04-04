package wrapperClasses;

public class BankTransaction {

        public static double getRemainingLimit(Double limit, double withdrawn) {

            // Handle null case
            if (limit == null) {
                return 0.0;
            }

            // Auto-unboxing (Double → double)
            return limit - withdrawn;
        }

        public static void main(String[] args) {

            Double limit1 = 1000.0;   // Wrapper object
            Double limit2 = null;     // Null case

            double withdrawn = 200.0;

            System.out.println("Remaining Limit (limit1): " +
                    getRemainingLimit(limit1, withdrawn));

            System.out.println("Remaining Limit (limit2): " +
                    getRemainingLimit(limit2, withdrawn));
        }
    }
