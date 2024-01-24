package arraydemo;

/**
 * First Commit
 * @author jasba
 */
public class Student {
    private int sId;

    public int getsId() {
        return sId;
    }

    public Student(int sId, String sname) {
        this.sId = sId;
        this.sname = sname;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    private String sname;
}

