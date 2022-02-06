package za.ac.cput;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/*
Date: 04 February 2022
Author: Damian du Toit
Student Number: 219200203
Subject: ADP372S
 */

public class TestTVShows
{
    private TVShows[] shows;

    @BeforeEach
    void setUp()
    {
        shows = new TVShows[2];
    }

    // Here's a test for equality
    @Test
    void testForEquality()
    {
        assertEquals(shows[0], shows[1]);
    }

    // Here's a test for identity
    @Test
    void testForIdentity()
    {
        assertSame(shows[0], shows[1]);
    }

    // Here's a test or failure
    @Test
    void testForFailure()
    {
        fail("This test has failed, please fix the problem and run the test again");
    }

    // Here's a test for timeouts
    @Test
    @Timeout(10)
    void testForTimeouts()
    {

    }

    // Here's a disabled test
    @Disabled("If you are seeing this, then it means the test was disabled successfully.")
    @Test
    void disabledTest()
    {
        assertEquals(shows[0], shows[1]);
    }
}