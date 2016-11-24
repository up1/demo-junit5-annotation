import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class LifeCycleTest {

    @BeforeAll
    static void setup_for_junit4() {}

    @BeforeEach
    void setup_for_junit5() {}

    @AfterAll
    static void teardown_for_junit4() {}

    @AfterEach
    void teardown_for_junit5() {}

}
