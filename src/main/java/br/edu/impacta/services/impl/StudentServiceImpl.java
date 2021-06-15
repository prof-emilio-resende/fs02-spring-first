package br.edu.impacta.services.impl;

import java.util.List;

import br.edu.impacta.models.Student;
import br.edu.impacta.services.abstracts.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAll() {
        return List.of(new Student("Emilio"));
    }
    
}
