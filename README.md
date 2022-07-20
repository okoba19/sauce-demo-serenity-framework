# TEST AUTOMATION FRAMEWORK for the https://www.saucedemo.com/ UI testing

### TAF Tools/Technologies

- Java 17
- Serenity BDD
- Cucumber 6
- Log4j-Slf4j
- Lombok
- Selenium WebDriver

### To run tests:

  $ mvn clean install
  
### Run Cucumber tests by tag and Junit tests:

$ mvn test -Dtags="testScenarioTag"

#### Generate Serenity BDD report
After test execution Serenity will generate report html files in folder `sauce-demo-serenity-framework\reports`

#### Work with framework in Intellij IDEA
##### Code style & conventions
[Java conventions](http://www.oracle.com/technetwork/java/codeconventions-150003.pdf) should be used whenever it is possible and reasonable. Some of conventions may be overridden by project code formatter (see below).

Using code best practices (DRY, KISS, SOLID and others) is encouraged when it is reasonable.

Every framework contributor should install and use project code formatter. Formatting code with
project code formatter is mandatory before pushing each new commit to main develop branch. To
use project code formatter with Intellij IDEA do next steps:
* Open `File` > `Settings` > `Editor` > `Code Style` > `Java`;
* In `Scheme` option select `Import Scheme` > `Intellij IDEA code style XML` > import file `ide/idea/intellij-java-style.xml`;
* Consider automating code formatting process by:
    * installing plugin **`Save Actions`**;
    * in case creating commits from IDEA, tick `Reformat code` and `Optimize imports` before commit;
    * or format code by manual invocation (`Project` view > select `src` folder > perform `Reformat Code` action > tick `Only VCS changed text`)

Delivering clean, readable and maintainable code is personal responsibility of each framework contributor despite
passing static code analysis, code review and other quality gates.

##### Useful links
Here you can find some useful information about framework tools:

* http://serenity-bdd.info/docs/serenity/ - Serenity user guide;
* https://serenity-bdd.github.io/theserenitybook/latest/index.html - Serenity documentation;
* https://serenity-bdd.github.io/theserenitybook/latest/serenity-parallel.html - Running parallel tests
* https://cucumber.io/docs/cucumber/ - official Cucumber documentation;
* https://johnfergusonsmart.com/blog/ - official Serenity blog;
* https://projectlombok.org/features/GetterSetter - Lombok main features documentation
