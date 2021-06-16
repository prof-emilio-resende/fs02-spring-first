package br.edu.impacta.repositories.abstracts;

import java.util.List;

import br.edu.impacta.models.Student;

public interface StudentRepository {
    List<Student> findAll();
}
