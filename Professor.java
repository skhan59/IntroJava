import java.util.ArrayList;

public class Professor extends Person{

    public Professor(String name, int Intelligence){
        this.name = name;
        this.Intelligence = Intelligence;

    }

    public Exam makeExam(int hard){

        Exam exam = new Exam(hard);
        return exam;

    }

    public void grade(Student student){
        ArrayList<Integer> theGrades = student.getGrades();
        int score = 0;
        for (int i = 0; i <theGrades.size();i++){
            score += theGrades.get(i);
        }
        int finalscore = score/ theGrades.size();

        student.setfinalGrade(finalscore);

    }
}