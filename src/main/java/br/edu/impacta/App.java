package br.edu.impacta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        appContext.registerShutdownHook();
        System.out.println("spring working...");
    }
}
