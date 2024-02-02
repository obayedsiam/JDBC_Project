import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Student management");
        while(true){
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit api");
            int c = Integer.parseInt(br.readLine());

            if(c==1){ // Add Student

                System.out.println("Enter student name");
                String name = br.readLine();

                System.out.println("Enter student phone number");
                String phone = br.readLine();

                System.out.println("Enter student city");
                String city = br.readLine();

                Student student = new Student(name, phone, city);

                boolean result = StudentDao.insertToDatabase(student);

                if (result==true) System.out.println("successfully added");
                else System.out.println("Failed to insert");
                System.out.println(student);

            }
            else if(c==2){

            }
            else if (c==3){

            }
            else if (c==4){
                break;
            }
            else{}
        }
        System.out.println("Thank you for using my application");
    }
}
