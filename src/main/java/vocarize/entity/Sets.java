package vocarize.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
public class Sets {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;

    @CreationTimestamp
    Timestamp creationDate;

    @UpdateTimestamp
    Timestamp updateDate;

    @OneToMany
    List<Vocabulary> vocabularyList;

}
