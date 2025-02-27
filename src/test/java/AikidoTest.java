import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AikidoTest {
    private Aikido aikido;
    @BeforeEach
    public void setUp() {
        aikido = new Aikido();
    }
    @Test
    void testAddPracticeSession() {
        aikido.addSession("2024-02-01", 90);
        assertEquals(90, aikido.getTotalTime());
        aikido.addSession("2024-02-02", 90);
        assertEquals(180, aikido.getTotalTime());
    }
    @Test
    void testCheckEligibility() {
        for(int i = 0; i < 100; ++i)
        {
            aikido.addSession("2024-02-01", 90);
        }
        assertTrue(aikido.checkEligibility());

        aikido = new Aikido();
        aikido.addSession("2024-02-01", 90);
        aikido.addSession("2024-10-02", 90);
        assertTrue(aikido.checkEligibility());

        aikido = new Aikido();
        aikido.addSession("2024-02-01", 90);
        assertFalse(aikido.checkEligibility());
    }
    @Test
    void testAddSessionFail() {
        assertThrows(DateTimeParseException.class, () -> aikido.addSession("invalid", 90));
    }
}
