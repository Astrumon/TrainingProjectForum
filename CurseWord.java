package com.skidchenko.entities;

public class CurseWord {

    public String censorShip(String word) {

        String curseWord = "fuck";
        String bufWord = word.toLowerCase();

        int firstIndex = bufWord.indexOf(curseWord);

        if (firstIndex == -1) {
            return "";
        }

        int lastIndex = bufWord.indexOf(curseWord) + curseWord.length();
        String replacementWord = (bufWord.substring(firstIndex, lastIndex)).replaceAll(curseWord, "*****");
        String result = word.substring(0, firstIndex) + replacementWord + word.substring(lastIndex);

        if (result.contains(curseWord)) {
            result = censorShip(result);
        }

        return result;
    }
}
