package co.Proyecto_Backendll.application.service.Impl;

import co.Proyecto_Backendll.application.service.StudentService;
import co.Proyecto_Backendll.domain.Student;
import co.Proyecto_Backendll.domain.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    protected final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> updateStudent(Student student) {
        if (student == null || student.getId() == null) {
            return Optional.empty();
        }

        return studentRepository.findById(student.getId())
                .map(existingStudent -> studentRepository.save(student));
    }

    @Override
    public void deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        }
    }

    @Override
    public boolean existsByEmail(String email) {
        return studentRepository.existsByEmail(email);
    }

}
