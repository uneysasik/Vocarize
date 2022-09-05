package vocarize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vocarize.entity.Vocabulary;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
}