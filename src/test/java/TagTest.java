import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
public class TagTest {

    @Test
    @Tag("feature01")
    public void feature01_flow01() {
    }

    @Test
    @Tag("feature01")
    public void feature01_flow02() {
    }

}
