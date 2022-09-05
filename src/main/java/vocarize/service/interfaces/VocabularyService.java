package vocarize.service.interfaces;

import org.springframework.stereotype.Service;
import vocarize.data.Sets;
import vocarize.data.Vocabulary;

import java.util.List;

@Service
public interface VocabularyService {

     void createVocabulary(Vocabulary vocabulary);
     void deleteVocabulary(Vocabulary vocabulary);
     List<Vocabulary> findAllVocabularies();
     Vocabulary findVocabularyById(Long id);

}
