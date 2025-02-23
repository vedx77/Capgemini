public class StudentDetailsConstructor {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public StudentDetailsConstructor(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public StudentDetailsConstructor(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    //GETTERS
    //studentId
    public int getStudentId(){
        return studentId;
    }
    //studentAddress
    public String getStudentAddress(){
        return studentAddress;
    }
    //studentName
    public String getStudentName(){
        return studentName;
    }
    //collegeName
    public String getCollegeName(){
        return collegeName;
    }

/*
    //SETTERS
    public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
 */
}