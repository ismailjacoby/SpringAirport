package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.possede.PossedeService;
import be.technobel.springairport.dal.models.joinTables.Possede;
import be.technobel.springairport.pl.models.possede.dto.PossedeDto;
import be.technobel.springairport.pl.models.possede.dto.PossedeShortDto;
import be.technobel.springairport.pl.models.possede.form.PossedeForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/possede")
public class PossedeController {
    public final PossedeService possedeService;

    public PossedeController(PossedeService possedeService) {
        this.possedeService = possedeService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid PossedeForm form){
        possedeService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PossedeDto> getOne(@PathVariable long id){
        return ResponseEntity.ok(PossedeDto.toDto(possedeService.getOne(id)));
    }


    @GetMapping("/all")
    public ResponseEntity<List<PossedeShortDto>> getAll(){
        return ResponseEntity.ok(possedeService.getAll()
                .stream()
                .map(PossedeShortDto::toDto)
                .toList());
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, PossedeForm form){
        possedeService.update(id, form);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        possedeService.delete(id);
    }


}
