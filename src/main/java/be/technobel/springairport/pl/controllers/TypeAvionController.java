package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.typeAvion.TypeAvionService;
import be.technobel.springairport.pl.models.typeAvion.dto.TypeAvionDto;
import be.technobel.springairport.pl.models.typeAvion.dto.TypeAvionShortDto;
import be.technobel.springairport.pl.models.typeAvion.form.TypeAvionForm;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeavion")
public class TypeAvionController {
    public final TypeAvionService typeAvionService;

    public TypeAvionController(TypeAvionService typeAvionService) {
        this.typeAvionService = typeAvionService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid TypeAvionForm form){
        typeAvionService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeAvionDto> getOne(@PathVariable long id){
        return ResponseEntity.ok(TypeAvionDto.toDto(typeAvionService.getOne(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<Page<TypeAvionShortDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(typeAvionService.getAll(pageable)
                .map(TypeAvionShortDto::toDto));
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, TypeAvionForm form){
        typeAvionService.update(id,form);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        typeAvionService.delete(id);
    }
}
