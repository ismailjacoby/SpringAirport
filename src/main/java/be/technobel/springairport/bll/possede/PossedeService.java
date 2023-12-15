package be.technobel.springairport.bll.possede;

import be.technobel.springairport.dal.models.joinTables.Possede;
import be.technobel.springairport.pl.models.possede.form.PossedeForm;

import java.util.List;

public interface PossedeService {
    void create(PossedeForm form);
    Possede getOne(long id);
    List<Possede> getAll();
    void update(long id, PossedeForm form);
    void delete(long id);
}
