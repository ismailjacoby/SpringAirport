package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.avion.AvionService;
import be.technobel.springairport.pl.models.avion.dto.AvionDto;
import be.technobel.springairport.pl.models.avion.dto.AvionShortDto;
import be.technobel.springairport.pl.models.avion.form.AvionForm;
import be.technobel.springairport.pl.models.intervention.dto.InterventionDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avion")
public class AvionController {
    private final AvionService avionService;

    public AvionController(AvionService avionService) {
        this.avionService = avionService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid AvionForm form){
        avionService.create(form);
    }

    @GetMapping("/{immatriculation}")
    public ResponseEntity<AvionDto> getOne(@PathVariable String immatriculation){
        return ResponseEntity.ok(AvionDto.toDto(avionService.getOne(immatriculation)));
    }
    @GetMapping("/all")
    public ResponseEntity<List<AvionShortDto>> getAll(){
        return ResponseEntity.ok(avionService.getAll()
                .stream()
                .map(AvionShortDto::toDto)
                .toList());
    }

    @PutMapping("/update/{immatriculation}")
    public void update(@PathVariable String immatriculation, @RequestBody @Valid AvionForm avionForm){
        avionService.update(immatriculation,avionForm);
    }

    @DeleteMapping("/delete/{immatriculation}")
    public void delete(@PathVariable String immatriculation){
        avionService.delete(immatriculation);
    }

}
