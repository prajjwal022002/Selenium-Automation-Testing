# Selenium Automation Framework - Demo Web Shop

UI test automation for https://demowebshop.tricentis.com/ (a practice e-commerce site).

## Tools
Java, Selenium WebDriver, TestNG, Maven, Apache POI

## Test coverage
- User registration (Regression)
- Login with a valid user (Smoke, Regression)

## Structure (inside SeleniumFramework-DemoWebShop)
- `src/main/java/com/demowebshop/object_repository` - page objects
- `src/main/java/com/demowebshop/generic_utilities` - base class and utilities
- `src/test/java/com/demowebshop` - login and registration tests
- `src/test/resources` - test data (properties, Excel)
- `src/test/java/com/practice`, `com/demoSuiteFiles` - learning exercises

## How to run
Import as a Maven project in Eclipse. Right-click `RegressionSuite.xml` or `SmokeSuite.xml`
and run as TestNG Suite. To change the browser, set the `browser` parameter in the suite
file to chrome, edge or firefox.
