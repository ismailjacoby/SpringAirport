package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.pilote.PiloteService;
import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.pl.models.pilote.dto.PiloteDto;
import be.technobel.springairport.pl.models.pilote.dto.PiloteShortDto;
import be.technobel.springairport.pl.models.pilote.form.PiloteForm;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/pilote")
public class PiloteController {
    private final PiloteService piloteService;

    public PiloteController(PiloteService piloteService) {
        this.piloteService = piloteService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid PiloteForm form){
        piloteService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PiloteDto> getOne(@PathVariable long id){
        return ResponseEntity.ok(PiloteDto.toDto(piloteService.getOne(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<Page<PiloteShortDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(piloteService.getAll(pageable)
                .map(PiloteShortDto::toDto));
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, @RequestBody @Valid PiloteForm form){
        piloteService.update(id,form);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        piloteService.delete(id);
    }

}
