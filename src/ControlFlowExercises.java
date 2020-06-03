import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[]arg) {
//        Exercise 1 A
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("");
//            1B
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

        System.out.println("");

//        1C
        for (int y = 5; y <= 15; y++) {
            System.out.println(y);
        }
        for (int k = 0; k <= 100; k += 2) {
            System.out.println(k);
        }
        System.out.println("");

//        exercise 2 fizzbuzz
        for (int h = 1; h <= 100; h++) {
            if (h % 5 == 0 && h % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (h % 5 == 0) {
                System.out.println("Buzz");
            } else if (h % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(h);
            }
        }

//        exercise 3
        Scanner sc = new Scanner(System.in);
        String a;
        do {
            System.out.println("What number would you like to go up to?");
            int userInput = sc.nextInt();

            System.out.println("Here is your table!");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------  | ------");

            for (int f = 1; f <= userInput; f++) {
                int number = f;
                int squared = f * f;
                int cubed = f * f * f;

                System.out.printf("%d      | %d       | %d", number, squared, cubed);
                System.out.println("");
            }

            sc.nextLine();
            System.out.println("Would you like to continue?(y/n)");
            a = sc.next();

        } while (a.equals("y") | a.equals("y"));


//            Exercise 4
        String answer2;
        do {
            System.out.println("Enter a grade(0-100): ");
            int grade = sc.nextInt();
            if (grade >= 88) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 67) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else if (grade >= 0) {
                System.out.println("F");
            }


            System.out.println("Would you like to continue?(y/n)");
            answer2 = sc.next();
        } while (answer2.equals("Y") || answer2.equals("y"));


    }

    }

