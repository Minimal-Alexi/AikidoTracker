import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AikidoTest {
    private Aikido aikido;
    @BeforeEach
    public void setUp() {
        aikido = new Aikido();
    }
    @Test
    void testAddPracticeSession() {
        aikido.addSession(new Date(), 90);
        assertEquals(90, aikido.getTotalPracticeTime());
    }
}
