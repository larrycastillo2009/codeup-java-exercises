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

    public int getInt(int min, int max) {
        try {
            int userNum = Integer.valueOf(this.getString());
            if (userNum >= min && userNum <= max) {
                return userNum;
            }
            System.out.println("Integer not between min and max. Enter integer: ");
            return getInt(min, max);
        } catch (Exception e){
            System.out.println("do it again");
             return getInt(min,max);
        }
    }

    public double getDouble(double min, double max){
        try{
            double userNum = Double.valueOf(this.getString());
            if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Double not between min and max. Enter another double: ");
        return getDouble(min,max);
        } catch (Exception e){
            System.out.println("wrong number. try again");
            return getDouble(min, max);
        }
    }

    public double getdouble(){
        return this.scanner.nextDouble();
    }
}
