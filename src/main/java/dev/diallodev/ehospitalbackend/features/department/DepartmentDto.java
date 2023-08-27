package dev.diallodev.ehospitalbackend.features.department;

import lombok.Builder;

@Builder
public record DepartmentDto (Integer id, String name){
}
