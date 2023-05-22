# SeleniumWebAutomation

This framework is developed by using Page object model with maven and testNG framework written in java.

CODE STRUCTURE:

1- all test cases are defined in src/test/java class.

2- all pages object are defined in src/main/java/pages package.

3- all listeners (i.e before suite, before methods) are defined in the src/main/java/listeners class.

4- webdriver configurations, thread safety and driver getter are defined in the src/main/java/driver package.

5- all reuseable browser functions for the webelements are defined in src/main/java/utils/BrowserUtils class.

6- all reuseable Assertions for the webelements are defined in src/main/java/commons/CommonAssertions class.

7- all reuseable explicit waits for the webelements are defined in src/main/java/utils//WaitUtils class.

8- all report configuration and setup are defined in src/main/java/reports package.

9- common utilities like taking screenshots and reading values from the property file are defined in src/main/java/utils package.

10- project properties like URL, are defined in the Project.properties file under src/main/resources/Project.properties.

11- console logging is enabled and the logging properties can be found in src/main/resources/log4j2.properties


RUN TEST CASE:

- In order to run the test cases the class name and test method will be provided in the testng.xml file. 
- The test will run through the testng.xml file.

The test cases will be executed on google chrome browser.

In order to run test via testng file, right on the testng.xml in the root folder and click run.
In order to run the test cases via command line type: "mvn clean test"

After the test has ran a report will be generated which contains information about the passed and failed test cases. In case the test has failed 
a snapshot of that web page will be taken and attached with report along with failure logs. The report could be found under /reports.




