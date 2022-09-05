package vocarize.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vocarize.data.Sets;
import vocarize.data.Vocabulary;
import vocarize.repository.VocabularyRepository;
import vocarize.service.interfaces.VocabularyService;

import java.util.List;

@Service
public class VocabularyServiceImpl implements VocabularyService {

    VocabularyRepository vocabularyRepository;

    @Autowired
    public VocabularyServiceImpl(VocabularyRepository vocabularyRepository) {
        this.vocabularyRepository = vocabularyRepository;
    }

    @Override
    public void createVocabulary(Vocabulary vocabulary) {

    }

    @Override
    public void deleteVocabulary(Vocabulary vocabulary) {

    }

    @Override
    public List<Vocabulary> findAllVocabularies() {
        return vocabularyRepository.findAll();
    }

    @Override
    public Vocabulary findVocabularyById(Long id) {
        return vocabularyRepository.findById(id).get();
    }

}
