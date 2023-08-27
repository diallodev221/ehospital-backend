package dev.diallodev.ehospitalbackend.features.user;

import dev.diallodev.ehospitalbackend.features.department.DepartmentDto;
import dev.diallodev.ehospitalbackend.features.department.DepartmentEntity;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.DepartmentDto( departmentEntityToDepartmentDto( userEntity.getDepartment() ) );
        userDto.id( userEntity.getId() );
        userDto.code( userEntity.getCode() );
        userDto.firstName( userEntity.getFirstName() );
        userDto.lastName( userEntity.getLastName() );
        userDto.username( userEntity.getUsername() );
        userDto.password( userEntity.getPassword() );
        userDto.address( userEntity.getAddress() );
        userDto.status( userEntity.getStatus() );
        userDto.role( userEntity.getRole() );

        return userDto.build();
    }

    @Override
    public Collection<UserDto> toDto(Collection<UserEntity> userEntities) {
        if ( userEntities == null ) {
            return null;
        }

        Collection<UserDto> collection = new ArrayList<UserDto>( userEntities.size() );
        for ( UserEntity userEntity : userEntities ) {
            collection.add( toDto( userEntity ) );
        }

        return collection;
    }

    @Override
    public UserEntity toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder<?, ?> userEntity = UserEntity.builder();

        userEntity.code( userDto.code() );
        userEntity.firstName( userDto.firstName() );
        userEntity.lastName( userDto.lastName() );
        userEntity.username( userDto.username() );
        userEntity.password( userDto.password() );
        userEntity.address( userDto.address() );
        userEntity.status( userDto.status() );
        userEntity.role( userDto.role() );

        return userEntity.build();
    }

    @Override
    public void updateEntity(UserDto userDto, UserEntity userEntity) {
        if ( userDto == null ) {
            return;
        }

        userEntity.setCode( userDto.code() );
        userEntity.setFirstName( userDto.firstName() );
        userEntity.setLastName( userDto.lastName() );
        userEntity.setUsername( userDto.username() );
        userEntity.setPassword( userDto.password() );
        userEntity.setAddress( userDto.address() );
        userEntity.setStatus( userDto.status() );
        userEntity.setRole( userDto.role() );
    }

    protected DepartmentDto departmentEntityToDepartmentDto(DepartmentEntity departmentEntity) {
        if ( departmentEntity == null ) {
            return null;
        }

        DepartmentDto.DepartmentDtoBuilder departmentDto = DepartmentDto.builder();

        departmentDto.id( departmentEntity.getId() );
        departmentDto.name( departmentEntity.getName() );

        return departmentDto.build();
    }
}
