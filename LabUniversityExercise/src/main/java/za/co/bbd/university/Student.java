package za.co.bbd.university;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentNumber; //unique ID number for this student
    private String dob; //student’s date of birth
    private static List<Integer> studentNumberList = new ArrayList<Integer>();

    public Student(String newName, int newStudentNumber, String newDob) {
        if (studentNumberList.contains(newStudentNumber)) {
            throw new IllegalArgumentException("Student number already exists");
        } else {
            name = newName;
            studentNumber = newStudentNumber;
            dob = newDob;
            studentNumberList.add(newStudentNumber);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentNumber(int studentNumber) {
        if (studentNumberList.contains(studentNumber)) {
            throw new IllegalArgumentException("Student number already exists");
        } else {
            this.studentNumber = studentNumber;
        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public static List<Integer> getStudentNumberList() {
        return studentNumberList;
    }

    public static void setStudentNumberList(List<Integer> studentNumberList) {
        Student.studentNumberList = studentNumberList;
    }
}
