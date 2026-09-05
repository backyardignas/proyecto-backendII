package co.Proyecto_Backendll.application.service;

import co.Proyecto_Backendll.domain.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {

    List<Enrollment> findAll();

    Enrollment save(Enrollment enrollment);

    void deleteById(Long id);

    Optional<Enrollment> update(Enrollment enrollment);

    boolean existsByEnrollmentId(Long enrollmentId);

}
