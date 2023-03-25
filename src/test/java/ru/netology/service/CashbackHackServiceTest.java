package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        //System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void remain1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void remain1001() {

           CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;
      //  System.out.println(actual);
        assertEquals(expected, actual);
    }
}