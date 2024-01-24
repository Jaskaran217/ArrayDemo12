
package arraydemo;

/**
 *
 * @author jasba
 */
public class PartTimeStudent extends Student {
    private int numOfCourses;

    public PartTimeStudent(int sId, String sname) {
        super(sId, sname);
        this.numOfCourses = numOfCourses;
    }    
    
    public int getNumOfCourses(){
        return numOfCourses;
    }
    
    public void setNumOfCourses (int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
}
