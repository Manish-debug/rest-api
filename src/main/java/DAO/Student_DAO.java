package DAO;

import java.util.List;

import Model.Student;

/**
 * Here, we are creating the DAO interface to perform database related operations.
 * @author manish
 *
 */
public interface Student_DAO {

	public boolean saveStudent(Student student);
	public List<Student> getStudent();
	public boolean deleteStudent(Student student);
	public List<Student> getStudentById(Student student);
	public boolean updateStudent(Student student);
	
}
