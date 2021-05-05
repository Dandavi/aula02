import static junit.framework.TestCase.assertFalse;
import org.junit.Test;
import java.util.ArrayList;
import com.es20.palindromo.Palindromo;

public class PalindromoTest {

    @Test
    public void PalindromoSucessoTest() {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Rotator");
        lista.add("bob");
        lista.add("madam");
        lista.add("mAlAyAlam");
        lista.add("1");
        lista.add("Able was I, ere I saw Elba");
        lista.add("Madam I’m Adam");
        lista.add("Step on no pets.");
        lista.add("Top spot!");
        lista.add("02/02/2020");
        lista.add("xyz");
        lista.add("elephant");
        lista.add("Country");
        lista.add("Top . post!");
        lista.add("Wonderful-fool");
        lista.add("Wild imagination!");

        for (String a : lista) {
            assertFalse(new Palindromo().LogicaPalindromo(a));

        }
    }
}
