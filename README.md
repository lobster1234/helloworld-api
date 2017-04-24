# README
This guide will help you to build and run the Spark Java Hello World Example in a Servlet container.

Simply just run the maven command below.

    mvn install


Simply copy the war file to your servlet container's webapp folder

    cp target/<artifactId>-<version>.war  <tomcat_home>/webapps
  
And point your browser to 
   
    http://<server>:<port>:/<artifactId>-version>/hello
    
You should see

    Hello World!