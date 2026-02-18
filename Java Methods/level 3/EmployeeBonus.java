public class EmployeeBonus {

    // Method to generate salary (5 digit)
    public static int generateSalary() {
        return 10000 + (int)(Math.random() * 90000);
    }

    // Method to generate years of service
    public static int generateYears() {
        return 1 + (int)(Math.random() * 10);
    }

    // Method to calculate bonus
    public static double calculateBonus(int salary, int years) {
        if (years > 5)
            return salary * 0.05;
        else
            return salary * 0.02;
    }

    public static void main(String[] args) {

        int[][] data = new int[10][2]; // salary, years
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Emp\tSalary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < 10; i++) {
            data[i][0] = generateSalary();
            data[i][1] = generateYears();

            bonus[i] = calculateBonus(data[i][0], data[i][1]);
            newSalary[i] = data[i][0] + bonus[i];

            totalOld += data[i][0];
            totalBonus += bonus[i];
            totalNew += newSalary[i];

            System.out.println((i + 1) + "\t" +
                    data[i][0] + "\t" +
                    data[i][1] + "\t" +
                    bonus[i] + "\t" +
                    newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
