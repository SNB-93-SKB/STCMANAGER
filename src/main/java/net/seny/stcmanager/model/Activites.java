package net.seny.stcmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@ToString
@Entity
@Builder
@AllArgsConstructor
public class Activites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id_Activite;
    private String titre;
    private String description;
    private String type;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String etat;
   @ManyToMany
   @JoinTable(name = "T_Activite_Exerice",
   joinColumns = @JoinColumn(name = "id_Activite"),
           inverseJoinColumns = @JoinColumn(name = "id_exercice")
   )

    private List<Participent>participents=new ArrayList<Participent>();
}
