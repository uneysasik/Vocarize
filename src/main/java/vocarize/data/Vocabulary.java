package vocarize.data;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Vocabulary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String frontSide;

    @Column
    String backSide;

//    @CreationTimestamp
//    Timestamp creationDate;
//
//    @UpdateTimestamp
//    Timestamp updateDate;

    @ManyToOne
    Sets vocabSet;

    public Vocabulary(Long id, String frontSide, String backSide, Timestamp creationDate, Timestamp updateDate) {
        this.id = id;
        this.frontSide = frontSide;
        this.backSide = backSide;
//        this.creationDate = creationDate;
//        this.updateDate = updateDate;
    }

    public Vocabulary(String frontSide, String backSide, Sets vocabSet) {
        this.frontSide = frontSide;
        this.backSide = backSide;
        this.vocabSet = vocabSet;
    }

    public Vocabulary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrontSide() {
        return frontSide;
    }

    public void setFrontSide(String frontSide) {
        this.frontSide = frontSide;
    }

    public String getBackSide() {
        return backSide;
    }

    public void setBackSide(String backSide) {
        this.backSide = backSide;
    }

//    public Timestamp getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(Timestamp creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public Timestamp getUpdateDate() {
//        return updateDate;
//    }
//
//    public void setUpdateDate(Timestamp updateDate) {
//        this.updateDate = updateDate;
//    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "frontSide='" + frontSide + '\'' +
                ", backSide='" + backSide + '\'' +
                ", vocabSet=" + vocabSet +
                '}';
    }
}
