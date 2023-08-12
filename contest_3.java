//Create a class Replace containing a method alterString 
//which accepts a String and replace all the consonants 
//in the string with immediate consonants alphabetically.

import java.util.Scanner;

class Replace{
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public String alterString(String s) {
        char[] arr = s.toCharArray(); 
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            
            if (Character.isLetter(c) && !isVowel(c)) {
                arr[i] = getNextConsonant(c);
            }
        }

        return new String(arr); 
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    private char getNextConsonant(char c) {
        c = Character.toLowerCase(c);
        while (true) {
            c++;
            if (!isVowel(c) && Character.isLetter(c)) {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Replace replacer = new Replace();
        String input = "hello world";
        String altered = replacer.alterString(input);
        System.out.println("Original: " + input);
        System.out.println("Altered: " + altered);
    }
}

public class contest_3 {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
        Replace rep = new Replace();
        String input =obj.nextLine();
        String altered = rep.alterString(input);
        System.out.println(altered);
	}
}
