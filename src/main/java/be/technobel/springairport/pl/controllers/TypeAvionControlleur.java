package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.typeAvion.TypeAvionService;
import be.technobel.springairport.pl.models.typeAvion.dto.TypeAvionDto;
import be.technobel.springairport.pl.models.typeAvion.dto.TypeAvionShortDto;
import be.technobel.springairport.pl.models.typeAvion.form.TypeAvionForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeavion")
public class TypeAvionControlleur {
    public final TypeAvionService typeAvionService;

    public TypeAvionControlleur(TypeAvionService typeAvionService) {
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
    public ResponseEntity<List<TypeAvionShortDto>> getAll(){
        return ResponseEntity.ok(typeAvionService.getAll()
                .stream()
                .map(TypeAvionShortDto::toDto)
                .toList());
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
