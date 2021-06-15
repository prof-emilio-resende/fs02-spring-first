package br.edu.impacta.services.impl;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.edu.impacta.models.Student;
import br.edu.impacta.services.abstracts.StudentService;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StudentServiceImpl extends StudentServiceBase implements StudentService {

    public StudentServiceImpl() {
        super();
        System.out.println("Creating new StudentServiceImpl...");
    }

    @Override
    public List<Student> findAll() {
        return List.of(new Student("Emilio"));
    }
    
}
