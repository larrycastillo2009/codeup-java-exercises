import java.util.Scanner;

public class HighLow {
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Number not between 1-10. Enter another number: ");
        return getInteger(1,10);
    }



public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to my number guessing game!");
    double mynumber = Math.floor(Math.random()*100);
    int myInt = (int)mynumber;
    int guess = 1;
    System.out.println("Guess my number!");

    int userInput;
        do {
            System.out.println("Choose a number between 1-100:");
            userInput =sc.nextInt();
            if(userInput > myInt){
                System.out.println("LOWER");
                guess++;
            }else if(userInput < myInt){
                System.out.println("Higher");
                guess++;
            }else{
                System.out.println("GOOD GUESS");
                System.out.println("You found my number in " + guess + " guesses!");

            }
        } while (userInput != myInt);




}
}

