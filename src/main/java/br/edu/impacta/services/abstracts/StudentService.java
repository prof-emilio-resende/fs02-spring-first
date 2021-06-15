package br.edu.impacta.services.abstracts;

import java.util.List;

import br.edu.impacta.models.Student;

public interface StudentService {
    List<Student> findAll();
}
