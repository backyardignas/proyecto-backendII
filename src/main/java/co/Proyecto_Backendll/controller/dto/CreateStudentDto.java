package co.Proyecto_Backendll.controller.dto;

import co.Proyecto_Backendll.domain.Student;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CreateStudentDto(
        @NotEmpty String firstName,
        @NotEmpty String lastName,
        @Email String email,
        @NotNull LocalDate birthDate) {

    public Student toStudent() {
        return new Student(null, firstName, lastName, email, birthDate);
    }

}
