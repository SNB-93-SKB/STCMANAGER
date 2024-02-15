package net.seny.stcmanager.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.*;
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
    private Date dateDebut;
    private Date dateFin;
    private String etat;
   @ManyToMany
   @JoinTable(name = "T_Activite_Exerice",
   joinColumns = @JoinColumn(name = "id_Activite"),
           inverseJoinColumns = @JoinColumn(name = "id_exercice")
   )

    private List<Participents>participents=new ArrayList<Participents>();
}
