# Setting up a Maven Project

## Creation
1. New Maven Project
2. Check "Simple Project" checkbox
3. Set group ID (ex: com.revature)
4. Set Artifact ID (ex: MyProject)
5. Create Project

## Setup
1. Open pom.xml file
2. Add properties tag.
3. Configure Java version within properties tag.
4. Add dependencies tag.
5. Configure project dependencies within dependencies tag.
	Hint: Search for dependencies by googling "maven <dependency name>"
6. Right click on Project -> Maven -> Update Project
7. Add log4j.properties configuration if you are using Logging

## Project Development
1. Add source files to src/main/java
2. Add configuration files to src/main/resources
3. Add test files to src/test/java
4. Add test configuration resources to src/test/resources

## Troubleshooting
* If you have problems with the project running due to ZIP errors, delete your ~/.m2 folder, or the specific dependency that the error message mentions. This is due to a corrupt Maven dependency.