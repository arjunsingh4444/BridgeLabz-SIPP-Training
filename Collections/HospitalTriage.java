package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String toString() {
        return name;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // Create priority queue with custom comparator (higher severity = higher priority)
        PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

        // Add patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Treat patients in order of severity
        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
