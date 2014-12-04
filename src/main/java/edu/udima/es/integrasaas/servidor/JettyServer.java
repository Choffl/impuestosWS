package edu.udima.es.integrasaas.servidor;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Levanta una instancia de un servidor Jetty en el puerto 9191 y
 * lee el web.xml que configura el Servlet de Apache CXF para usar el protocolo HTTP
 * @author Sofia Sabariego
 */
public class JettyServer {
	
	public static void main(String[] args) throws Exception{
        String webappDirLocation = "src/main/webapp/";
        
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "9191";
        }

        Server server = new Server(Integer.valueOf(webPort));
        WebAppContext root = new WebAppContext();

        root.setContextPath("/");
        root.setDescriptor(webappDirLocation+"/WEB-INF/web.xml");
        root.setResourceBase(webappDirLocation);
        
        root.setParentLoaderPriority(true);
        
        server.setHandler(root);
        
        server.start();
        server.join();   
    }

}
