package dev.diallodev.ehospitalbackend.features.user;

import dev.diallodev.ehospitalbackend.features.department.DepartmentService;
import dev.diallodev.ehospitalbackend.exception.ResourceNotFoundException;
import dev.diallodev.ehospitalbackend.utils.CodeGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final DepartmentService departmentService;
    private final UserMapper userMapper;

    public UserDto getByUsername(String username) {
        return userRepository.findByUsername(username).map(userMapper::toDto)
                .orElseThrow();
    }

    public UserDto getById(Integer id) {
        UserEntity userEntity = loadEntity(id);
        return userMapper.toDto(userEntity);
    }

    public ResponseEntity<UserDto> create(UserDto userDto) {
        UserEntity userEntity = userMapper.toEntity(userDto);
        userEntity.setStatus(UserStatusEnum.ACTIVE);
        userEntity.setRole(Role.MEDECIN);
        userEntity.setCode(CodeGenerator.generateCode("USR-"));
        userEntity.setDepartment(departmentService.loadEntity(userDto.departmentDto().id()));
        userEntity.setPassword(CodeGenerator.generatePassword());
        userRepository.save(userEntity);

        return ResponseEntity.ok().body(userMapper.toDto(userEntity));
    }

    private void sendEmail(UserEntity userEntity, String password) {

    }

    public ResponseEntity<Void> update(Integer id, UserDto userDto) {
        var userEntity = loadEntity(id);
        userMapper.updateEntity(userDto, userEntity);
        userMapper.toDto(userRepository.save(userEntity));
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> changeStatus(Integer id, UserStatusEnum status) {
        UserEntity userEntity = loadEntity(id);
        userEntity.setStatus(status);
        userRepository.save(userEntity);

        return ResponseEntity.ok().build();
    }

    public Collection<UserDto> getAll() {
        return userMapper.toDto(userRepository.findAll());
    }

    public UserEntity loadEntity(Integer entityId) {
        return userRepository.findById(entityId).orElseThrow(ResourceNotFoundException::new);
    }
}
