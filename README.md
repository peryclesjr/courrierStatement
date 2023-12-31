## Courrier Statement
This project was created to expose information about courrier statement. By weekly and specifc courrier, or for a period and specific courrier.

I created this project to expose the information saved in DynamoDB. 
Using the rest APIS.This project uses Spring Boot and AWS SDK.
- To run the project you need to configure the application.properties with the information of your AmazonMQ.
 - The project is a maven project and you need to run the following command in terminal:
    ``` gradle clean build ```
 - To run the project you need to run the following command in terminal:
    ``` gradle bootRun ```
 - The project is running in the port 8090.
 - The project has 2 endpoints:
    - /complete-statement
    - /summarize-statement    
