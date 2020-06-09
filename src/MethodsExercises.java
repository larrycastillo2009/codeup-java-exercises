
import java.util.Scanner;


public class MethodsExercises {
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2){
        return num1 / num2;
    }
    public static int modulus(int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Number not between 1-10. Enter another number: ");
         return getInteger(1,10);
    }
    public static long factorial(int num1){
        long res =1;
        String fact= "";
        for(int j = 1; j <= num1; j++){
            res *= j;
            if(j == 1){
                String sfact = "" + j + "! = ";
                fact += j;
                System.out.println(sfact + fact + " = " + res);
            }else{
                String sfact="" + j + "! = ";
                fact += " X " + j;
                System.out.println(sfact + fact + " = " + res);

            }

        }
        return res;
    }

    public static int dice(int sides){
        double a = Math.floor(Math.random() * sides);
        int c = (int)a;


        return c;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(add(1, 1));
        System.out.println(subtract(5,4));
        System.out.println(multiply(6,4));
        System.out.println(divide(8,2));
        System.out.println(modulus(8,5));

        String answer;
        do{
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = getInteger(1,10);
            factorial(userInput);
            System.out.println("Would you like to continue?(y/n)");
            answer = sc.next();
        }while(answer.equals("Y") || answer.equals("y"));

        System.out.println("Welcome to my dice game!");
        String answer2;
        do{
            System.out.println("How many sides would you like the dice to have: ");
            int userInput2 = sc.nextInt();
            System.out.println("Roll the dice?(y/n)");
            String userChoice =sc.next();
            if(userChoice.equals("y")|userChoice.equals("Y")){
                System.out.println("First Result: " + dice(userInput2));
                System.out.println("Second Result: " + dice(userInput2));
                dice(userInput2);
            }
            System.out.println("Would you like to continue?(y/n)");
            answer2 = sc.next();
        }while(answer2.equals("Y") || answer2.equals("y"));





    }
}
