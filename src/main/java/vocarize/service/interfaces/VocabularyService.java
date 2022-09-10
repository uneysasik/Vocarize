package vocarize.service.interfaces;

import org.springframework.stereotype.Service;
import vocarize.data.Sets;
import vocarize.data.Vocabulary;

import java.util.List;

@Service
public interface VocabularyService {

     String createVocabulary(Vocabulary vocabulary);
     String deleteVocabulary(Long id);
     List<Vocabulary> findAllVocabularies();
     Vocabulary findVocabularyById(Long id);

}
