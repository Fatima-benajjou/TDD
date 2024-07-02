import org.example.NotFoundException;
import org.example.RechercheVille;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RechercheVilleTest {


    private RechercheVille rechercheVille;

    @BeforeEach
    public void Initialise () {
        rechercheVille = new RechercheVille();
    }

    @Test

    public void TestRechercheVille_WhenContainsOnly_0_or_1_Char_ThenThrowNotFoundException() {

        String ville ="a";

        Assertions.assertThrows(NotFoundException.class,()->{rechercheVille.rechercher(ville);});
    }

    @Test

    public void TestRechercheVille_WhenVilleIs_Va_ThenReturnListVilleBeginWith_Va () {

        String ville ="Va" ;
        List<String> result = rechercheVille.rechercher(ville);
        List<String> resultVa = List.of("Valence","Vancouver");

        Assertions.assertEquals(resultVa, result);

    }

}
