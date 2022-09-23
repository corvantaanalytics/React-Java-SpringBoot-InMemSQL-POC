# react-java-example
Example project on how to develop and build React application with Java

DOWNLOAD INSTRUCTION REACET USER FILE

1. To install JAVA refer this link 
	-> https://www.oracle.com/java/technologies/downloads

2. To install REACT with Bootstrap command
	-> npm install react-bootstrap bootstrap

3. To install MAVEN refer this link 
	-> https://mkyong.com/maven/how-to-install-maven-in-windows/

4. To run React UI in local, run below commands in one terminal
  	cd ./src/main/ui
  	npm install
  	npm start

5. Test UI, hit below url in browser
	http://localhost:4200/

6. To run Java API, execute below commands in another terminal
	Note: It is better to change the port number to any but not have 8080
	1. To change the port number, add below line in application.properties
		'server.port=9080'
	2. mvn clean install
	3. java -jar target/users-0.0.1-SNAPSHOT.jar

7. Test the API, hit the below url in browser
	http://localhost:9080/api/users

8. To connect and validate data in H2 database
	1. http://localhost:8080/h2-console 
  	2. check this file for db properties -> src/main/resources/application.propesties
   		jdbc:h2:mem:testdb
   		username=sa
   		password=password
	3. Enter the values and click connect

