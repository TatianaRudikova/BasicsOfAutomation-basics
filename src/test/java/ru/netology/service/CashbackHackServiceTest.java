package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountEquallyReturned() {

        int expected = 1000;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountLessReturned() {

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountMoreReturned() {

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}