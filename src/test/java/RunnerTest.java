import homework13.Runner;
import org.junit.Assert;
import org.junit.Test;

public class RunnerTest {

    @Test
    public void calcJewelStonesTest() {
        Runner runner = new Runner();
        String jewels = "aA";
        String stones = "aAAbbbb";

        int expectedResult = 3;
        int result = runner.calcJewelStones(jewels, stones);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcJewelStonesWithNullTest() {
        Runner runner = new Runner();
        String jewels = null;
        String stones = "aAAbbbb";


        Assert.assertThrows(NullPointerException.class, () -> runner.calcJewelStones(jewels, stones));
    }

    @Test
    public void calcNoJewelStonesWithoutGemsInJewelsTest() {
        Runner runner = new Runner();
        String jewels = "";
        String stones = "aAAbbbb";

        int expectedResult = 0;
        int result = runner.calcJewelStones(jewels, stones);


        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcJewelStonesWithAllGemsInStonesTest() {
        Runner runner = new Runner();
        String jewels = "aA";
        String stones = "aAaAaAaA";

        int expectedResult = 8;
        int result = runner.calcJewelStones(jewels, stones);


        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcJewelStonesWithoutStonesTest() {
        Runner runner = new Runner();
        String jewels = "aA";
        String stones = "";

        int expectedResult = 0;
        int result = runner.calcJewelStones(jewels, stones);


        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcJewelNoGemsInStonesTest() {
        Runner runner = new Runner();
        String jewels = "aA";
        String stones = "bBcCdDeE";

        int expectedResult = 0;
        int result = runner.calcJewelStones(jewels, stones);


        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcGoodPairsTest() {
        Runner runner = new Runner();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expectedResult = 4;
        int result = runner.calcGoodPairs(nums);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcGoodPairsWithNullTest() {
        Runner runner = new Runner();
        int[] nums = null;

        Assert.assertThrows(NullPointerException.class, () -> runner.calcGoodPairs(nums));
    }


    @Test
    public void calcGoodPairsWithoutPairsTest() {
        Runner runner = new Runner();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int expectedResult = 0;
        int result = runner.calcGoodPairs(nums);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcGoodPairsWithAllPairsTest() {
        Runner runner = new Runner();
        int[] nums = {1, 1, 1, 1, 1, 1};
        int expectedResult = 15;
        int result = runner.calcGoodPairs(nums);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcCoincidencesTest() {
        Runner runner = new Runner();
        String inputText = "loonbalxballpoon";

        int expectedResult = 2;
        int result = runner.calcCoincidences(inputText);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcCoincidencesWithNullTest() {
        Runner runner = new Runner();
        String inputText = null;

        Assert.assertThrows(NullPointerException.class, () -> runner.calcCoincidences(inputText));
    }

    @Test
    public void calcCoincidencesWithoutCoincidencesTest() {
        Runner runner = new Runner();
        String inputText = "testtextwithnocoincidences";

        int expectedResult = 0;
        int result = runner.calcCoincidences(inputText);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calcCoincidencesWithAllCoincidencesTest() {
        Runner runner = new Runner();
        String inputText = "balloonballoonballoonballoon";

        int expectedResult = 4;
        int result = runner.calcCoincidences(inputText);

        Assert.assertEquals(expectedResult, result);
    }

}
