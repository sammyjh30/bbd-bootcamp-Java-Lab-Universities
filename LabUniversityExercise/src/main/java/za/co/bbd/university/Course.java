package za.co.bbd.university;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students = new ArrayList<Student>(); // store the course’s name, such as COP3502 etc.
    private Integer capacity; //maximum number of students allowed in this class
    private static Integer numberOfCourse; // keeps track of the number of courses that have been created so far

    public Course(String courseName, int cap) {
        name = courseName;
        capacity = cap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public static void setNumberOfCourse(Integer numberOfCourse) {
        Course.numberOfCourse = numberOfCourse;
    }

    public static Integer getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean enrollStudent(Student newStudent) {
        // Should fail if above the capacity
        if (students.size() == capacity)
            return false;
        if (students.contains(newStudent))
            return false;
        else {
            students.add(newStudent);
            return true;
        }
    }

    public boolean unenrollStudent (Student oldStudent) {
        if (students.contains(oldStudent)) {
            students.remove(oldStudent);
            return true;
        }
        else {
            return false;
        }
    }
}
