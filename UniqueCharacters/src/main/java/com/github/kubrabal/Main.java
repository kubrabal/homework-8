package com.github.kubrabal;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String textExample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id erat vehicula purus efficitur euismod id nec velit. Curabitur mattis, lectus eu viverra fermentum, risus massa tristique neque, eget facilisis mauris dolor eget lectus. Curabitur eu tortor vulputate, faucibus urna quis, varius leo. Proin mi nunc, convallis ac rutrum sed, semper in diam.";

        UniqueCharactersFinder finder = new UniqueCharactersFinder();

        Set<Character> result = finder.findUniqueCharacters(textExample);

        System.out.print("Benzersiz karakter kümesi: ");

        for (char c : result) {
            System.out.print(c + " ");
        }

    }
}