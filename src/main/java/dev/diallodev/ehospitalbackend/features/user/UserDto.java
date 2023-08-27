package dev.diallodev.ehospitalbackend.features.user;

import lombok.Builder;


@Builder
public record UserDto (
         Integer id,

         String code,
         String firstName,

         String lastName,
         String username,
         String password,

         String address,

         UserStatusEnum status,

         Role role,

         dev.diallodev.ehospitalbackend.features.department.DepartmentDto DepartmentDto
) {
}
