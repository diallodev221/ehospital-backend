package dev.diallodev.ehospitalbackend.features.department;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/api/departments")
public interface DepartmentApi {

    @GetMapping
    Collection<DepartmentDto> getAll();

    @GetMapping("/{id}")
    DepartmentDto getById(@PathVariable Integer id);

    @PostMapping
    ResponseEntity<DepartmentDto> create(@RequestBody DepartmentDto departmentDto);

    @PutMapping("/{id}")
    ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody DepartmentDto departmentDto);
}
