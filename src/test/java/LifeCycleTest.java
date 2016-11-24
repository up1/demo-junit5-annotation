import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

}
