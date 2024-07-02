import org.example.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculTest {

    GradingCalculator gradingCalculator;
    @Test
    public void TestGradingCalculatorWhenGradingCalculator_95_90_ThenNote_A () {
        int score = 95;
        int presence = 90;
        char resultatAttendu= 'A';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resultatAttendu,result);

    }

    public void TestGradingCalcultorWhenGradingCalculator_85_90_ThenNote_B () {
        int score = 85;
        int presence = 90;
        char resulatAttendu = 'B';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resulatAttendu,result);

    }

    public void TestGradingCalcultorWhenGradingCalculator_65_90_ThenNote_C () {
        int score = 65;
        int presence = 90;
        char resulatAttendu = 'C';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resulatAttendu,result);

    }

    public void TestGradingCalcultorWhenGradingCalculator_95_65_ThenNote_B () {
        int score = 95;
        int presence = 65;
        char resulatAttendu = 'B';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resulatAttendu,result);

    }

    public void TestGradingCalcultorWhenGradingCalculator_95_55_ThenNote_F () {
        int score = 95;
        int presence = 55;
        char resulatAttendu = 'F';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resulatAttendu,result);

    }

    public void TestGradingCalcultorWhenGradingCalculator_65_55_ThenNote_F () {
        int score = 65;
        int presence = 55;
        char resulatAttendu = 'F';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resulatAttendu,result);

    }

    public void TestGradingCalcultorWhenGradingCalculator_50_90_ThenNote_F () {
        int score = 50;
        int presence = 90;
        char resulatAttendu = 'F';

        gradingCalculator = new GradingCalculator(score, presence) ;

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals(resulatAttendu,result);

    }
}
