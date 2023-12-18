package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.piloter.PiloterService;
import be.technobel.springairport.pl.models.piloter.dto.PiloterDto;
import be.technobel.springairport.pl.models.piloter.dto.PiloterShortDto;
import be.technobel.springairport.pl.models.piloter.form.PiloterForm;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piloter")
public class PiloterController {
    public final PiloterService piloterService;

    public PiloterController(PiloterService piloterService) {
        this.piloterService = piloterService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid PiloterForm form) {
        piloterService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PiloterDto> getOne(@PathVariable long id){
        return ResponseEntity.ok(PiloterDto.toDto(piloterService.getOne(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<Page<PiloterShortDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(piloterService.getAll(pageable)
                .map(PiloterShortDto::toDto));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody @Valid PiloterForm form) {
        piloterService.update(id, form);
    }

    @DeleteMapping
    public void delete(@PathVariable long id){
        piloterService.delete(id);
    }
}
