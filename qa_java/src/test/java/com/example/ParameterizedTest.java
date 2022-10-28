package com.example;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private final String sex;
    private final boolean result;
    private final Feline feline;

    public ParameterizedTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
        this.feline = null;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkSexLionWhenHasManeResult() throws Exception {
        Lion lion = new Lion(sex,feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(result, hasMane);
    }
}