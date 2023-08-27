package dev.diallodev.ehospitalbackend.features.department;

import dev.diallodev.ehospitalbackend.features.user.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Table(name = "services")
@Getter
@Setter
@Entity
@SuperBuilder
public class DepartmentEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true, updatable = false)
    private String code;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "department")
    private Set<UserEntity> users = new HashSet<>();
}
