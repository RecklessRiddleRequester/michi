import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuperImportantUnitTests {

    @Test
    void firstTest() {
        // Die Frage lautet: XYZ?
        // Deine Antwort hier in den String eintragen
        String answer = "richtige Antwort";

        // Check if the answer is correct
        String expected = "cmljaHRpZ2VhbnR3b3J0";
        assertThat(processAnswer(answer)).isEqualTo(expected);
    }

    @Test
    void secondTest(){
        // Die Frage lautet: XYZ?
        // Deine Antwort hier in den String eintragen
        String answer = "falsche Antwort";

        // Check if the answer is correct
        String expected = "cmljaHRpZ2VhbnR3b3J0";
        assertThat(processAnswer(answer)).isEqualTo(expected);
    }

    @Test
    void thirdTest(){
        // Die Frage lautet: XYZ?
        // Deine Antwort hier in den String eintragen
        String answer = "";

        // Check if the answer is correct
        String expected = "cmljaHRpZ2VhbnR3b3J0";
        assertThat(processAnswer(answer)).isEqualTo(expected);
    }

    @Test
    void fourthTest(){
        // Die Frage lautet: XYZ?
        // Deine Antwort hier in den String eintragen
        String answer = "";

        // Check if the answer is correct
        String expected = "cmljaHRpZ2VhbnR3b3J0";
        assertThat(processAnswer(answer)).isEqualTo(expected);
    }

    private String processAnswer(String answer) {
        return new String(Base64.getEncoder().encode(answer.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").getBytes()));
    }
}
