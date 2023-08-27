package dev.diallodev.ehospitalbackend.features.department;

import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDto toDto(DepartmentEntity departmentEntity) {
        if ( departmentEntity == null ) {
            return null;
        }

        DepartmentDto.DepartmentDtoBuilder departmentDto = DepartmentDto.builder();

        departmentDto.id( departmentEntity.getId() );
        departmentDto.name( departmentEntity.getName() );

        return departmentDto.build();
    }

    @Override
    public Collection<DepartmentDto> toDto(Collection<DepartmentEntity> departmentEntities) {
        if ( departmentEntities == null ) {
            return null;
        }

        Collection<DepartmentDto> collection = new ArrayList<DepartmentDto>( departmentEntities.size() );
        for ( DepartmentEntity departmentEntity : departmentEntities ) {
            collection.add( toDto( departmentEntity ) );
        }

        return collection;
    }

    @Override
    public DepartmentEntity toEntity(DepartmentDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        DepartmentEntity.DepartmentEntityBuilder<?, ?> departmentEntity = DepartmentEntity.builder();

        departmentEntity.name( userDto.name() );

        return departmentEntity.build();
    }

    @Override
    public void updateEntity(DepartmentDto departmentDto, DepartmentEntity departmentEntity) {
        if ( departmentDto == null ) {
            return;
        }

        departmentEntity.setName( departmentDto.name() );
    }
}
