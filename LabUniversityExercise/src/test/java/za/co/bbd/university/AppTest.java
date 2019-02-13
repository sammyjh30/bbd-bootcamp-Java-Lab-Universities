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
    public void shouldThrowExceptionWithTwoStudentsOfSameNumber()
    {
        Student Chloe = new Student("Chloe", 2, "3 April 1996");
//        Student Christopher;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Student Christopher = new Student("Christopher", 2, "3 July 1996");
                });
    }
}
