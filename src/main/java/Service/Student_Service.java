package Service;

import java.util.List;

import Model.Student;

/**
 * Here, we are creating a service layer interface that acts as a bridge between DAO and Entity classes.
 * @author manish
 *
 */
public interface Student_Service {
	public boolean saveStudent(Student student);  
    public List<Student> getStudents();  
    public boolean deleteStudent(Student student);  
    public List<Student> getStudentByID(Student student);  
    public boolean updateStudent(Student student); 
}
