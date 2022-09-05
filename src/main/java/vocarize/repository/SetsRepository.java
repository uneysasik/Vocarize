package vocarize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vocarize.data.Sets;

@Repository
public interface SetsRepository extends JpaRepository<Sets, Long> {
}


// jdbc:mysql://localhost:3306/vocarize