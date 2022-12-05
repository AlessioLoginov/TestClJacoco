import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testWithCsvFileSource(boolean registered, long amount, long expect) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        long expected = expect;
        Assertions.assertEquals(expected, actual);
    };
}
