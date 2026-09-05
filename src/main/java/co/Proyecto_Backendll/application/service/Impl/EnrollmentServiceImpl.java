package co.Proyecto_Backendll.application.service.Impl;

import co.Proyecto_Backendll.application.service.EnrollmentService;
import co.Proyecto_Backendll.domain.Enrollment;
import co.Proyecto_Backendll.domain.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    protected final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Optional<Enrollment> findByName(String name) {
        return enrollmentRepository.findByName(name);
    }

    @Override
    public Enrollment save(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public void deleteById(Long id) {
        enrollmentRepository.deleteById(id);
    }

    @Override
    public Optional<Enrollment> update(Enrollment enrollment) {
        return enrollmentRepository.update(enrollment);
    }

    @Override
    public boolean existsByEnrollmentId(Long enrollmentId) {
        return enrollmentRepository.existsByEnrollmentId(enrollmentId);
    }

}
