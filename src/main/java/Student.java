import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public long getId(){
        return this.id;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double num = 0;
        for(int grade : this.grades) {
            num += grade;
        }
        return num / this.grades.size();
    }
}
