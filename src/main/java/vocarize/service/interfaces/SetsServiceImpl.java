package vocarize.service.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vocarize.entity.Sets;
import vocarize.repository.SetsRepository;

import java.util.List;

@Service
public class SetsServiceImpl implements SetsService{
    private SetsRepository sets;


    @Autowired
    public SetsServiceImpl(SetsRepository sets) {
        this.sets = sets;
    }



    @Override
    public void AddSet(Sets set) {


        sets.save(set);

    }

    @Override
    public List<Sets> sets() {
        return sets.findAll();
    }
}
