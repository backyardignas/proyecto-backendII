package co.Proyecto_Backendll.application.service;

import co.Proyecto_Backendll.domain.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    List<Course> getAllCourses();

    Optional<Course> getCourseByName(String name);

    Course createCourse(Course course);

    Optional<Course> getCourseById(Long id);

    Optional<Course> updateCourse(Course course);

    void deleteCourseById(Long id);

    Course existsByCourseId(Course course);

    Course save(Course course);

}
