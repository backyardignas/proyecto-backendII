package co.Proyecto_Backendll.domain.repository;

import co.Proyecto_Backendll.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAll();

    Optional<Course> findByName(String name);

    Course save(Course course);

    void deleteById(Long id);

    Optional<Course> findById(Long id);

    default Optional<Course> update(Course course) {
        return Optional.of(save(course));
    }

    default boolean existsByCourseId(Long courseId) {
        return existsById(courseId);
    }

}
