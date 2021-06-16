package br.edu.impacta.repositories.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Repository;

import br.edu.impacta.models.Student;
import br.edu.impacta.repositories.abstracts.StudentRepository;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class StudentRepositoryImplFake implements StudentRepository {
    public StudentRepositoryImplFake(@Value("#{ T(java.util.UUID).randomUUID() }") UUID uuid) {
        super();
        System.out.printf("Criando instancia FAKE [%s] de student repo...", uuid);
    }

    @Override
    public List<Student> findAll() {
        return List.of(new Student("Emilio"));
    }
}
