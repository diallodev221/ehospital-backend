package dev.diallodev.ehospitalbackend.features.user;

import dev.diallodev.ehospitalbackend.features.department.DepartmentEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@RequiredArgsConstructor
@Table(name = "utilisateur")
@Entity
@Getter
@Setter
@SuperBuilder
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String code;
    private String firstName;

    private String lastName;
    @Column(unique = true)
    private String username;
    private String password;

    private String address;

    @Enumerated(EnumType.STRING)
    private UserStatusEnum status;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    private DepartmentEntity department;


}
