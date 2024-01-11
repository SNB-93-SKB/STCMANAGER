package net.seny.stcmanager;

import net.seny.stcmanager.model.Participent;
import net.seny.stcmanager.repository.ParticipentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StcmanagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(StcmanagerApplication.class, args);


    }
    @Bean
CommandLineRunner commandLineRunner(ParticipentRepository participentRepository){
      return  args ->  {
          Participent p1 =Participent.builder()
                  .firstname("salif")
                  .lastname("BALDE")
                  .telephone("782327255")
                  .email("sali1f@gmail.com")
                  .domaine("informatique")
                  .structure("poste")
                  .build();
          participentRepository.save(p1);
//
          Participent p2 =Participent.builder()
                  .firstname("mbayane")
                  .lastname("NDOW")
                  .telephone("771320267")
                  .email("ndow@gmail.com")
                  .domaine("informatique")
                  .structure("poste")
                  .build();
          participentRepository.save(p2);
      };
          };

}

