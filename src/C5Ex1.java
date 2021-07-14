import java.util.ArrayList;
import java.util.Collections;


public class C5Ex1 {

    public static void printCharWithMaxFrequency (String stringA) {
        stringA = stringA.toLowerCase();

        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Character> maxFreq = new ArrayList<>();

        for (int i = 0; i < stringA.length(); ++i) {
            if (!Character.isWhitespace(stringA.charAt(i))) {
                charList.add(stringA.charAt(i));
            }
        }

        Collections.sort(charList);

        int counterMax = Integer.MIN_VALUE;

        for (int i = 0; i < charList.size(); ++i) {
            int counter = 1;
            char auxChar = charList.get(i);

            for (int j = i + 1; j < charList.size(); ++j) {
                if (auxChar == charList.get(j)) {
                    counter++;
                } else {
                    break;
                }
            }

            if (counter > counterMax) {
                counterMax = counter;
                maxFreq.clear();
                maxFreq.add(auxChar);
            } else if (counter == counterMax) {
                maxFreq.add(auxChar);
            }
        }

        System.out.println("maxFreq = " + maxFreq + " ;" + " counterMax " + counterMax);
    }
}