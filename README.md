# ExampleEssential
Example Forge 1.8.9 mod with Essential and Mixins made in Kotlin

## Setup
1. Import into your IDE (You can use Intellij Idea)
2. In File -> Project Structure select JDK 8
3. In File -> Settings -> Build, Execution, Deployment -> Build Tools -> Gradle and set Gradle JVM to JDK 17+
4. Rename and refactor everything to your mod name
5. Reload Gradle and done!

## Building
<details>
  <summary>Intellij Idea</summary>

  1. Click on Gradle tab on the right
  2. Select Tasks -> build -> build and run it
  3. Jar will appear in build/libs/<MOD_NAME>-1.0.jar
</details>
<details>
  <summary>CLI</summary>

  1. Go to folder path
  2. Run ./gradlew build
  3. Jar will appear in build/libs/<MOD_NAME>-1.0.jar
</details>
