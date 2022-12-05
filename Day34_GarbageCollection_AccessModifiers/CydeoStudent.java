package Day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    public String studentname;
public static String schoolName;
public CydeoStudent(String studentname){
    this.studentname=studentname;
}
static {
    schoolName="Cydeo School";
        }
}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Jimmy");
        CydeoStudent student2=new CydeoStudent("Hasan");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }

}
