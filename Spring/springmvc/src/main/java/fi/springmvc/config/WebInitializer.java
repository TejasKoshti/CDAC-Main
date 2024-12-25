package fi.springmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Initialize Spring's AnnotationConfigWebApplicationContext
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
        
        // Set the servlet context
        springContext.setServletContext(servletContext);

        // Register the DispatcherServlet
        Dynamic frontController = servletContext.addServlet("dispatcher", new DispatcherServlet(springContext));

        // Map the DispatcherServlet to the "/spring/*" URL pattern
        frontController.addMapping("/spring/*");

        // Set the load-on-startup priority for the DispatcherServlet
        frontController.setLoadOnStartup(1);

        // Register the Spring MVC configuration class
        springContext.register(SpringMVCConfiguration.class);
    }
}