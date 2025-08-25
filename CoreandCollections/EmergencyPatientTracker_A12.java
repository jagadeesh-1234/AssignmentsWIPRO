package CoreandCollections;

import java.util.*;

class Patient {
    String name;
    int severity;
    long timestamp;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class EmergencyPatientTracker_A12 {
    public static void main(String[] args) throws InterruptedException {
        Comparator<Patient> comparator = (p1, p2) -> {
            if (p1.severity != p2.severity)
                return Integer.compare(p1.severity, p2.severity); 
            else
                return Long.compare(p1.timestamp, p2.timestamp); 
        };

        PriorityQueue<Patient> queue = new PriorityQueue<>(comparator);

        
        addPatient(queue, new Patient("Alice", 3));
        Thread.sleep(100);
        addPatient(queue, new Patient("Bob", 1));
        Thread.sleep(100);
        addPatient(queue, new Patient("Charlie", 2));
        Thread.sleep(100);
        addPatient(queue, new Patient("David", 1));
        Thread.sleep(100);
        addPatient(queue, new Patient("Eve", 2));
        Thread.sleep(100);
        addPatient(queue, new Patient("Frank", 4)); 

        System.out.println("\n--- Treating Patients ---");
        while (!queue.isEmpty()) {
            System.out.println("Treated: " + queue.poll());
        }
    }

    static void addPatient(PriorityQueue<Patient> queue, Patient patient) {
        if (queue.size() < 5) {
            queue.add(patient);
            System.out.println("Added: " + patient);
        } else {
            System.out.println("Queue full. Skipped: " + patient);
        }
    }
}
