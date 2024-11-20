import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class test {
    @Test
    public void IceCreamFlavour(){
        IceCreamFlavour ice= new IceCreamFlavour();
        double i= ice.getPricePerScoop();
        double expectedOutput=0.00;
        assertEquals(expectedOutput, i,1.0);
    }

    @Test
    public void Mint(){
        MintChocolateChip ice= new MintChocolateChip();
        double i= ice.getPricePerScoop();
        double expectedOutput=2.80;
        assertEquals(expectedOutput, i,1.0);
    }

    @Test
    public void ChocolateFudge(){
        ChocolateFudge ice= new ChocolateFudge();
        double i= ice.getPricePerScoop();
        double expectedOutput=3.00;
        assertEquals(expectedOutput, i,1.0);
    }


}
