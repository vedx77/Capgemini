import java.util.Scanner;
public class UI_SDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //studentDetailsConstructor stud = new studentDetailsConstructor();

        System.out.println("Enter Student's Id");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Name");
        String studentName = sc.nextLine();

        System.out.println("Enter Student's Address");
        String studentAddress = sc.nextLine();

        String response;
        while (true){

            System.out.println("Whether the student is from NIT(Yes/No):");
            response = sc.nextLine().trim().toLowerCase();
            if (response.equals("yes")){
                StudentDetailsConstructor stud = new StudentDetailsConstructor(studentId, studentName, studentAddress);
                displayStudentDetails(stud);
                break;
            } else if (response.equals("no")) {
                System.out.println("Enter the College Name");
                String collegeName = sc.nextLine();
                StudentDetailsConstructor stud = new StudentDetailsConstructor(studentId, studentName, studentAddress, collegeName);
                displayStudentDetails(stud);
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
    public static void displayStudentDetails(StudentDetailsConstructor stud){
        System.out.println("\nStudent id:" + stud.getStudentId()
                + "\nStudent name:" + stud.getStudentName()
                + "\nAddress:" + stud.getStudentAddress()
                + "\nCollege name:" + stud.getCollegeName());
    }
}