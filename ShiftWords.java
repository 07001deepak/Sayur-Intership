// For each word in the odd position, move each letter in the word by the number of positions mentioned in the key.
// For words in the even position, reverse the word and then do the same as the odd position

// Eg - Key 2, input sentence "I am the King"
// Output K oc vjg ipkM

import java.util.Scanner;

public class ShiftWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        
        String words[] = sentence.split(" ");
        StringBuilder transformedSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i % 2 == 0) {
                word = new StringBuilder(word).reverse().toString();
            }
            
            StringBuilder transformedWord = new StringBuilder();

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char transformedChar = (char) (base + (c - base + key) % 26);
                    transformedWord.append(transformedChar);
                } else {
                    transformedWord.append(c);
                }
            }
            
            transformedSentence.append(transformedWord.toString()).append(" ");
        }

        System.out.println("Shifted output " + transformedSentence.toString().trim());
    }
}


// Output:

// Enter the key: 2
// Enter the sentence: I am deepak
// Shifted output: K co mcrggf