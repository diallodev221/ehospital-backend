package dev.diallodev.ehospitalbackend.features.department;

import dev.diallodev.ehospitalbackend.utils.CodeGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;


    public Collection<DepartmentDto> getAll() {
        return departmentMapper.toDto(departmentRepository.findAll());
    }

    public ResponseEntity<DepartmentDto> create(DepartmentDto departmentDto) {
        DepartmentEntity departmentEntity = departmentMapper.toEntity(departmentDto);
        departmentEntity.setCode(CodeGenerator.generateCode("DEPT-"));
        departmentRepository.save(departmentEntity);
        return ResponseEntity.ok().body(departmentMapper.toDto(departmentEntity));
    }

    public DepartmentDto getById(Integer departmentId) {
        DepartmentEntity departmentEntity = loadEntity(departmentId);
        return departmentMapper.toDto(departmentEntity);
    }

    public ResponseEntity<Void> update(Integer id, DepartmentDto departmentDto) {
        DepartmentEntity departmentEntity = loadEntity(id);
        departmentMapper.updateEntity(departmentDto, departmentEntity);
        departmentMapper.toDto(departmentRepository.save(departmentEntity));
        return ResponseEntity.ok().build();
    }
    public DepartmentEntity loadEntity(Integer id) {
        return departmentRepository.findById(id).orElseThrow();
    }
}
