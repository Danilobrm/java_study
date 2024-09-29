package br.com.danilo;
import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {
        int currentNumber = 0, givenNumber;
        Scanner input = new Scanner(System.in);
        givenNumber = input.nextInt();

        for(int earlyNumber = 1; currentNumber <= givenNumber;) {
            System.out.println(currentNumber);

            int storeCurrentNumber = earlyNumber;
            earlyNumber += currentNumber;
            currentNumber = storeCurrentNumber;
        }
    }
}
