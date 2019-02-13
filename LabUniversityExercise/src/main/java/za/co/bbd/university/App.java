package za.co.bbd.university;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Student ashleigh = new Student("Ashleigh", 1, "3 June 1996");
        Student christopher = new Student("Christopher", 2, "3 July 1996");
        Course math = new Course("Maths", 30);

        math.enrollStudent(ashleigh);
        math.enrollStudent(christopher);

        List<Student> mathsStudents =  math.getStudents();

        System.out.println( "Current Maths Students are:" );
        for (int i = 0; i < mathsStudents.size(); i++) {

            System.out.println( mathsStudents.get(i).getName() + "  " + mathsStudents.get(i).getStudentNumber() + "  " + mathsStudents.get(i).getDob() );
        }
    }
}
