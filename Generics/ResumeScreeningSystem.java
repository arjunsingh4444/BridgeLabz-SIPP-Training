package BridgeLabz_SIPP_Training.Generics;

import java.util.*;

abstract class JobRole {
    String roleName;

    JobRole(String roleName) {
        this.roleName = roleName;
    }

    abstract void screenResume();
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    void screenResume() {
        System.out.println("Screening resume for " + roleName + " with coding and DSA evaluation.");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }

    @Override
    void screenResume() {
        System.out.println("Screening resume for " + roleName + " with ML and statistics evaluation.");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }

    @Override
    void screenResume() {
        System.out.println("Screening resume for " + roleName + " with strategy and leadership evaluation.");
    }
}

class Resume<T extends JobRole> {
    String candidateName;
    T jobRole;

    Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    void process() {
        System.out.println("Processing resume of " + candidateName + " for role: " + jobRole.roleName);
        jobRole.screenResume();
    }
}

class ScreeningPipeline {
    public static void processAll(List<? extends JobRole> jobRoles) {
        for (JobRole jr : jobRoles) {
            jr.screenResume();
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        ProductManager pm = new ProductManager();

        Resume<SoftwareEngineer> r1 = new Resume<>("Arjun", se);
        Resume<DataScientist> r2 = new Resume<>("Neha", ds);
        Resume<ProductManager> r3 = new Resume<>("Raj", pm);

        r1.process();
        r2.process();
        r3.process();

        List<JobRole> jobList = new ArrayList<>();
        jobList.add(se);
        jobList.add(ds);
        jobList.add(pm);

        System.out.println("\nProcessing all job roles using wildcard method:");
        ScreeningPipeline.processAll(jobList);
    }
}
