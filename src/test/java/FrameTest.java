import org.example.Bowling.Frame;
import org.example.Bowling.IGenerateur;
import org.example.Bowling.Roll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FrameTest {


    IGenerateur iGenerateur;
    Roll roll = Mockito.mock(Roll.class);


    @Test

    public void Roll_SimpleFrame_FirstRoll_CheckScore() {

        Frame frame = new Frame(roll, false);
        int scoreExpected = 4;

        Mockito.when(roll.randomPin(10)).thenReturn(scoreExpected);

        frame.makeRoll();

        int score = frame.getScoreTotal();

        Assertions.assertEquals(scoreExpected, score);

    }

    @Test

    public void Roll_SimpleFrame_SecondRoll_CheckScore() {
        Frame frame = new Frame(roll, false);
        int scoreExpected = 5;

        //Act
        Mockito.when(roll.randomPin(10)).thenReturn(3);
        Mockito.when(roll.randomPin(7)).thenReturn(2);

        frame.makeRoll();
        frame.makeRoll();


        int score = frame.getScoreTotal() ;

        Assertions.assertEquals(scoreExpected, score);

    }

    @Test

    public void Roll_SimpleFrame_SecondRoll_FirstRollStrike_ReturnFalse() {
        Frame frame = new Frame(roll, false);

        Mockito.when(roll.randomPin(10)).thenReturn(10);

        Assertions.assertFalse(frame.makeRoll()); //On lance le MakeRoll et on renvoie le
        // resultat dans le Assert qui attend
        //une valeur False

    }

    @Test

    public void Roll_SimpleFrame_MoreRolls_ReturnFalse () {
        Frame frame = new Frame(roll, false);

        Mockito.when(roll.randomPin(10)).thenReturn(2);
        Mockito.when(roll.randomPin(8)).thenReturn(3);
        Mockito.when(roll.randomPin(5)).thenReturn(2);

        frame.makeRoll();
        frame.makeRoll();

        Assertions.assertFalse(frame.makeRoll());

    }

    @Test

    public void Roll_LastFrame_SecondRoll_FirstRollStrike_ReturnTrue () {
        Frame frame = new Frame(roll, true);

        Mockito.when(roll.randomPin(10)).thenReturn(10) ;

        Assertions.assertTrue(frame.makeRoll());
    }

    @Test

    public void Roll_LastFrame_SecondRoll_FirstRollStrick_CheckScore () {
        Frame frame = new Frame(roll, true);
        int scoreExpected = 10 ;

        Mockito.when(roll.randomPin(10)).thenReturn(10) ;

        frame.makeRoll();
        int score = frame.getScoreTotal();

        Assertions.assertEquals(scoreExpected, score);
    }

    @Test

    public void Roll_LastFrame_ThirdRoll_FirstRollStrike_ReturnTrue () {
        Frame frame = new Frame(roll, true);

        Mockito.when(roll.randomPin(10)).thenReturn(10).thenReturn(8);


        frame.makeRoll();

        Assertions.assertTrue(frame.makeRoll());

    }
}
