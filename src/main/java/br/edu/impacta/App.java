package br.edu.impacta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import br.edu.impacta.services.abstracts.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    private static GenericApplicationContext ctx;

    private static void runService() {
        var svc = ctx.getBean(StudentService.class);
        var students = svc.findAll();
        students.forEach(System.out::println);
    }

    private static void runServiceTwo() {
        var svc = ctx.getBean(StudentService.class);
        var students = svc.findAll();
        students.forEach(System.out::println);
    }

    public static void main( String[] args )
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.registerShutdownHook();

        System.out.println("spring working...");

        runService();
        runServiceTwo();

        ctx.close();
    }
}
