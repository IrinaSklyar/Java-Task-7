package Statistics;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void numbersMoreZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void numbersLowAndEqualZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0,4,7,8,-1};
        long expected = 8;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
