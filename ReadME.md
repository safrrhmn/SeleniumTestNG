1. This is a TestNg @parameter base project that utilizes TestNg's capabilities to run the test in parallel for different browsers.
2. "browser" parameter is passed as system property and can be overriden from the command line or Java shown below in `CMD2`. The default property is "firefox"

CMD1: **To run a single test under development with debug mode:**

`mvn -Dit.test=TestClassName#TestName test --debug`

CMD2: 

`mvn -Dit.test=TestClassName#TestName -Dbrowser="chrome" test --debug`
