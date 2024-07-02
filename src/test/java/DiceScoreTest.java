import org.example.DiceScore;
import org.example.Ide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceScoreTest {

Ide ide = Mockito.mock(Ide.class); //On vient simuler l'interface IDE

@Test
    public void TestDiceScore_WhenFirstDiceAndSecondDice_2_ThenResult_14 () {

    //Arrange
    DiceScore diceScore = new DiceScore(ide) ; //On insctancie la classe DiceScore, avec pour parametre notre interface simulé

    Mockito.when(ide.getRoll()).thenReturn(2); //Quand on utilise la méthode getRoll de notre interface simulé, alors il renvoie 2
    int result = diceScore.getScore(); // On recupere le score de la méthode getScore dans la classe diceScore

    //ASSEr

    Assertions.assertEquals(14, result);
}

    @Test
    public void TestDiceScore_WhenFirstDiceAndSecondDice_6_ThenResult_30 () {

        //Arrange
        DiceScore diceScore = new DiceScore(ide) ; //On insctancie la classe DiceScore, avec pour parametre notre interface simulé

        Mockito.when(ide.getRoll()).thenReturn(6); //Quand on utilise la méthode getRoll de notre interface simulé, alors il renvoie 2
        int result = diceScore.getScore(); // On recupere le score de la méthode getScore dans la classe diceScore

        //ASSEr

        Assertions.assertEquals(30, result);
    }

    @Test
    public void TestDiceScoreHighest_WhenFirstDiceIs_2_AndSecondDiceIs_5_ThenResult_5 () {

        //Arrange
        DiceScore diceScore = new DiceScore(ide) ; //On insctancie la classe DiceScore, avec pour parametre notre interface simulé

        Mockito.when(ide.getRoll()).thenReturn(2).thenReturn(5); //Quand on utilise la méthode getRoll de notre interface simulé, alors il renvoie 2
        int result = diceScore.getScore(); // On recupere le score de la méthode getScore dans la classe diceScore

        //ASSEr

        Assertions.assertEquals(5, result);
    }
    }
