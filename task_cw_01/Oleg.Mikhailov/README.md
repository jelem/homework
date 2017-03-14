  # benchmark-example

To start all tests from the command line:  
1. Create an uber-jar:  
&nbsp;&nbsp;&nbsp;&nbsp;**mvn clean install**  
2. Run tests by:  
&nbsp;&nbsp;&nbsp;&nbsp;**java -jar target/benchmarks.jar**  

To start from the IntelliJ Idea IDE:  
1. Create maven configuration (Run - Edit Configuration)  
&nbsp;&nbsp;&nbsp;&nbsp;add maven configuration here with command line parameters **clean install**  
2. Create jar configuration (Run - Edit Configuration)  
&nbsp;&nbsp;&nbsp;&nbsp;add jar application here and specify path to jar which is the **target/benchmarks.jar**
