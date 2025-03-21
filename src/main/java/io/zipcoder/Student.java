package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String examList = "Exam Scores:\n";
        for (int i = 0; i < this.examScores.size(); i++) {
            examList += String.format("\tExam %s -> %.0f\n", i + 1, this.examScores.get(i));
        }
        return examList;
    }

    public void addExamScores(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore() {
        double sumOfExams = 0.0;
        for (double exams : this.examScores) {
            sumOfExams += exams;
        }
        return sumOfExams / this.examScores.size();
    }

}
