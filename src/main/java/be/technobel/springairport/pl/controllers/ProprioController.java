package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.proprio.ProprioService;
import be.technobel.springairport.pl.models.proprio.dto.ProprioDto;
import be.technobel.springairport.pl.models.proprio.dto.ProprioShortDto;
import be.technobel.springairport.pl.models.proprio.form.ProprioForm;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proprio")
public class ProprioController {

    private final ProprioService proprioService;

    public ProprioController(ProprioService proprioService) {
        this.proprioService = proprioService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid ProprioForm form){
        proprioService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProprioDto> getOne(@PathVariable long id){
        return ResponseEntity.ok(ProprioDto.toDto(proprioService.getOne(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<Page<ProprioShortDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(proprioService.getAll(pageable)
                .map(ProprioShortDto::toDto));
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, @RequestBody @Valid ProprioForm form){
        proprioService.update(id,form);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        proprioService.delete(id);
    }
}
