package br.edu.impacta.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.edu.impacta.factories.StudentFactory;
import br.edu.impacta.models.Student;
import br.edu.impacta.services.abstracts.StudentService;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StudentServiceImpl extends StudentServiceBase implements StudentService {
    @Autowired
    @Qualifier(value = "emilioStudentFactory")
    private StudentFactory studentFactory;

    public StudentServiceImpl() {
        super();
        System.out.println("Creating new StudentServiceImpl...");
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        
        students.addAll(List.of(new Student("Emilio")));
        try {
            students.add(studentFactory.getObject());
        } catch (Exception e) {
            System.out.println("failed to getObject...");
            e.printStackTrace();
        }

        return students;
    }
    
}
