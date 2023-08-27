package dev.diallodev.ehospitalbackend.features.department;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface DepartmentApi {

    @GetMapping
    Collection<DepartmentDto> getAll();

    @GetMapping("/{id}")
    DepartmentDto getById(@PathVariable Integer id);

    @PostMapping
    DepartmentDto create(@RequestBody DepartmentDto departmentDto);
}
