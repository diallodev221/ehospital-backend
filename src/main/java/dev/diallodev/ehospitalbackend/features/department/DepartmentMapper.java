package dev.diallodev.ehospitalbackend.features.department;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Collection;

@Mapper
public interface DepartmentMapper {

//    @Mapping(target = "departmentDto.id", source = "department.id")
    DepartmentDto toDto(DepartmentEntity departmentEntity);

    Collection<DepartmentDto> toDto(Collection<DepartmentEntity> departmentEntities);

    @Mapping(target = "id", ignore = true)
    DepartmentEntity toEntity(DepartmentDto userDto);

    @Mapping(target = "id", ignore = true)
    void updateEntity(DepartmentDto departmentDto, @MappingTarget DepartmentEntity departmentEntity);
}
