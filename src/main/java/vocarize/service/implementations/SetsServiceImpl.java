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
    public String createSet(Sets set) {
        setsRepository.save(set);
        if (setsRepository.existsById(set.getId())) return "address is created successfully";
        return "address couldn't  be created";
    }

    @Override
    public List<Sets> findAllSets() {
        return setsRepository.findAll();
    }

    @Override
    public String deleteSet(Long id) {
        if (!setsRepository.existsById(id)) {
            throw new IllegalStateException(id + " does not exist ");
        } else {
            setsRepository.deleteById(id);
            return "Address whose id is " + id + " is successfully deleted";
        }
    }

    @Override
    public Sets findSetById(Long id) {
        if (setsRepository.findById(id).isPresent()) {
            Sets sets = setsRepository.findById(id).get();

            return sets;
        }
        return new Sets();
    }

}
