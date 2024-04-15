package com.example.project;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Inserta el primer anagrama: ");
            String str1 = input.nextLine();
            System.out.print("Inserta el segundo anagrama: ");
            String str2 = input.nextLine();

            boolean resultado = sonAnagrama(str1, str2);
            if (resultado) {
                System.out.println(str1 + " y " + str2 + " son anagramas.");
            } else {
                System.out.println(str1 + " y " + str2 + " no son anagramas.");
            }
        }
    }

    static boolean sonAnagrama(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        } else {
            return false;
        }
    }
}

