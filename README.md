# Spring-MVC-with-security-layer
Project Summary

  -The project is to implement the Spring MVC or Java EE service layer components of an enterprise application,           integrate our JPA domain model with the service layer, and introduce security to the application

  -In domain structure our projects using maven, add dependencies using the pom.xml configuration file, and make use of    Stateless EJB.

  -It consists of 1 maven Java Application project using JPA and MySQL database connectivity.  There are 6 Entity         classes in project.

Design

  -The project contains Multilevel Marketing Company which include 6 entities Customer,Member,Products,Company,Points     and Combos.  
  -The functionality implement in the project is based on JPA,DataNucleus and ORM , so it is very easy to add or remove    components later on if we want to expand the project.
  -I used the database "itmd4515" in which there are total nine(12) tables from that six(8) are entities and other        three(3) are Join table of these entities.
  -To run the main project just test the jsharma3-mp4 project .
  -There are one abstract class and one database populater class which content all common method of class  to create      the value in database.

Development Insights

  -Before working on project ,i was not familiar with JPA,DataNucleus and having a no knowledge about Hibernate , But     once I started I found very interesting to work with hibernate and  get more familiar with it .
  -I learned about JPA,DataNucleus and their interaction with each other using Hibernate.
  -After working on project I like JPA and want to learn more about Hibernate .
  -To provide a security any model through Hibernate is easy.

Requirements (Installation, Compile, Run-time, etc)

  -Open the project in Net-beans.
  -Connect the database "itmd4515" with the user "itmd4515" and password "itmd4515".
  -Database tables created by test cases of project.
  -And test the project and you will see the all tables of the database in mysql with values.
  -The Tools used in the project is "NetBeans IDE version 8.0.2"
  -The Project is  based on JPA,DataNeclues and Hibernate. The libraries used are  sql, util, annotation, ejb, inject,    validation, OneToOne, ManyToMany, ManyToOne, OneToMany.
