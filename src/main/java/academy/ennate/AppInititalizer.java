package academy.ennate;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Front controller is configured here, its also called DispatcherServlet
public class AppInititalizer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{Application.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];
    }

    //Configure servlet to listen to only requests that comes with /api
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/api/*"};
    }
}
