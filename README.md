# GitMvnRefreshExercise

- This branch only contains the readme, project code is in the **ReleaseBranch** branch
- Please clone the repo and switch to that in your system, and try the following using maven:
	1. Download dependencies 
	2. Compile the program 
	3. Package it  
- If everything goes well, you should be able to compile the code but *1 of 3 test cases will fail*
- Try packaging the jar by skipping tests. See if you can find a way to run only the tests without packaging it or doing any other operations
- By default all the dependencies will be downloaded to .m2 folder in user directory.
- Let's try adding a dependency and check where the artifacts are downloaded.  Add this [dependency](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core/2.14.1)
- Once you add the dependency and try to download the dependency again, now this artifact will be downloaded to our .m2 folder, find the exact location.
- Now try to change the version in dependency and check how another version is downloaded and stored.
- We have two pom.xml files for this project - pom.xml in root and pom.xml in parentProject directory.  Check how these two are linked, and try to generate the effective pom.xml


### Resources

- Cheatsheet - https://stackoverflow.com/a/55645546
- https://maven.apache.org/guides/getting-started/index.html
- http://tutorials.jenkov.com/maven/maven-tutorial.html
- https://www.youtube.com/watch?v=p0LPfK_oNCM
