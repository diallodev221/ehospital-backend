package dev.diallodev.ehospitalbackend.features.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/api/users")
public interface UserApi {

    @GetMapping
    Collection<UserDto> getAll();

    @GetMapping("/{id}")
    UserDto getById(@PathVariable Integer id);

    @GetMapping("/username/{username}")
    UserDto getByUsername(@PathVariable String username);

    @PostMapping
    ResponseEntity<UserDto> create(@RequestBody UserDto userDto);

    @PutMapping("/{id}")
    ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody UserDto userDto);

    @PutMapping("/{id}/status")
    ResponseEntity<Void> changeStatus(@PathVariable Integer id, @RequestParam UserStatusEnum status);
}
