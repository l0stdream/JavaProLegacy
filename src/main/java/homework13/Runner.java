package homework13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Runner {

    public int calcJewelStones(String jewels, String stones) {
        HashSet<Character> jewelBox = new HashSet<>(jewels.length());
        for (char gem : jewels.toCharArray()) {
            jewelBox.add(gem);
        }
        int counter = 0;

        for (char stone : stones.toCharArray()) {
            if (jewelBox.contains(stone)) {
                counter++;
            }
        }
        return counter;
    }


    public int calcGoodPairs(int[] nums) {
        Map<Integer, Integer> numbersFrequency = new HashMap<>();
        int counter = 0;
        for (int currentNumber : nums) {
            counter += numbersFrequency.getOrDefault(currentNumber, 0);
            numbersFrequency.put(currentNumber, numbersFrequency.getOrDefault(currentNumber, 0) + 1);
        }
        return counter;
    }


    public int calcCoincidences(String text) {
        String requiredWord = "balloon";
        int counter = 0;
        HashMap<Character, Integer> inputTextByChars = new HashMap<>();
        for (Character currentChar : text.toCharArray())
            inputTextByChars.put(currentChar, inputTextByChars.getOrDefault(currentChar, 0) + 1);

        while (true) {
            for (char currentChar : requiredWord.toCharArray()) {
                if (inputTextByChars.getOrDefault(currentChar, 0) > 0) {
                    inputTextByChars.put(currentChar, inputTextByChars.get(currentChar) - 1);
                } else {
                    return counter;
                }
            }
            counter++;
        }
    }
}
