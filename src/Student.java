public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount =1;
    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        id= studentCount++;
        ;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String s){
        firstName = s;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String s){
        lastName = s;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        age = i;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int i){
        yearLevel = i;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public boolean equals(Student student){
        if(firstName.equals(student.firstName) && lastName.equals(student.lastName) && age == student.age && yearLevel == student.yearLevel){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age +"}";

    }

}
