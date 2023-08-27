package dev.diallodev.ehospitalbackend.fake;

import dev.diallodev.ehospitalbackend.features.department.DepartmentEntity;
import dev.diallodev.ehospitalbackend.features.department.DepartmentRepository;
import dev.diallodev.ehospitalbackend.features.user.Role;
import dev.diallodev.ehospitalbackend.features.user.UserEntity;
import dev.diallodev.ehospitalbackend.features.user.UserRepository;
import dev.diallodev.ehospitalbackend.features.user.UserStatusEnum;
import dev.diallodev.ehospitalbackend.utils.CodeGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitDB implements CommandLineRunner {

    private final UserRepository userRepository;
    private final DepartmentRepository departmentRepository;


    @Override
    public void run(String... args) throws Exception {
        // create Department
        DepartmentEntity department = DepartmentEntity.builder()
                .name("Dentist")
                .code(CodeGenerator.generateCode("DEPT"))
                .build();
        departmentRepository.save(department);

        // create utilisateur
        UserEntity admin = UserEntity.builder()
                .firstName("admin")
                .lastName("admin")
                .username("diallo@exemple.com")
                .address("keur massar")
                .password("passer")
                .role(Role.ADMIN)
                .status(UserStatusEnum.ACTIVE)
                .code(CodeGenerator.generateCode("USR"))
                .department(department)
                .build();
        userRepository.save(admin);

    }
}
