package net.seny.stcmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Exercices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_excercice;
    private Date annee;
    private Date datedebut;
    private Date datefin;
    private String status;
    @ManyToMany
    @JoinTable( name = "T_Activite_Exerice",
            joinColumns = @JoinColumn( name = "id_excercice" ),
            inverseJoinColumns = @JoinColumn( name = "id_activite" ) )
    private List<Exercices> exercices =new ArrayList<Exercices>();
}
