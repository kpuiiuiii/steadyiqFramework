# SteadyIQ Testing Framework

This is an automated testing framework for the [SteadyIQ](https://www.steadyapp.com/) website, built using Selenium WebDriver, Cucumber, and Java. The framework is designed to test the functionality of the website's contact form submission process.

## Prerequisites

Before running the tests, ensure that you have the following installed:

- Java Development Kit (JDK)
- Maven
- WebDriver for the desired browser (e.g., ChromeDriver, GeckoDriver)

## Project Structure

- `src/test/java/com/steadyiq/runner/CukesRunner.java`: This is the runner class that executes the Cucumber test scenarios.
- `src/test/java/com/steadyiq/step_definitions/ContactFormSubmission.java`: This class contains the step definitions for the Cucumber scenarios related to the contact form submission process.
- `src/test/java/com/steadyiq/pages/ContactUsPage.java`: This page object class contains the locators and methods for interacting with the Contact Us page.
- `src/test/java/com/steadyiq/utilities/Driver.java`: This utility class manages the initialization and cleanup of the WebDriver instance.
- `src/test/java/com/steadyiq/utilities/ConfigurationReader.java`: This utility class reads the configuration properties from the `configuration.properties` file.
- `src/test/resources/features/`: This directory contains the Cucumber feature files with the test scenarios.
- `configuration.properties`: This file contains the configuration properties, such as the browser type and application URL.

## Running Tests

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Open the `configuration.properties` file and set the desired values for the `browser` and `env` properties.
4. Make sure the WebDriver executable for the specified browser is available in your system's PATH.
5. Run the tests using the following Maven command:

This command will execute the Cucumber test scenarios and generate a report in the `target/cucumber-reports.html` file.

## Test Scenarios

The test scenarios are written in the Gherkin syntax and can be found in the `src/test/resources/features/` directory. The current scenario tests the contact form submission process by entering random test data and verifying that an error message is displayed when the form is submitted without completing all required fields.

## Additional Information

- The `Faker` library is used to generate random test data for the contact form fields.
- The `PrettyReports` plugin is used to generate a more detailed HTML report for the test execution.
- The `rerun:target/rerun.txt` plugin option allows for failed scenarios to be easily re-run.

Feel free to customize and extend the framework as needed for your testing requirements.
