package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testIsNameIsNotNull() {
        Person john = new Person("John", 31);
        assertNotNull(john.getName());
    }

    @Test
    public void testIsAgeBelow0ThrowsException() {
        final Person john = new Person("John", 31);
        assertThrows(IllegalArgumentException.class, () -> john.setAge(-1));
    }
}