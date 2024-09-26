package br.com.danilo;

public class Palindrome {

    public static void main(String[] args) {
        String word = "tenet";
        //Scanner input = new Scanner(System.in);
        //word = input.nextLine();

        //long start = new Date().getTime();
        //Thread.sleep(200);
        boolean result = isPalindrome(word);
        System.out.println(result);
        //System.out.println(new Date().getTime() - start + " ms");
    }

    public static boolean isPalindrome(String word) {
        int wordLen = word.length();
        for(int i = 0; i < wordLen; i++) {
            if(word.charAt(i) != word.charAt(wordLen - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
