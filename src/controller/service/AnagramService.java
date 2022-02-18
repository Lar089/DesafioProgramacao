package controller.service;

import java.util.ArrayList;
import java.util.List;

public class AnagramService {
    private List listResult = new ArrayList<>();
    private List wordsList = new ArrayList<>();

    public int SubAnagram(String word) {
        int result = 0;
        String word1, word2;
        CreateAnagram(word);

        for (int i = 0; i < wordsList.size(); i++)
            for (int j = 0; j < wordsList.size(); j++) {
                word1 = wordsList.get(i).toString();
                word2 = wordsList.get(j).toString();

                if (word1.length() == word2.length() && i != j)
                    if (!listResult.contains(word1) && !listResult.contains(word2)) {
                        if (IsAnagram(word1, word2)) {
                            listResult.add(word1);
                            listResult.add(word2);
                            result += 1;
                        }
                    }
            }
        return result;
    }

    private void CreateAnagram(String word) {
        for (int i = 0; i <= word.length(); i++)
            for (int j = i; j <= word.length(); j++)
                if (i != j)
                    wordsList.add(word.substring(i, j));
    }


    private static boolean IsAnagram(String word1, String word2) {
        int result = 0;
        int resultCheck = 0;

        for (int i = 0; i < word1.length(); i++)
            result = word1.charAt(i) ^ result;

        for (int i = 0; i < word2.length(); i++)
            result = word2.charAt(i) ^ result;

        if (result == 0)
            for (int i = 0; i < word1.length(); i++)
                for (int j = 0; j < word2.length(); j++)
                    if (word1.charAt(i) == word2.charAt(j))
                        resultCheck++;

        if (resultCheck < word1.length())
            return false;
        return (result == 0);
    }
}
