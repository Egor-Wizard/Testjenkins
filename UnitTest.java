import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GameLogicTest {

    @Test
    public void testCalculateScore() {
        GameLogic gameLogic = new GameLogic();
        int score = gameLogic.calculateScore(10, 2); // Приклад виклику функції для обчислення рахунку
        assertEquals(20, score, "The score should be 20");
    }
}
