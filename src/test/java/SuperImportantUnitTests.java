import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuperImportantUnitTests {

    @Test
    public void test() {
        System.out.println("Super important unit test");
        assertThat(true).isTrue();
    }
}
