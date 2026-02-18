class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println(rollNumber); 
        System.out.println(name);       
    }
}

class Test1 {
    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        s.rollNumber = 1;
        s.name = "Vanshika";
        s.setCGPA(9.1);

        s.display();
        System.out.println("CGPA: " + s.getCGPA());
    }
}
