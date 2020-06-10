package util;

import java.util.Scanner;

public class input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        if(scanner.nextLine().equals("yes")| scanner.nextLine().equals("y")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
            int userNum = scanner.nextInt();
            if(userNum >= min && userNum <= max){
                return userNum;
            }
        System.out.println("Integer not between min and max. Enter integer: ");
            return getInt(min,max);
        }

    public double getDouble(double min, double max){
        double userNum = scanner.nextDouble();
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Double not between min and max. Enter another double: ");
        return getDouble(min,max);
    }

    public double getdouble(){
        return this.scanner.nextDouble();
    }
}
