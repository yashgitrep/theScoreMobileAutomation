# AppiumMobileAutomation with Java,TestNG and Maven
This project demonstrates how to perform mobile automation testing using Appium with TestNG, written in Java and managed with Maven. The tests are designed to run on Virtual Android device .

## Prerequisites
Before running the tests, ensure you have the following installed:
- Maven 
- Appium 2.0.1
- Java 11
- Android SDK 
- Virtual Android device for running tests

## Setup
1. Clone the repository to your local machine:
    git clone <repository_url>
2. Navigate to the project directory:
    cd project directory
3. Install project dependencies using Maven:
    mvn clean install
    
## Configuration
1. Update the Appium server details in the `src/test/java/Utils.AppiumUtils.java' file.
2. Update IpAddress and Port number in 'src/main/java/resources.data.properties'. IpAddress and Port number can be obatined by running Appium server from Terminal.
3. Start An Virtual Android device from android Studio and Update device name in 'src/main/java/resources.data.properties'

## Running Tests
To run the tests, execute the following command from the project root directory:
mvn test -Psmoke
This will run the testng.xml file .
