package co.Proyecto_Backendll.domain.repository;

import co.Proyecto_Backendll.domain.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findAll();

    Enrollment save(Enrollment enrollment);

    void deleteById(Long id);

    default Optional<Enrollment> update(Enrollment enrollment) {
        return Optional.of(save(enrollment));
    }

    default boolean existsByEnrollmentId(Long enrollmentId) {
        return existsById(enrollmentId);
    }

}
