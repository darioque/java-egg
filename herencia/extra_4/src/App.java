import entities.Staff;
import enumerators.Area;
import services.StaffService;
import services.StudentService;
import services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        

        Staff staff = new Staff("Juan", "Perez", "123456789", enumerators.MaritalStatus.SINGLE, 2010, 1, enumerators.Area.ADMISSIONS);
        StaffService ss = new StaffService();


    }
}
