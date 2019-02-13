package za.co.bbd.university;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnNameAshleighWhenCreatingStudentAshleigh()
    {
        Student ashleigh = new Student("Ashleigh", 1, "3 June 1996");
        assertEquals("Ashleigh", ashleigh.getName());
    }
    @Test
    public void shouldReturnStudentNumber3hWhenCreatingStudentJohn()
    {
        Student john = new Student("John", 3, "3 January 1996");
        assertEquals(3, john.getStudentNumber());
    }
    @Test
    public void shouldReturn3May1996hWhenCreatingStudentMay()
    {
        Student may = new Student("May", 4, "3 May 1996");
        assertEquals("3 May 1996", may.getDob());
    }

    @Test
    public void shouldReturnBobWhenChangingStudentRobertsName()
    {
        Student robert = new Student("Robert", 5, "3 October 1996");
        robert.setName("Bob");
        assertEquals("Bob", robert.getName());
    }

    @Test
    public void shouldThrowExceptionWithTwoStudentsOfSameNumber()
    {
        Student Chloe = new Student("Chloe", 2, "3 April 1996");
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Student Christopher = new Student("Christopher", 2, "3 July 1996");
                });
    }

    @Test
    public void shouldThrowExceptionWhenChangingStudentNumberToExistingNumber()
    {
        Student michael = new Student("Michael", 6, "3 March 1996");
        assertThrows(IllegalArgumentException.class,
                () -> {
                    michael.setStudentNumber(1);
                });
    }

    /**
     * Course Test :-)
     */
    @Test
    public void shouldReturnNameMathWhenCreatingCourseMath()
    {
       Course math = new Course("Math", 30);
        assertEquals("Math", math.getName());
    }

    @Test
    public void shouldReturnTrueWhenAddingStudentToCourseHistory()
    {
        Course history = new Course("History", 30);
        Student zayn = new Student("Zayn", 7, "3 March 1996");
        assertEquals(true, history.enrollStudent(zayn));
    }

    @Test
    public void shouldReturnFalseWhenAddingTooManyStudentsToCourseArt()
    {
        Course art = new Course("Art", 2);
        Student kim = new Student("Kim", 8, "3 March 1996");
        Student ron = new Student("Ron", 9, "3 March 1996");
        Student rupert = new Student("Rupert", 10, "3 March 1996");
        art.enrollStudent(kim);
        art.enrollStudent(ron);
        assertEquals(false, art.enrollStudent(rupert));
    }
//@Aftereach
    //Would make close connection calls

}
