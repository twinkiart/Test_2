package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования")
    @Timeout(10)
    @Tag("summ")
    void summ() {
        Calc calc = new Calc();
        int result = calc.summ(5, 5);
        Assertions.assertEquals(10,result, "Не верный ответ");
    }

    @Test
    @DisplayName("Проверка вычетания")
    @Timeout(10)
    @Tag("summ2")
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ2(5, 5);
        Assertions.assertEquals(0,result, "Не верный ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 2")
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не верный ответ");
    }

    @ParameterizedTest(name = "#{index} - вычетание {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 1, 0", "-2, 2, -4", "0, 0, 0"})
    @DisplayName("Проверка вычетания 2")
    @Tag("param")
        void summ4(int c, int d, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ2(c, d);
        Assertions.assertEquals(expectedResult, result, "Не верный ответ");
    }
}