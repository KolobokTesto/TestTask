##  Running testcases
1.  In testng.xml specify URL or absolute path to .html file 
> <parameter name="URL" value="**PATH TO FILE or URL**"`/> 
2. In terminal run the following command 
```bash
mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
```
***
##  Reporting
When tests are finished, run the following command in terminal in order to get Allure report:
```bash
cd target && allure serve -h localhost -p 9999
```

