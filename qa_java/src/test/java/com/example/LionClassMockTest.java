package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionClassMockTest {

    @Mock
    Feline feline;

    @Test
    public void checkHasManeTrueWhenSexLionMaleTest() throws Exception {
        Lion lion = new Lion("Самец",feline);
        boolean hasMane = lion.doesHaveMane();
        Assert.assertTrue(hasMane);
    }

    @Test
    public void checkHasManeFalseWhenSexLionFemaleTest() throws Exception {
        Lion lion = new Lion("Самка",feline);
        boolean hasMane = lion.doesHaveMane();
        Assert.assertFalse(hasMane);
    }

    @Test
    public void lionGetKittensPositiveTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expected = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionGetFoodPositiveTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);
    }

}

