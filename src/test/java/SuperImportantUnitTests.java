import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SuperImportantUnitTests {

    @Test
    void firstTest() {
        // Die Frage lautet: Wer ist Julias größte Feindin?
        // Deine Antwort hier in den String eintragen
        String juliasGroessteFeindin = "";

        // Check if juliasGroessteFeindin is correct
        String expected = "bHVjeQ==";
        assertThat(processAnswer(juliasGroessteFeindin)).isEqualTo(expected);
    }

    @Test
    void secondTest() {
        // Die Frage lautet: Wo war dein riskantester Schiss?
        // Deine Antwort hier in den String eintragen
        String superRiskanterSchissOrt = "";

        // Check if superRiskanterSchissOrt is correct
        String expected = "b2x5bXA=";
        assertThat(processAnswer(superRiskanterSchissOrt)).isEqualTo(expected);
    }

    @Test
    void thirdTest() {
        // Die Frage lautet: Was ist Richy's Lieblingsessen?
        // Deine Antwort hier in den String eintragen
        String richysLieblingsessen = "";

        // Check if richysLieblingsessen is correct
        String expected = "a3V0dGVsbg==";
        assertThat(processAnswer(richysLieblingsessen)).isEqualTo(expected);
    }

    @Test
    void fourthTest() {
        // Die Frage lautet: Bestes Lokal, um sich Salmonellen einzufangen?
        // Deine Antwort hier in den String eintragen
        String salmonellenLokal = "";

        // Check if the salmonellenLokal is correct
        String expected = "YXRzdmVybGFuZ2Vu";
        assertThat(processAnswer(salmonellenLokal)).isEqualTo(expected);
    }

    @Test
    void fifthTest() {
        // Die Frage lautet: Wie nennt man unter anderem auch Grödeln?
        // Deine Antwort hier in den String eintragen
        String groedelnSynonym = "";

        // Check if the groedelnSynonym is correct
        String expected = "a3JhcHBlbg==";
        assertThat(processAnswer(groedelnSynonym)).isEqualTo(expected);
    }

    @Test
    void sixthTest() {
        // Die Frage lautet: Wie heißt das Dorf, in dem du dich als Krankenschwester am Rosenmontagsball verkleidet hast?
        // Deine Antwort hier in den String eintragen
        String dorfname = "";

        // Check if the dorfname is correct
        String expected = "d2FjaGVucm90aA==";
        assertThat(processAnswer(dorfname)).isEqualTo(expected);
    }

    @Test
    void seventhTest() {
        // Die Frage lautet: Welches Wort gehörte in deiner Jugend zu deinen Lieblingsadjektiven?
        // Deine Antwort hier in den String eintragen
        String adjektiv = "";

        // Check if the adjektiv is correct
        String expected = "ZXBpc2No";
        assertThat(processAnswer(adjektiv)).isEqualTo(expected);
    }

    @Test
    void eighthTest() {
        // Die Frage lautet: Wie lautet der Nachname der Person, mit der du einen Gullideckel in Steppach herausgenommen hast?
        // Und wie lautet der Nachname der Person, die mit ihrem/seinem Audi rein gefahren ist?
        // Deine Antworten hier in die Strings eintragen
        String gullideckelKomplize = "";
        String audiFahrer = "";

        // Check if the answer is correct
        List<String> actualAnswers = processAnswerList(List.of(gullideckelKomplize, audiFahrer));
        List<String> expectedAnswers = List.of("YmVyZ21hbm4=","d2Vpa2VydA==");
        assertThat(actualAnswers).asInstanceOf(InstanceOfAssertFactories.LIST).containsExactlyElementsOf(expectedAnswers);
    }

    @Test
    void ninthTest() {
        // Die Frage lautet: Mit welchen zwei typischen Haushaltsgegenständen kann man einen Stromausfall erzwingen?
        // Deine Antworten hier in die beiden Strings eintragen
        List<String> gegenstaende = List.of("", "");

        // Check if gegenstaende are correct
        List<String> expectedAnswers = List.of("dG9hc3Rlcg==", "bWVzc2Vy");
        expectedAnswers.forEach(expected -> assertThat(processAnswerList(gegenstaende)).asInstanceOf(InstanceOfAssertFactories.LIST).contains(expected));
    }

    @Test
    void tenthTest() {
        // Die Frage lautet: Was ist im Hause Gutmair die Geheimzutat für ein köstliches Essen?
        // Deine Antwort hier in den String eintragen
        String geheimzutat = "";

        // Check if the geheimzutat is correct
        String expected = "cmVtb3VsYWRl";
        assertThat(processAnswer(geheimzutat)).isEqualTo(expected);
    }

    private List<String> processAnswerList(List<String> answers) {
        return answers.stream().map(this::processAnswer).toList();
    }

    private String processAnswer(String answer) {
        return new String(Base64.getEncoder().encode(
                answer.toLowerCase()
                        .replace("ä", "ae")
                        .replace("ü", "ue")
                        .replace("ö", "oe")
                        .replace("ß", "ss")
                        .replaceAll("[^a-z0-9]", "").getBytes())
        );
    }
}
