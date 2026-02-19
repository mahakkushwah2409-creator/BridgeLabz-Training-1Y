abstract class Patient {
    protected String name;

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient: " + name);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient {
    private int days;

    public InPatient(String name, int days) {
        this.name = name;
        this.days = days;
    }

    double calculateBill() {
        return days * 2000;
    }
}
