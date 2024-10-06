package edu.sdsu.cs160l.university.lab7.course;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseTest {
    @Test
    public void testInstanceCS150(){
        Course c1 = CourseFactory.getCourse("CS150");
        Course c2 = CourseFactory.getCourse("CS150");
        assertEquals(c1, c2);
    }

    @Test
    public void testInstanceCS160(){
        Course c1 = CourseFactory.getCourse("CS160");
        Course c2 = CourseFactory.getCourse("CS160");
        assertEquals(c1, c2);
    }

    @Test
    public void testInstanceCS210(){
        Course c1 = CourseFactory.getCourse("CS210");
        Course c2 = CourseFactory.getCourse("CS210");
        assertEquals(c1, c2);
    }

    @Test
    public void testInstance340(){
        Course c1 = CourseFactory.getCourse("CS340");
        Course c2 = CourseFactory.getCourse("CS340");
        assertEquals(c1, c2);
    }

}