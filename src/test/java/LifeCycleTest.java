import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LifeCycleTest {

    @BeforeAll
    static void setup_for_junit4() {}

    @BeforeEach
    void setup_for_junit5() {}

    @AfterAll
    static void teardown_for_junit4() {}

    @AfterEach
    void teardown_for_junit5() {}


    @Test
    @DisplayName("ชื่อแจ่มมาก ๆ เลยนะ")
    public void xxx() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void yyy() {
        assertTrue(false);
    }

    @Test
    public void shouldThrowNullPointerException() {
        Throwable exception = expectThrows(NullPointerException.class, () -> {
        throw new NullPointerException("Try to do");
        });
        assertEquals("Try to do", exception.getMessage());
    }

    @Test
    public void checkThrowNumberFormatException() {
        assertThrows(NumberFormatException.class, ()-> {
           Integer.valueOf(null);
        });
    }

}
