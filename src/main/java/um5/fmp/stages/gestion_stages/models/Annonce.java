package um5.fmp.stages.gestion_stages.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Annonce {
    @Id
    private Long id;
    private String titre;
    private String description;

    @ManyToOne
    private Admin auteur;
}
