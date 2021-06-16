package br.edu.impacta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.edu.impacta.factories.StudentFactory;

@Configuration
@ComponentScan({"br.edu.impacta"})
public class AppConfig {
    @Bean("defaultStudentFactory")
    public StudentFactory defaultStudentFactory() {
        return new StudentFactory();
    }

    @Bean("emilioStudentFactory")
    public StudentFactory emilioStudentFactory() {
        var fac = new StudentFactory();
        fac.config("Emilio");

        return fac;
    }
}
/**
* 1. mvn archetype:generate
* 2. enter
* 3. maior versão
* 4. br.edu.impacta
* 5. first-project
**/