package vocarize.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vocarize.data.Sets;
import vocarize.data.User;
import vocarize.repository.SetsRepository;
import vocarize.service.interfaces.SetsService;

import java.util.List;

@Service
public class SetsServiceImpl implements SetsService{

    private SetsRepository setsRepository;

    @Autowired
    public SetsServiceImpl(SetsRepository setsRepository) {
        this.setsRepository = setsRepository;
    }

    @Override
    public void createSet(Sets set) {

    }

    @Override
    public List<Sets> findAllSets() {
        return setsRepository.findAll();
    }

    @Override
    public void deleteSet(Sets set) {

    }

    @Override
    public Sets findSetById(Long id) {
        return setsRepository.findById(id).get();
    }

}
