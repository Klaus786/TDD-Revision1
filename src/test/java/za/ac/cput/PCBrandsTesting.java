package za.ac.cput;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/*

Author: Klaus Traubner
Student Number: 218009496
Date: 04 February 2022
Subject: ADP372S

 */


public class PCBrandsTesting
{
    private PCBrands[] brand;

    @BeforeEach
    void setUp() { brand = new PCBrands[2]; }

    // Test for equality
    @Test
    void testForEquality()
    {
        assertEquals(brand[0], brand[1]);
    }

    // Test for identity
    @Test
    void testForIdentity()
    {
        assertSame(brand[0], brand[1]);
    }

    // Test for failure
    @Test
    void testForFailure()
    {
        fail("This execution has failed, please check for errors and perform another test.");
    }

    // Test for timeouts
    @Test
    @Timeout(7)
    void testForTimeouts()
    {

    }

    // Disabled test


    // Here's a disabled test
    @Disabled("If you are seeing this, then it means the test was disabled successfully.")
    @Test
    void disabledTest()
    {
        assertEquals(brand[0], brand[1]);
    }
}
