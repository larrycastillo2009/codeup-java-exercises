import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class ConsoleExercises {
    public static  void main(String[] args){
//        1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.",pi);


//                2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int nextInt = sc.nextInt();
        System.out.println(nextInt);

        System.out.println("Enter three words: ");
        String wordone = sc.next();
        String wordtwo = sc.next();
        String wordthree = sc.next();

        System.out.println(wordone);
        System.out.println(wordtwo);
        System.out.println(wordthree);
        sc.nextLine();
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println(sentence);

//        3
        System.out.println("enter the length and width of code up class room:");
        String length = sc.nextLine();
        String width = sc.nextLine();
        int parameter = parseInt(length) + parseInt(width);
        int area = parseInt(length) * parseInt(width);
        System.out.print(parameter);
        System.out.print(2 * area);
    }
}
