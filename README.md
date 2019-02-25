# RandomBeerApp
# Random Beer App Setup:
A MySQL database is required to run the app<br/>
To create the database run the random_beer.sql file to create the schema and database table used. This will also populate it with sample data.<br/>
In the application.properties the database url, username and password may have to be changed to connect to the database depending on your enviornment setup
# Running
To build the application execute maven clean install in IDE or the command mvn clean install <br>
To run the application execute the maven plugin spring-boot:run in IDE or with the command mvn spring-boot:run <br>
Once running navigate to localhost:8080/beer in a browser to see the application
