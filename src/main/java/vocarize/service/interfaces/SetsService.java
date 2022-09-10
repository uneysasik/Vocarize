package vocarize.service.interfaces;

import org.springframework.stereotype.Service;
import vocarize.data.Sets;
import vocarize.data.User;

import java.util.List;
@Service
public interface SetsService {

    String createSet(Sets set);
    List<Sets> findAllSets();
    String deleteSet(Long id);
    Sets findSetById(Long id);




}
