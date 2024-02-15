package net.seny.stcmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Entity
@Builder
@AllArgsConstructor
public class Participents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Participent;
    private String firstname;
    private String lastname;
    private String telephone;
    private  String email;
    private String domaine;
     private  String structure;
     @ManyToMany
     @JoinTable(name = "participent_activite",
     joinColumns = @JoinColumn(name = "id_Participent"),
     inverseJoinColumns = @JoinColumn(name = "id_Activite"))
     private List<Responsables>responsables=new ArrayList<Responsables>();


}
