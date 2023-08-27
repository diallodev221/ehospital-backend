package dev.diallodev.ehospitalbackend.features.user;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Collection;

@Mapper
public interface UserMapper {

    @Mapping(target = "departmentDto.id", source = "department.id")
    UserDto toDto(UserEntity userEntity);

    Collection<UserDto> toDto(Collection<UserEntity> userEntities);

    @Mapping(target = "id", ignore = true)
    UserEntity toEntity(UserDto userDto);

    @Mapping(target = "id", ignore = true)
    void updateEntity(UserDto userDto, @MappingTarget UserEntity userEntity);
}
