import java.util.ArrayList;

public class Student extends Person {
    Professor teacher;
    int Intelligence = 80;
    ArrayList<Integer> grades = new ArrayList<Integer>(0);
    int coursegrade;

    public Student(Professor teacher,String name, int Intelligence){

        this.teacher = teacher;
        this.name = name;
        this.Intelligence = Intelligence;

    }

    public void take(Exam test){
        grades.add(Intelligence/ test.hardness);
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void setfinalGrade(int grade){
        this.coursegrade = grade;
    }
    @Override
    public String toString() {
        return String.format("Name: " + name + " " + "Grade: " + coursegrade);
    }


}