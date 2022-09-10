package vocarize.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public String createVocabulary(Vocabulary vocabulary) {
        vocabularyRepository.save(vocabulary);
        if (vocabularyRepository.existsById(vocabulary.getId())) return "vocabulary is created successfully";
        return "vocabulary couldn't  be created";
    }

    @Override
    public String deleteVocabulary(Long id) {
        if (!vocabularyRepository.existsById(id)) {
            throw new IllegalStateException(id + " does not exist ");
        } else {
            vocabularyRepository.deleteById(id);
            return "Vocabulary " + id + " is  deleted";
        }
    }

    @Override
    public List<Vocabulary> findAllVocabularies() {
        return vocabularyRepository.findAll();
    }

    @Override
    public Vocabulary findVocabularyById(Long id) {
        if (vocabularyRepository.findById(id).isPresent()) {
            Vocabulary vocabulary = vocabularyRepository.findById(id).get();

            return vocabulary;
        }

        return new Vocabulary();

}}
