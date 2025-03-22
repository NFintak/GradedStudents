package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1;

    @Before
    public void setUp() {
        ArrayList<Double> examScores = new ArrayList<>();
        student1 = new Student("Bartholomew", "Allen", examScores);
    }

    @Test
    public void test1studentConstructor() {
        ArrayList<Double> examScores = new ArrayList<>();
        Student student2 = new Student("Bruce", "Wayne", examScores);
        assertNotNull(student2);
    }

    @Test
    public void test1getFirstName() {
        String expected = "Bartholomew";
        String actual = student1.getFirstName();
        assertEquals(expected, actual);
    }

    @Test
    public void test2getFirstName() {
        String newName = "Barry";
        student1.setFirstName(newName);
        assertEquals(newName, student1.getFirstName());
    }

    @Test
    public void test1getLastName() {
        String expected = "Allen";
        String actual = student1.getLastName();
        assertEquals(expected, actual);
    }

    @Test
    public void test2getLastName() {
        String newName = "West";
        student1.setLastName(newName);
        assertEquals(newName, student1.getLastName());
    }

    @Test
    public void test1getNumOfExamsTaken() {
        int expected = 0;
        int actual = student1.getNumberOfExamsTaken();
        assertEquals(expected, actual);
    }

    @Test
    public void test1addExamScores() {
        student1.addExamScores(98.0);
        student1.addExamScores(83.0);
        int expected = 2;
        int actual = student1.getNumberOfExamsTaken();
        assertEquals(expected, actual);
    }

    @Test
    public void test2addExamScores() {
        student1.addExamScores(63);
        student1.addExamScores(78);
        student1.addExamScores(81);
        int expected = 3;
        int actual = student1.getNumberOfExamsTaken();
        assertEquals(expected, actual);
    }

    @Test
    public void test1getExamScores() {
        student1.addExamScores(93.0);
        student1.addExamScores(86);
        student1.addExamScores(97.0);
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 93\n" +
                "\tExam 2 -> 86\n" +
                "\tExam 3 -> 97\n";
        String actual = student1.getExamScores();
        assertEquals(expected, actual);
    }

    @Test
    public void test1setExamScore() {
        student1.addExamScores(0.0);
        student1.addExamScores(79);
        student1.setExamScore(0, 86);
        Double expected = 86.0;
        Double actual = student1.examScores.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void test1getAverageExamScore() {
        student1.addExamScores(100);
        student1.addExamScores(125);
        student1.addExamScores(75);
        Double expected = 100.0;
        Double actual = student1.getAverageExamScore();
        assertEquals(expected, actual);
    }

    @Test
    public void test2getAverageExamScore() {
        student1.addExamScores(93.6);
        student1.addExamScores(82.3);
        student1.addExamScores(91.7);
        student1.addExamScores(63.5);
        Double expected = 82.775;
        Double actual = student1.getAverageExamScore();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void test1toStringOverride() {
        student1.addExamScores(94);
        student1.addExamScores(85);
        student1.addExamScores(97);
        String expected = "Student Name: Bartholomew Allen\n> Average Score: 92" +
                "\n> Exam Scores:\n\tExam 1 -> 94\n\tExam 2 -> 85\n\tExam 3 -> 97\n";
        String actual = student1.toString();
        assertEquals(expected, actual);
    }

}