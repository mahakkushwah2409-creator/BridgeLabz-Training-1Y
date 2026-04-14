package com.gla.generics.level2;
import java.util.*;

class Patients {
    int id;
    String name;

    Patients(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        Patients p = (Patients) o;
        return this.id == p.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class HospitalPatient {
    public static void main(String[] args) {

        Set<Patients> admitted = new HashSet<>();
        Queue<Patients> queue = new LinkedList<>();
        Stack<Patients> discharged = new Stack<>();
        List<Patients> history = new ArrayList<>();

        // 1. Admit
        Patients p1 = new Patients(1, "Aman");
        Patients p2 = new Patients(2, "Riya");

        admit(admitted, queue, history, p1);
        admit(admitted, queue, history, p2);

        // 2. Treat
        while (!queue.isEmpty()) {
            Patients p = queue.poll();
            System.out.println("Treating: " + p);

            // 3. Discharge
            discharged.push(p);
            admitted.remove(p);
        }

        // 4. Re-admit last discharged
        if (!discharged.isEmpty()) {
            Patients p = discharged.pop();
            admit(admitted, queue, history, p);
            System.out.println("Re-admitted: " + p);
        }
    }

    static void admit(Set<Patients> set, Queue<Patients> q,
                      List<Patients> history, Patients p) {
        if (set.add(p)) {
            q.add(p);
            history.add(p);
        }
    }
}