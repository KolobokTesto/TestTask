##  Running testcases
1.  In testng.xml specify URL or absolute path to .html file 
> <parameter name="URL" value="**PATH TO FILE or URL**"`/> 
2. In terminal run the following command 
>mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
***
##  Reporting
When the tests are finished, run the following comand in terminal in order to get Allure report:
>mvn allure:serve

