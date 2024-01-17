package arraydemo;

/**
 *
 * @author jasba
 */
public class studentList {
    public static void main(String [] args) {
        Student [] studentList = new Student[3];
    
        studentList[0] = s1;
        studentList[1] = new Student(2, "abc");
        studentList[2] = new Student(3, "xyz");
        
        for(int i = 0; i <studentList.length; i++)
        {
            System.out.println(studentList[i].getSname());
        }
    }
}
