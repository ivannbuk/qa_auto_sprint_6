package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineClassMockTest {

    @Test
    public void felineGetFamilyPositiveTest() {
        String expected = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensPositiveTest() {
        int expected = 1;
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensKittensPositiveTest() {
        int expected = 10;
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        Assert.assertEquals(expected, actual);
    }
}
