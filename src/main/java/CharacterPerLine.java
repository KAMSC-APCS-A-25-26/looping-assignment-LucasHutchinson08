import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("Each character on a new line:");

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}
