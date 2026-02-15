
    import java.util.Scanner;

    public class ZaraBonusCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] salaryAndYears = new double[20]; // [s1, y1, s2, y2...]
            double[] newSalaryAndBonus = new double[20]; // [ns1, b1, ns2, b2...]
            double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

            // Input Loop
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter Salary for Employee " + (i + 1) + ": ");
                double s = sc.nextDouble();
                System.out.print("Enter Years of Service for Employee " + (i + 1) + ": ");
                double y = sc.nextDouble();

                if (s < 0 || y < 0) {
                    System.out.println("Invalid input. Please enter positive numbers.");
                    i--; // Decrement to retry
                } else {
                    salaryAndYears[i * 2] = s;
                    salaryAndYears[i * 2 + 1] = y;
                }
            }

            // Calculation Loop
            for (int i = 0; i < 10; i++) {
                double oldSalary = salaryAndYears[i * 2];
                double years = salaryAndYears[i * 2 + 1];
                double bonusPercent = (years > 5) ? 0.05 : 0.02;
                double bonusAmount = oldSalary * bonusPercent;
                double newSalary = oldSalary + bonusAmount;

                newSalaryAndBonus[i * 2] = newSalary;
                newSalaryAndBonus[i * 2 + 1] = bonusAmount;

                totalOldSalary += oldSalary;
                totalBonus += bonusAmount;
                totalNewSalary += newSalary;
            }

            // Output results
            System.out.println("\n--- Zara Payout Summary ---");
            System.out.println("Total Old Salary: " + totalOldSalary);
            System.out.println("Total Bonus Payout: " + totalBonus);
            System.out.println("Total New Salary: " + totalNewSalary);
        }
    }