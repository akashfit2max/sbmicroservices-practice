# sbmicroservices-practice

## UML OF THE PROJECT

The project is divided into 2 parts one 
  
  1. service layer 
  - userService
  - ContactService
  
  2. API gateway layer
  
  The service layer has two class with different maven projects one is the *userService* and the other one is the *ContactService* which are registed to the EUREKA microservices
  which are then connected by the API gateway to have a single API for using both the functionality even if they are 2 different projects.
  
  
  
  
