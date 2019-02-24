CREATE DATABASE `random_beer` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

CREATE TABLE random_beer.beer(
id int(10) NOT NULL AUTO_INCREMENT,
name varchar(100) NOT NULL,
description varchar(250) NOT NULL,
abv float(4,2),
location varchar(100) NOT NULL,
PRIMARY KEY (id)
);

insert into beer
(name,description,abv,location) 
values('Guiness', 'Irish dry stout', 4.3, 'St. James Gate, Dublin, Ireland');
  
  insert into beer
(name,description,abv,location) 
values('Rockshore', 'Golden Irish Lager', 4.0, 'St. James Gate, Dublin, Ireland');

  insert into beer
(name,description,abv,location) 
values('Smithwicks', 'Irish Red Ale', 4.5, 'Kilkenny, Ireland');

 insert into beer
(name,description,abv,location) 
values('Budweiser', 'Pale Lager', 4.5, 'St. Louis, Missouri, United States'); 

insert into beer
(name,description,abv,location) 
values('Corona Extra', 'Pale Lager', 4.6, '	Mexico City, Mexico');

insert into beer
(name,description,abv,location) 
values('Erdinger Weissbier', 'Wheat beer', 5.6, 'Erding, Germany');

