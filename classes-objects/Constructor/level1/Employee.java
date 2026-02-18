class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void display() {
        System.out.println(employeeID);
        System.out.println(department);
    }
}

class Test4 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 10;
        m.department = "IT";
        m.setSalary(60000);

        m.display();
        System.out.println("Salary: " + m.getSalary());
    }
}
