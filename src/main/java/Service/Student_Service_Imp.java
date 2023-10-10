package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Student_DAO;
import Model.Student;

/**
 * service layer implementation class
 * @author manish
 *
 */
@Service
@Transactional
public class Student_Service_Imp implements Student_Service{
	
	@Autowired  
    private Student_DAO studentdao; 

	@Override
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentdao.getStudent();
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
