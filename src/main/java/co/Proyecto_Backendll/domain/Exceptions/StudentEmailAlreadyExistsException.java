package co.Proyecto_Backendll.domain.Exceptions;

public class StudentEmailAlreadyExistsException extends BusinessException {

    public StudentEmailAlreadyExistsException(String email) {
        super("Student already exists with email: " + email);
    }

}
