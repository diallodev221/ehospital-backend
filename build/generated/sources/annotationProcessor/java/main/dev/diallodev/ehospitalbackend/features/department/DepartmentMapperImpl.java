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

        DepartmentEntity departmentEntity = new DepartmentEntity();

        return departmentEntity;
    }

    @Override
    public void updateEntity(DepartmentDto departmentDto, DepartmentEntity departmentEntity) {
        if ( departmentDto == null ) {
            return;
        }
    }
}
