package dev.diallodev.ehospitalbackend.features.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
public class UserControllerApi implements UserApi {

    private final UserService service;

    @Override
    public Collection<UserDto> getAll() {
        return service.getAll();
    }

    @Override
    public UserDto getById(Integer id) {
        return service.getById(id);
    }

    @Override
    public UserDto getByUsername(String username) {
        return service.getByUsername(username);
    }

    @Override
    public ResponseEntity<UserDto> create(UserDto userDto) {
        return service.create(userDto);
    }

    @Override
    public ResponseEntity<Void> update(Integer id, UserDto userDto) {
        return service.update(id, userDto);
    }

    @Override
    public ResponseEntity<Void> changeStatus(Integer id, UserStatusEnum status) {
        return service.changeStatus(id, status);
    }
}
