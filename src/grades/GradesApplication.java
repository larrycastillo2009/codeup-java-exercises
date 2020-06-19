package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student larry = new Student("Larry");
        larry.addGrade(100);
        larry.addGrade(75);
        larry.addGrade((90));

        Student terry = new Student("Terry");
        terry.addGrade(90);
        terry.addGrade(90);
        terry.addGrade((90));

        Student jerry = new Student("Jerry");
        jerry.addGrade(80);
        jerry.addGrade(85);
        jerry.addGrade((90));

        Student barry = new Student("barry");
        barry.addGrade(70);
        barry.addGrade(75);
        barry.addGrade((70));

        students.put("formularry",larry);
        students.put("pterries",terry);
        students.put("tomnjerry",jerry);
        students.put("manilow",barry);

//        System.out.println(students);
        System.out.println("Welcome to the student database!");
        System.out.println("What student would you like to see more information on?");
        System.out.println("Please select one of the following: ");
        System.out.println(students.keySet());
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (students.containsKey(userInput)){
            System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput );
            System.out.println("Current Average: " + students.get(userInput).getGradeAverage());;
            System.out.println("");
            System.out.println("Would you like to select another student?(y for yes / n for no)");
            String userInput2 = sc.nextLine();
            if (userInput2.equals("y")){
                repeat();
            }else{
                System.out.println("Goodbye!");
            }

        }else{
            System.out.println("Sorry, that doesn't match anyone in our database");
            System.out.println("Would you like to continue?(y for yes/n for no)");
            String userInput2 = sc.nextLine();
            if (userInput2.equals("y")){
                repeat();
            }else{
                System.out.println("Goodbye!");
            }

        }

    }

    public static void repeat(){
        HashMap<String, Student> students = new HashMap<>();

        Student larry = new Student("Larry");
        larry.addGrade(100);
        larry.addGrade(75);
        larry.addGrade((90));

        Student terry = new Student("Terry");
        terry.addGrade(90);
        terry.addGrade(90);
        terry.addGrade((90));

        Student jerry = new Student("Jerry");
        jerry.addGrade(80);
        jerry.addGrade(85);
        jerry.addGrade((90));

        Student barry = new Student("barry");
        barry.addGrade(70);
        barry.addGrade(75);
        barry.addGrade((70));

        students.put("formularry",larry);
        students.put("pterries",terry);
        students.put("tomnjerry",jerry);
        students.put("manilow",barry);

//        System.out.println(students);
        System.out.println("What student would you like to see more information on?");
        System.out.println("Please select one of the following: ");
        System.out.println(students.keySet());
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (students.containsKey(userInput)){
            System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput );
            System.out.println("Current Average: " + students.get(userInput).getGradeAverage());;
            System.out.println("");
            System.out.println("Would you like to see another student?(y for yes/ n for no)");
            String userInput2 = sc.nextLine();
            if (userInput2.equals("y")){
                repeat();
            }else{
                System.out.println("Goodbye!");
            }

        }else{
            System.out.println("Sorry, that doesn't match anyone in our database");
            System.out.println("Would you like to continue?(y for yes/n for no)");
            String userInput2 = sc.nextLine();
            if (userInput2.equals("y")){
                repeat();
            }else{
                System.out.println("Goodbye!");
            }

        }

    }
    }


