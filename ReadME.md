1. This is a TestNg @parameter base project that utilizes TestNg's capabilities to run the test in parallel for different browsers.
2. "browser" parameter is passed as system property and can be overriden from the command line or Java shown below in `CMD2`. The default property is "firefox"
3. Running <testsuite>.xml from commandline using CMD3

CMD1: **To run a single test under development with debug mode:**

`mvn -Dit.test=TestClassName#TestName test --debug`

CMD2: **To run a single test with specific property**

`mvn -Dit.test=TestClassName#TestName -Dbrowser="chrome" test --debug`

CD3: **To run a test suite**

`mvn clean install test -DsuiteXmlFile=CrossBrowser.xml --debug`

