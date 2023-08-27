package dev.diallodev.ehospitalbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException ex) {
        return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(NoSuchFieldException.class)
    public ResponseEntity<Object> handleNotSuchElementException(NoSuchFieldException ex) {
        return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex) {
        return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleIllegalArgumentException(Exception ex) {
        return buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> handleIllegalArgumentException(NullPointerException ex) {
        return buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    private ResponseEntity<Object> buildResponseEntity(HttpStatus httpStatus, String errorMessage) {
        ApiError apiError = new ApiError(httpStatus, errorMessage);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
