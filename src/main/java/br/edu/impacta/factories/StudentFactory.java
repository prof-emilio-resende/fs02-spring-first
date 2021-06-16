package br.edu.impacta.factories;

import org.springframework.beans.factory.FactoryBean;

import br.edu.impacta.models.Student;

public class StudentFactory implements FactoryBean<Student> {
    private final Student instance = new Student("Padrão");

    @Override
    public Student getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    public void config(String name) {
        this.instance.setName(name);
    }
}
