package co.Proyecto_Backendll.application.service;

import co.Proyecto_Backendll.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student createStudent(Student student);

    Optional<Student> updateStudent(Student student);

    void deleteStudentById(Long id);

    boolean existsByEmail(String email);

}
