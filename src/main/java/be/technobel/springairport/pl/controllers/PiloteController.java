package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.pilote.PiloteService;
import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.pl.models.pilote.dto.PiloteShortDto;
import be.technobel.springairport.pl.models.pilote.form.PiloteForm;
import jakarta.validation.Valid;
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

    @PostMapping
    public void create(@RequestBody @Valid PiloteForm form){
        piloteService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pilote> getOne(@PathVariable long id){
        Optional<Pilote> pilote = piloteService.getOne(id);
        return pilote.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<PiloteShortDto>> getAll(){
        return ResponseEntity.ok(piloteService.getAll()
                .stream()
                .map(PiloteShortDto::toDto)
                .toList());
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
