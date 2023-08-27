package dev.diallodev.ehospitalbackend.features.user;

import dev.diallodev.ehospitalbackend.features.department.DepartmentDto;
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

         DepartmentDto departmentDto
) {
}
