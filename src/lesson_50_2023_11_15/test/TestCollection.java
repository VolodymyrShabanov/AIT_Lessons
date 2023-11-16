package lesson_50_2023_11_15.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.event.ListDataEvent;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class TestCollection {
    private List<String> strings1;
    private List<String> strings2;
    private List<String> strings3;
    private List<String> strings4;

    @BeforeEach
    void setUp() {
        strings1 = List.of("Banana", "Apple", "Orange", "Lime");
        strings2 = List.of("Banana", "Orange", "Apple", "Lime");
        strings3 = List.of("Banana", "Apple", "Orange", "Lime", "Cherry");
        strings4 = List.of("Banana", "Apple", "Orange", "Lime");
    }

    @Test
    void listEquals(){
        assertNotEquals(strings1, strings2);
        assertEquals(strings1, strings4);
    }

    @Test
    void setEquals(){
        Set<String> set1 = new LinkedHashSet<>(strings1);
        Set<String> set2 = new LinkedHashSet<>(strings2);
        Set<String> set3 = new LinkedHashSet<>(strings3);

        assertEquals(set1, set2);
        assertNotEquals(set1, set3);
    }

    @Test
    void collectionAssert(){
        assertFalse(strings1.isEmpty());
        assertEquals(4, strings1.size());
        assertTrue(strings1.contains("Apple"));
        //assertLinesMatch(strings1, strings2);
        assertLinesMatch(strings1, strings4);

    }

    @Test
    void exceptionThrows(){

    }




}
