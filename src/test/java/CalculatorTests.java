import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private Calculator calc;

    @BeforeEach
    public void setUp() {
        this.calc = new Calculator();
    }

    @DisplayName("더하기 기능 테스트")
    @Test
    public void testPlus() {

        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = calc.plus(num1, num2);

        // then
        Assertions.assertEquals(8, result);
    }

    @DisplayName("빼기 기능 테스트")
    @Test
    public void testMinus() {

        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = calc.minus(num1, num2);

        // then
        Assertions.assertEquals(2, result);
    }

    @DisplayName("곱하기 기능 테스트")
    @Test
    public void testMultiply() {

        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = calc.multiply(num1, num2);

        // then
        Assertions.assertEquals(15, result);
    }

    @DisplayName("나누기 기능 테스트")
    @Test
    public void testDivide1() {

        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = calc.divide(num1, num2);

        // then
        Assertions.assertEquals(1, result);
    }
    @DisplayName("나누기 기능 테스트 : 0으로 나눌 때 예외처리")
    @Test
    public void testDivide2() {

        // given
        int num1 = 5;
        int num2 = 0;

        // when & then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calc.divide(num1, num2)
        );
    }
}
