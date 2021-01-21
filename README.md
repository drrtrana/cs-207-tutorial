###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> GitHub Tutorial

**Getting Started**

**THIS WAS A CHANGE AFTER STUDENTS HAVE CLONED THE REPO AND COMMITED CODE!!**

**1.** For this course, please download IntelliJ IDEA Ultimate and Java version 11 or higher. You will need to sign up using your NEIU email to access the downloads.
- For IntelliJ, you can either download and install the IDE directly or download JetBrains Toolbox.
    - Just the IDE: https://www.jetbrains.com/idea/download/#section=windows
    - JetBrains Toolbox: https://www.jetbrains.com/toolbox-app/
    - Code With Me plugin: Please install this plugin for IntelliJ. Go to File > Settings > Plugins. Make sure you have Marketplace selected, and search for Code With Me and install the plugin.
- For Java, you will need to create an Oracle account to access the download.
    - https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

**2.** Detailed instructions are located in the tutorial videos and in the initial (this) assignment.<br>
**3.** Accept the assignment invitation on D2L.<br>
**4.** Clone the assignment to your computer.<br>
**5.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**6.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from: is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**7.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**8.** Create the main/java directory in the src directory. This is where you will be creating your Java classes for your assignment. Right click src and go to New > Directory and select main/java.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests (where applicable) and code analyzers before you commit.

**2.** Then in IntelliJ, go to File, select Export to Zip File. This will a create a zip file of the entire project directory.<br>
**3.** Submit the .zip file to the Homework 1A Assignment folder on D2L.<br>

**Problem 1**

**1.** In the main/java directory, create a class named `Calculator`.
- Create a static method named `addNums` that takes two integer parameters and returns an integer. The method should calculate the sum and return that value.
    - Uncomment the body of the tests that begin with "addNumsShould..." in the test/java directory to test this method. Run the code
      analyzers and commit your code now.
- Create a static method named `subtractNums` that takes two integer parameters and returns an integer. The method should calculate the difference and return that value.
    - Uncomment the body of the tests that begin with "subtractNumsShould..." in the test/java directory to test this method. Run the code
      analyzers and commit your code now.
 

