package BridgeLabz_SIPP_Training.Generics;


import java.util.*;

abstract class CourseType {
    String evaluationMethod;

    CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    abstract void showEvaluation();
}

class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam-Based Evaluation");
    }

    @Override
    void showEvaluation() {
        System.out.println("Evaluation: " + evaluationMethod);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() {
        super("Assignment-Based Evaluation");
    }

    @Override
    void showEvaluation() {
        System.out.println("Evaluation: " + evaluationMethod);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse() {
        super("Research-Based Evaluation");
    }

    @Override
    void showEvaluation() {
        System.out.println("Evaluation: " + evaluationMethod);
    }
}

class Course<T extends CourseType> {
    String courseName;
    T courseType;

    Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        courseType.showEvaluation();
    }
}

public class UniversityManagement {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.showEvaluation();
        }
    }

    public static void main(String[] args) {
        ExamCourse exam = new ExamCourse();
        AssignmentCourse assignment = new AssignmentCourse();
        ResearchCourse research = new ResearchCourse();

        Course<ExamCourse> c1 = new Course<>("Data Structures", exam);
        Course<AssignmentCourse> c2 = new Course<>("Web Development", assignment);
        Course<ResearchCourse> c3 = new Course<>("AI Research", research);

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();

        List<CourseType> courseList = new ArrayList<>();
        courseList.add(exam);
        courseList.add(assignment);
        courseList.add(research);

        System.out.println("\nDisplaying Evaluations using Wildcards:");
        displayCourses(courseList);
    }
}
