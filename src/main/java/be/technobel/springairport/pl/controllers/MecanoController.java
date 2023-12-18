package be.technobel.springairport.pl.controllers;

import be.technobel.springairport.bll.mecano.MecanoService;
import be.technobel.springairport.bll.mecano.MecanoServiceImpl;
import be.technobel.springairport.dal.models.Mecano;
import be.technobel.springairport.pl.models.mecano.dto.MecanoDto;
import be.technobel.springairport.pl.models.mecano.dto.MecanoShortDto;
import be.technobel.springairport.pl.models.mecano.form.MecanoForm;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mecano")
public class MecanoController {
    private final MecanoService mecanoService;

    public MecanoController(MecanoService mecanoService) {
        this.mecanoService = mecanoService;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid MecanoForm form){
        mecanoService.create(form);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MecanoDto> getOne(@PathVariable long id) {
        Mecano mecano = mecanoService.getOne(id);
        if (mecano == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return ResponseEntity.ok(MecanoDto.toDto(mecano));
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Page<MecanoShortDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(mecanoService.getAll(pageable)
                .map(MecanoShortDto::toDto));
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, @RequestBody @Valid MecanoForm form){
        mecanoService.update(id,form);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        mecanoService.delete(id);
    }

}
