package tests;

import org.junit.jupiter.api.Test;
import ppp.a;

import static org.junit.jupiter.api.Assertions.*;

class aTest {

    @Test
    void ac() {
        a aa = new a();
        assertEquals(2, aa.ac());
    }
}