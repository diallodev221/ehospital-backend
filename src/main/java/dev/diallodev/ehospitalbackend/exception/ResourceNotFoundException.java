package dev.diallodev.ehospitalbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ResourceNotFoundException extends ResponseStatusException {

    public ResourceNotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }
}
