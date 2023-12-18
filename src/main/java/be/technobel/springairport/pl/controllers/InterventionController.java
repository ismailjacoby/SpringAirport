package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.intervention.InterventionService;
import be.technobel.springairport.dal.models.Intervention;
import be.technobel.springairport.pl.models.intervention.dto.InterventionDto;
import be.technobel.springairport.pl.models.intervention.dto.InterventionShortDto;
import be.technobel.springairport.pl.models.intervention.form.InterventionForm;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intervention")
public class InterventionController {
    private final InterventionService interventionService;

    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid InterventionForm form){
        interventionService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InterventionDto> getOne(@PathVariable long id){
        return ResponseEntity.ok(InterventionDto.toDto(interventionService.getOne(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<Page<InterventionShortDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(interventionService.getAll(pageable)
                .map(InterventionShortDto::toDto));
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, @RequestBody @Valid InterventionForm form){
        interventionService.update(id,form);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        interventionService.delete(id);
    }




}
