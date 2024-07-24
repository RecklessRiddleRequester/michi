import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuperImportantUnitTests {

    @Test
    public void firstQuestion() {
        // Die Frage lautet: XYZ?
        // Deine Antwort hier in den String eintragen
        String actual = "richtige Antwort";

        // Check if the answer is correct
        String expected = "cmljaHRpZ2UgQW50d29ydA=="; // Decoded gives: "richtige Antwort"
        assertThat(new String(Base64.getEncoder().encode(actual.getBytes()))).isEqualTo(expected);
    }
}
