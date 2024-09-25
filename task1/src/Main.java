import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumWordPrinter numWordPrinter = new NumWordPrinter();


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        numWordPrinter.printWord(number);
    }
}
