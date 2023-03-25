package ru.netology.service;

//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    void remain1() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        //System.out.println(actual);
        assertEquals(actual, expected);
    }

    @Test
    void remain1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    void remain1001() {

           CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;
      //  System.out.println(actual);
        assertEquals(actual, expected);
    }
}