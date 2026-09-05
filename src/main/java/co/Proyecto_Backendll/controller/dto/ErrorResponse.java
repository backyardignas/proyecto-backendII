package co.Proyecto_Backendll.controller.dto;

public record ErrorResponse(String message) {

    public static ErrorResponse of(String message) {
        return new ErrorResponse(message);
    }

}
