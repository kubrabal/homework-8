package com.github.kubrabal;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersFinder {

    public Set<Character> findUniqueCharacters(String text) {
        // Tüm karakterlerin tekrar edilebilirliğini kontrol et
        if (text.chars().distinct().count() == text.length()) {
            return new HashSet<>();
        }

        Set<Character> uniqueChars = new HashSet<>();

        // Gerekli iki kelimeyi bulana kadar metni dolaş
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            // İki ardışık kelimenin başındaki karakterleri kontrol et
            if (areCharactersUnique(words[i] + words[i + 1])) {
                for (char c : words[i].toCharArray()) {
                    uniqueChars.add(c);
                }
                for (char c : words[i + 1].toCharArray()) {
                    uniqueChars.add(c);
                }
                break; // İki kelime bulunduğunda döngüyü sonlandır
            }
        }

        return uniqueChars;
    }

    private static boolean areCharactersUnique(String str) {
        return str.chars().distinct().count() == str.length();
    }
}
