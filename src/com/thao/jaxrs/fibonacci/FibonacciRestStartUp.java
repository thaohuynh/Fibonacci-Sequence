package com.thao.jaxrs.fibonacci;

import java.io.IOException;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class FibonacciRestStartUp {
	
	static final String BASE_URI = "http://localhost:9999/fibonaccirest/";
	 
   public static void main(String[] args) {
       try {
           HttpServer server = HttpServerFactory.create(BASE_URI);
           server.start();
           System.out.println("Press Enter to stop the server. ");
           System.in.read();
           server.stop(0);
       } catch (IllegalArgumentException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
