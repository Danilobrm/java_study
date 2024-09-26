import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String word = "tenet";
        //Scanner input = new Scanner(System.in);
        //word = input.nextLine();

        //long start = new Date().getTime();
        //Thread.sleep(200);
        boolean result = isPalindrome(word);
        //System.out.println(new Date().getTime() - start + " ms");
    }

    public static boolean isPalindrome(String word) {
        int wordLen = word.length();
        for(int i = 0; i < wordLen; i++) {
            if(word.charAt(i) != word.charAt(wordLen - 1 - i)) {
                return false;
            };
        }

        return true;
    }

}

