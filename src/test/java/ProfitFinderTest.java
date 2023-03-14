import org.example.ProfitFinder;
import org.junit.Assert;
import org.junit.Test;

public class ProfitFinderTest {
    @Test
    public void calcMaxProfitTest() {
        ProfitFinder profitFinder = new ProfitFinder();

        int[] pricesTest1 = {7,1,5,3,6,4};
        int pricesExcepted1 = 5;
        int pricesActual1 = profitFinder.calcMaxProfit(pricesTest1);

        int[] pricesTest2 = {7,6,4,3,1};
        int pricesExcepted2 = 0;
        int pricesActual2 = profitFinder.calcMaxProfit(pricesTest2);

        Assert.assertEquals(pricesActual1, pricesExcepted1);
        Assert.assertEquals(pricesActual2, pricesExcepted2);
    }
}
