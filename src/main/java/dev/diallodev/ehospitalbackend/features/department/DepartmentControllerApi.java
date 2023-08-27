package dev.diallodev.ehospitalbackend.features.department;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
public class DepartmentControllerApi implements DepartmentApi {

    private final DepartmentService departmentService;

    @Override
    public Collection<DepartmentDto> getAll() {
        return departmentService.getAll();
    }

    @Override
    public DepartmentDto getById(Integer id) {
        return departmentService.getById(id);
    }

    @Override
    public ResponseEntity<DepartmentDto> create(DepartmentDto departmentDto) {
        return departmentService.create(departmentDto);
    }

    @Override
    public ResponseEntity<Void> update(Integer id, DepartmentDto departmentDto) {
        return departmentService.update(id,departmentDto);
    }
}
