package br.com.mariojp.demo;

import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.faces.webapp.FacesServlet;
import jakarta.servlet.ServletContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

@SpringBootApplication
public class DemoSpringbootJsfApplication { //implements ServletContextAware {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootJsfApplication.class, args);
    }

    @Bean
    public CommandLineRunner verify() {
        return args -> {
            try {
                BeanManager beanManager = CDI.current().getBeanManager();
                System.out.println("CDI is active. BeanManager: " + beanManager.getClass().getName());
            } catch (Exception e) {
                System.err.println("CDI is NOT active: " + e.getMessage());
            }
        };
    }

//    @Configuration
//    static class ConfigureJSFContextParameters implements ServletContextInitializer {
//
//        @Override
//        public void onStartup(ServletContext servletContext) {
//
//            servletContext.setInitParameter("javax.faces.DEFAULT_SUFFIX", ".xhtml");
//            servletContext.setInitParameter("javax.faces.PARTIAL_STATE_SAVING_METHOD", "true");
//            servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
//            servletContext.setInitParameter("facelets.DEVELOPMENT", "true");
//            servletContext.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "1");
//
//        }
//    }

//
//    @Bean
//    public ServletRegistrationBean facesServletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(
//                new FacesServlet(), "*.xhtml");
//        registration.setLoadOnStartup(1);
//        return registration;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
//        return new ServletListenerRegistrationBean<ConfigureListener>(
//                new ConfigureListener());
//    }
//
//    @Override
//    public void setServletContext(ServletContext servletContext) {
//        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
//        // Registrar o listener do CDI
//        servletContext.addListener(EnhancedListener.class);
//
//        System.out.println("CDI registrado com sucesso!");
//
//    }

//    @Bean
//    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
//        ServletRegistrationBean<FacesServlet> registration = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
//        registration.setLoadOnStartup(1);
//        return registration;
//    }


}
