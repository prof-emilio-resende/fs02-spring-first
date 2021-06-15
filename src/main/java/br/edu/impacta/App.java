package br.edu.impacta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import br.edu.impacta.services.abstracts.StudentService;
import br.edu.impacta.services.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    private static void runService(GenericApplicationContext ctx) {
        var svc = ctx.getBean(StudentService.class);
        var students = svc.findAll();
        students.forEach(System.out::println);
    }

    private static void runServiceTwo(GenericApplicationContext ctx) {
        var svc = ctx.getBean(StudentService.class);
        var students = svc.findAll();
        students.forEach(System.out::println);
    }

    public static void main( String[] args )
    {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        appContext.registerShutdownHook();
        System.out.println("spring working...");

        runService(appContext);
        runServiceTwo(appContext);

        appContext.close();
    }
}
