package ru.netology.unit1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    /*    @Test
         void shouldReturn100IfAmountIs900() {

           CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 900;

          int actual = cashbackHackService.remain(amount);
            int expected = 100;

            assertEquals(expected, actual);
        }

        @Test
        void shouldReturn0IfAmountIs1000() {

            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 1000;

            int actual = cashbackHackService.remain(amount);
            int expected = 0;

            assertEquals(expected, actual);
        }

     */
    @Test
    void shouldExceptionIfAmountIsNegativ() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -1;

        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
    void shouldCashback(int amount, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
}