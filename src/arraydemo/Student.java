package arraydemo;

/**
 * First Commit
 * @author jasba
 */
public class Student {
    private int sId;
    private String sname;
    private String address;

    public int getsId() {
        return sId;
    }

    public Student(int sId, String sname) {
        this.sId = sId;
        this.sname = sname;
        this.address = address;
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
    
    public void setAddress(String address) {
        this.address= address;
    }
    
    public String getAddress() {
        return address;
    }
}

