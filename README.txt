This is a Web Service which I implemented as a RESTful service using java JAX-RS jersey.

Source files:
- FibonacciServerREST.java: This file contains the RESTful web service class.  It can be deployed on any J2EE web server (e.g. Tomcat).  I deployed it using Jersey's HTTPServer
- FibonacciRestStartUp.java: This is a class that contains a main, and when executed, starts a HTTP server.  This is Jersey's server and it runs a local JVM.






To Deploy:
- You can deploy the FibonacciServerREST web service to any J2EE web server such as Tomcat, but you would need to compile it and obtain a .class file 
(dependent libraries are included in the repository).

- I "deployed" it to my local computer (linux based) running a local Jersey HTTPServer.  The source code for this server is in FibonacciRestStartUp.java.  
I crearted a jar file called thaoFibonacciService.jar located in the deployedJars directory.  It contains the .class files for the two above listed classes.
To run the server (which will discover the web service deployed to it), you need java in your path.  Run it as follows:
java -jar thaoFibonacciService.jar

- To Run:
Open any browser on the same computer where you launched the HTTP Server (the web service curently only listens locally for now but that can easily be changed) 
Go to link: http://localhost:9999/fibonaccirest/fibonacci/0
The above is like sending in a 0 into the web service and it will return 0 because that is the sequence for this input.
If you go to http://localhost:9999/fibonaccirest/fibonacci/5 it will output the sequence for that number

