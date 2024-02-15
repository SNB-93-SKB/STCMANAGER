package net.seny.stcmanager;

import net.seny.stcmanager.model.Exercices;
import net.seny.stcmanager.repository.ExerciceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class StcmanagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(StcmanagerApplication.class, args);


    }
    @Bean
CommandLineRunner commandLineRunner(ExerciceRepository exerciceRepository){
      return  args ->  {


      };
          };

}

