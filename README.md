# Defect-Management-System:
# DefectTracker : It is a microservice based defect logging and tracking system. It is designed for all the CRUD operations on defects.

# The core components include: 
#1. Config Server
#2. Discovery Server
#3. Zuul Gateway Server
#4. DefectDetails Microservice: To create, update, delete defects.
#5. UserInformation Microservice: To fetch user details.
#6. UserCatalog Microservice: This uses the DefectDetailsMS and UserInformationMS to fetch all the defects assigned to a particular user, which we can subsequently drill down.

# The properties file info:
#1. The application.properties file is being used by the config server
#2. The .properties files for each microservice is being accessed through the config server.
#3. The DiscoveryServer.properties file is for the DiscoveryServer.
