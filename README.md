#codility

There are total 6 tests, 5 cross browser tests for **"Responsive Fight"** app and 1 API tests covering all API operatons for **"Super Villain API"**.

The cross browser tests cover, Windows, MAC platform for chrome, edge, opera and firefox browsers.


###### Tests

1. RF - Bus Challenge Grid Win Chrome
2. RF - Bus Challenge Grid Mac Chrome
3. RF - Bus Challenge Grid Any Edge
4. RF - Bus Challenge Grid Win Firefox
5. RF - Bus Challenge Grid Win Opera
6. SV API- Verify All User Operations

------------
## How to execute tests in CI/CD

##### Steps
1. Navigate to Teamcity(http://teamcity.gauravkakkar.id.au/guestLogin.html?guest=1)
2. For Project Codility>Build click Run button and tests will be placed in queue for execution.(ETA ~4 mins)
3. Click the build number
4. and then navigate to Artifacts tab
5. Download artifact file named ExtentReports.html

------------
## How to execute tests in local environrment

##### Steps
1. Clone the repository on your preferred IDE as Java Maven project
2. Create new run configuration with SDK as **JDK 1.8**  and maven command **clean test**
3. The execution will run both Responsive Fight and Supr Villain test in ~4 mins.
4. Once completed,  test report**(ExtentReport.html)** will be generated in **target/Extent** folder.

