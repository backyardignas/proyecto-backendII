package co.Proyecto_Backendll.application.service.Impl;

import co.Proyecto_Backendll.application.service.CourseService;
import co.Proyecto_Backendll.domain.Course;
import co.Proyecto_Backendll.domain.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    protected final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseByName(String name) {
        return courseRepository.findByName(name);
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Optional<Course> updateCourse(Course course) {
        return courseRepository.update(course);
    }

    @Override
    public void deleteCourseById(Long id) {
        if (courseRepository.findById(id).isPresent()) {
            courseRepository.deleteById(id);
        }
    }

    @Override
    public Course existsByCourseId(Course course) {
        if (course.getId() != null && courseRepository.findById(course.getId()).isPresent()) {
            return courseRepository.findById(course.getId()).get();
        }
        return courseRepository.save(course);
    }

    @Override
    public Course save(Course course) {
        return createCourse(course);
    }

}
