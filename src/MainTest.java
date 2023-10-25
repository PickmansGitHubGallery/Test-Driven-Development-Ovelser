import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
   Main main = new Main();
    @Test
    public void findOneOccencen() { //Her tester jeg om der kun er en forkomst af bogstavet e. Denne test kalder min metode og tester den.
        //Assertion.assertEquals(expeted (her skriver jeg hvilket resultat forventer når jeg kalder metoden), main.countOccenence(Det er den metode jeg tester i mainklassen)
        // (word er det argument indæstter i metoden og bogstav er det andet agument)
        Assertions.assertEquals(1,main.countOccurence("hej",'e'));
    }
    @Test
    public void notOneOccence(){ // Her tester jeg at forkomsterne ikke kun returner 1.
        Assertions.assertNotEquals(1,main.countOccurence("Hej Nisse Niels",'e'));
    }
    @Test
    public void findThreeOccences(){
        Assertions.assertEquals(3,main.countOccurence("Hej Nisse Niels",'e'));
    }
    @Test
    public void findUpperCase(){
        Assertions.assertEquals(2,main.countOccurence("Hej Nisse Niels",'I'));
    }
    @Test
    public void findRighChar(){
        Assertions.assertEquals(2,main.countOccurence("Hej NIsse NIels",'i'));
    }
    @Test
    public void ifWordIsNullReturnMinusOne(){
        Assertions.assertEquals(-1,main.countOccurence(null,'k'));
    }

}