package src.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Main.Answer;

class AnswerTest {
    @Test
    void calcTest() {
        Answer answerTest = new Answer();
        int value = answerTest.computeRPN("2 8 *" );
        Assertions.assertEquals(16., value);
    }
}