package br.com.mariojp.demo;

import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.faces.webapp.FacesServlet;
import org.jboss.weld.environment.servlet.EnhancedListener;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@ConditionalOnWebApplication
//@AutoConfigureAfter(name = "org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration")
public class JsfAutoConfiguration {

////    @Bean
////    ServletRegistrationBean jsfServletRegistration(ServletContext servletContext) {
////        //spring boot only works if this is set
////        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
////
////        //FacesServlet registration
////        ServletRegistrationBean srb = new ServletRegistrationBean();
////        srb.setServlet(new FacesServlet());
////        srb.setUrlMappings(Arrays.asList("*.xhtml"));
////        srb.setLoadOnStartup(1);
////        return srb;
////    }
//
////    @Bean
////    @ConditionalOnMissingBean
////    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
////        System.out.println("Start: FacesServlet registration");
////        ServletRegistrationBean<FacesServlet> registration = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
////        registration.setLoadOnStartup(1);
////        System.out.println("End: FacesServlet registration");
////
////        return registration;
////    }
//
//    @Bean
//    public ServletContextInitializer cdiInitializer() {
//        System.out.println("Start: CDI registration");
//        return servletContext -> {
//            // Adiciona o listener do Weld para CDI
//            //servletContext.addListener(EnhancedListener.class);
//            // Registra o listener
//            servletContext.addListener("org.jboss.weld.environment.servlet.EnhancedListener");
//
//            servletContext.setInitParameter("jakarta.faces.FACELETS_SKIP_COMMENTS", "true");
//            servletContext.setInitParameter("jakarta.faces.PROJECT_STAGE", "Development");
////            servletContext.setInitParameter("jakarta.faces.STATE_SAVING_METHOD", "server");
////            servletContext.setInitParameter("jakarta.faces.FACELETS_REFRESH_PERIOD", "1");
////            servletContext.setInitParameter("jakarta.faces.CONFIG_FILES", "/WEB-INF/faces-config.xml");
//
//            System.out.println("End: CDI registration");
//            // Exibe a implementação CDI no log
//            BeanManager beanManager = (BeanManager) servletContext.getAttribute("javax.enterprise.inject.spi.BeanManager");
//            if (beanManager != null) {
//                System.out.println("CDI Implementation: " + beanManager.getClass().getName());
//            } else {
//                System.err.println("CDI BeanManager not found!");
//            }
//        };
//        };
    }





