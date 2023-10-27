package lesson_35_2023_10_24.test;

import lesson_35_2023_10_24.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q!";
//
//    @BeforeAll // этот метод выполнится один раз перед запуском всех тестов (тестовых методов)
//    void baforeAll() {
//
//    }
//    @AfterEach // метод выполняется после каждого теста
//    @AfterAll // метод выполнится один раз после всех тестов

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testSetValideEmail() {
        String validEmail = "valid@test.de";
        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());

    }

    //@Disabled //
    @Test
    void testInvalidEmail() {
        String incorrectEmail = "invalid.test.de";
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
//        System.out.println("startEmail: " + startEmail);
    }

    @Test
    void testInvalidEmailTwoAtSet() {
        String incorrectEmail = "invalid@df@.test.de";
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid@test.d", "invalid@testde.", "invalid@testde"})
    void testIncorrectEmailSetParam(String incorrectEmail) {
        System.out.println("Current value for test: " + incorrectEmail);
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    @Disabled
    @ParameterizedTest
    //@EnumSource // источник данных для перечислений
    @MethodSource("generateDateForEmailTest")
    void testIncorrectEmailSetParamMethodSource(String incorrectEmail){
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> generateDateForEmailTest() {
        return Stream.of("invЖlid@test.de", "inval!d@test.de", "i#valid@test.de",
                "invalid@te*st.de", "inv alid@test.de", "invalid@te$t.de");
        // Done - насколько корректно использование не английского алфавита
    }


    @Disabled
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testIntsParam(int value) {
        Assertions.assertTrue(value <= 2);
        Assertions.assertFalse(value < 2);
    }


    @Disabled
    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 4, false", "cherry, 5, false"})
    void testCSVsource(String fruit, int count, boolean flag){
        Assertions.assertNotNull(fruit);
        Assertions.assertTrue(count > 0);
        Assertions.assertFalse(flag);
    }

    @Disabled
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testDataFromFile(String fruit, int count, boolean flag) {
        Assertions.assertNotNull(fruit);
        Assertions.assertTrue(count > 0);
        Assertions.assertFalse(flag);
    }
}