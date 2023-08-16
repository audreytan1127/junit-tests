import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student() {
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getID() {
        this.id = id;
        return id;
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public int addGrade(int grade) {
        this.grades.add(grade);
        return grade;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
            int sumOfGrades = 0;
            for (Integer grade : grades) {
                sumOfGrades += grade;
            }
            double averageGrade = (double) sumOfGrades / grades.size();
            return averageGrade;
    }


}
