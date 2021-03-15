package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackServiceTest {

    CashbackService service = new CashbackService();

    @Test
    public void rightCashBackLessBoundary() {

        int actual = service.remain(880);
        int expect = 120;

        assertEquals(expect, actual);
    }

    @Test
    public void rightCashBackMoreBoundary() {
        int actual = service.remain(101120);
        int expect = 880;

        assertEquals(expect, actual);
    }

    @Test
    public void boundaryAmount() {
        int actual = service.remain(1000);
        int expect = 0;

        assertEquals(expect, actual);
    }

    @Test
    public void zeroAmount() {
        int actual = service.remain(0);
        int expect = 0;

        assertEquals(expect, actual);
    }


}