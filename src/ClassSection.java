import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList<>();
    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity =  capacity;
        this.yearLevel = yearLevel;

    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String s){
        subject = s;

    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int i){
        capacity = i;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int i){
        yearLevel = i;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        if(student.getYearLevel() == yearLevel && !students.contains(student)) {
            students.add(student);
        }
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public boolean isStudentEnrolled(Student student){
        if(students.contains(student)){
            return true;
        }
        else{
            return false;
        }

    }
    public String toString(){
        String s = "";
        if(!students.isEmpty()) {
            for (Student str : students) {
                s += str.getFirstName() + " " + str.getLastName() + ", ";
            }
            s = s.substring(0, s.length() - 2);
        }
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=[" +s + "]}";
    }

}
