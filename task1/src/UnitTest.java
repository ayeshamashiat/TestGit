import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void testDivisibleBy2() {
        NumWordPrinter printer = new NumWordPrinter();
        String outcome = printer.printWord(4);
        String expectedOutcome = "EVEN";
        Assert.assertEquals(expectedOutcome, outcome);
    }

    @Test
    public void testDivisibleBy11() {
        NumWordPrinter printer = new NumWordPrinter();
        String outcome = printer.printWord(121);
        String expectedOutcome = "PrimeEleven";
        Assert.assertEquals(expectedOutcome, outcome);
    }

    @Test
    public void testDivisibleBy2And11And13() {
        NumWordPrinter printer = new NumWordPrinter();
        String outcome = printer.printWord(26);
        String expectedOutcome = "LuckyThirteen";
        Assert.assertEquals(expectedOutcome, outcome);
    }
}
