package vocarize.service.interfaces;

import org.springframework.stereotype.Service;
import vocarize.data.Sets;
import vocarize.data.User;

import java.util.List;
@Service
public interface SetsService {

    void createSet(Sets set);
    List<Sets> findAllSets();
    void deleteSet(Sets set);
    Sets findSetById(Long id);




}
