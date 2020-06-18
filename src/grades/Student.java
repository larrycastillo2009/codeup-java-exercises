package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grade.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(double i = 0; i < grade.size(); i++ ){
            sum += this.grade.get((int) i);
        }
        return sum / grade.size();
    }

    public static void main(String[] args) {
        Student Larry = new Student("Larry");
        Larry.addGrade(100);
        Larry.addGrade(50);
        System.out.println(Larry.getGradeAverage());
    }
}
