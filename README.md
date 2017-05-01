# How use
<details>
  <summary>description</summary>
 
  ## Build Ant task artefact with maven
  exec in root folder project next command: 
  ```
  mvn package
  ```
  this command create in folder **target** jar and zip package
  in **ant / lib-ext** was copyed **jar** from **target** folder.
  
  ### Prepare step

goto folder **ant** and exec task for create folders structure 
  ```
  ant createFolders
  ```

copy sample files (zip package) in **ant/in**

---

  #### Test with default prefix
  prefix (default timestamp)
  ```
  ant
  ```
  

<details>
  <summary>example output</summary>
<pre>
vikhlaev@vikhlaev-N750JV:~/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant$ ant
Buildfile: /home/vikhlaev/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant/build.xml

clean:
     [echo] temp folder is clean 

unpackZipWithoutStructure:
    [unzip] Expanding: /home/vikhlaev/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant/in/zip_1.zip into /home/vikhlaev/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant/temp

AntTaskDevTask:
[lib:filesRenamer] START TASk: filesRenamer
[lib:filesRenamer] -------------------------
[lib:filesRenamer] Start renaming files
[lib:filesRenamer] Prepared a list files (35pcs)  for rename
[lib:filesRenamer] .xhtml 	==>	-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 00-x3q4hkj97zwp4.html 	==>	00-x3q4hkj97zwp4-2017.04.28_22-27-33.html
[lib:filesRenamer] 00.html 	==>	00-2017.04.28_22-27-33.html
[lib:filesRenamer] 1.html 	==>	1-2017.04.28_22-27-33.html
[lib:filesRenamer] 1.xhtml 	==>	1-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 1.xml 	==>	1-2017.04.28_22-27-33.xml
[lib:filesRenamer] 10.html 	==>	10-2017.04.28_22-27-33.html
[lib:filesRenamer] 10.xhtml 	==>	10-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 10.xml 	==>	10-2017.04.28_22-27-33.xml
[lib:filesRenamer] 2.html 	==>	2-2017.04.28_22-27-33.html
[lib:filesRenamer] 2.xhtml 	==>	2-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 2.xml 	==>	2-2017.04.28_22-27-33.xml
[lib:filesRenamer] 3.html 	==>	3-2017.04.28_22-27-33.html
[lib:filesRenamer] 3.xml 	==>	3-2017.04.28_22-27-33.xml
[lib:filesRenamer] 3333.3333.333.33.....xhtml 	==>	3333.3333.333.33....-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 4.html 	==>	4-2017.04.28_22-27-33.html
[lib:filesRenamer] 4.xhtml 	==>	4-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 4.xml 	==>	4-2017.04.28_22-27-33.xml
[lib:filesRenamer] 5.html 	==>	5-2017.04.28_22-27-33.html
[lib:filesRenamer] 5.xhtml 	==>	5-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 5.xml 	==>	5-2017.04.28_22-27-33.xml
[lib:filesRenamer] 6.html 	==>	6-2017.04.28_22-27-33.html
[lib:filesRenamer] 6.xhtml 	==>	6-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 6.xml 	==>	6-2017.04.28_22-27-33.xml
[lib:filesRenamer] 7.html 	==>	7-2017.04.28_22-27-33.html
[lib:filesRenamer] 7.xhtml 	==>	7-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 7.xml 	==>	7-2017.04.28_22-27-33.xml
[lib:filesRenamer] 8.html 	==>	8-2017.04.28_22-27-33.html
[lib:filesRenamer] 8.xhtml 	==>	8-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 8.xml 	==>	8-2017.04.28_22-27-33.xml
[lib:filesRenamer] 9.html 	==>	9-2017.04.28_22-27-33.html
[lib:filesRenamer] 9.xhtml 	==>	9-2017.04.28_22-27-33.xhtml
[lib:filesRenamer] 9.xml 	==>	9-2017.04.28_22-27-33.xml
[lib:filesRenamer] not_packed-x3q4hkj97zwp4.html 	==>	not_packed-x3q4hkj97zwp4-2017.04.28_22-27-33.html
[lib:filesRenamer] not_packed.html 	==>	not_packed-2017.04.28_22-27-33.html

BUILD SUCCESSFUL
Total time: 0 seconds
</pre>
</details>


  #### Test with prefix as param
  ```
  ant -Djob.id=test-prefix
  ```
  
<details>
  <summary>example output</summary>
<pre>
vikhlaev@vikhlaev-N750JV:~/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant$ ant -Djob.id=test-prefix
Buildfile: /home/vikhlaev/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant/build.xml

clean:
     [echo] temp folder is clean 

unpackZipWithoutStructure:
    [unzip] Expanding: /home/vikhlaev/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant/in/zip_1.zip into /home/vikhlaev/@PRG/WK/Task ant Task Dev/AntTaskDevelopmentTask/ant/temp

AntTaskDevTask:
[lib:filesRenamer] START TASk: filesRenamer
[lib:filesRenamer] -------------------------
[lib:filesRenamer] Start renaming files
[lib:filesRenamer] Prepared a list files (35pcs)  for rename
[lib:filesRenamer] .xhtml 	==>	-test-prefix.xhtml
[lib:filesRenamer] 00-x3q4hkj97zwp4.html 	==>	00-x3q4hkj97zwp4-test-prefix.html
[lib:filesRenamer] 00.html 	==>	00-test-prefix.html
[lib:filesRenamer] 1.html 	==>	1-test-prefix.html
[lib:filesRenamer] 1.xhtml 	==>	1-test-prefix.xhtml
[lib:filesRenamer] 1.xml 	==>	1-test-prefix.xml
[lib:filesRenamer] 10.html 	==>	10-test-prefix.html
[lib:filesRenamer] 10.xhtml 	==>	10-test-prefix.xhtml
[lib:filesRenamer] 10.xml 	==>	10-test-prefix.xml
[lib:filesRenamer] 2.html 	==>	2-test-prefix.html
[lib:filesRenamer] 2.xhtml 	==>	2-test-prefix.xhtml
[lib:filesRenamer] 2.xml 	==>	2-test-prefix.xml
[lib:filesRenamer] 3.html 	==>	3-test-prefix.html
[lib:filesRenamer] 3.xml 	==>	3-test-prefix.xml
[lib:filesRenamer] 3333.3333.333.33.....xhtml 	==>	3333.3333.333.33....-test-prefix.xhtml
[lib:filesRenamer] 4.html 	==>	4-test-prefix.html
[lib:filesRenamer] 4.xhtml 	==>	4-test-prefix.xhtml
[lib:filesRenamer] 4.xml 	==>	4-test-prefix.xml
[lib:filesRenamer] 5.html 	==>	5-test-prefix.html
[lib:filesRenamer] 5.xhtml 	==>	5-test-prefix.xhtml
[lib:filesRenamer] 5.xml 	==>	5-test-prefix.xml
[lib:filesRenamer] 6.html 	==>	6-test-prefix.html
[lib:filesRenamer] 6.xhtml 	==>	6-test-prefix.xhtml
[lib:filesRenamer] 6.xml 	==>	6-test-prefix.xml
[lib:filesRenamer] 7.html 	==>	7-test-prefix.html
[lib:filesRenamer] 7.xhtml 	==>	7-test-prefix.xhtml
[lib:filesRenamer] 7.xml 	==>	7-test-prefix.xml
[lib:filesRenamer] 8.html 	==>	8-test-prefix.html
[lib:filesRenamer] 8.xhtml 	==>	8-test-prefix.xhtml
[lib:filesRenamer] 8.xml 	==>	8-test-prefix.xml
[lib:filesRenamer] 9.html 	==>	9-test-prefix.html
[lib:filesRenamer] 9.xhtml 	==>	9-test-prefix.xhtml
[lib:filesRenamer] 9.xml 	==>	9-test-prefix.xml
[lib:filesRenamer] not_packed-x3q4hkj97zwp4.html 	==>	not_packed-x3q4hkj97zwp4-test-prefix.html
[lib:filesRenamer] not_packed.html 	==>	not_packed-test-prefix.html

BUILD SUCCESSFUL
Total time: 0 seconds
</pre>
</details>
  
  
</details>



---

# Apache Ant task development task

Use previous Apache Ant build script task as foundation.

Create a project using following structure:

  - ant
    - lib-ext
    - build.xml
  - src
  - pom.xml
  
Apache Maven should be used for compilation, copying of jar with custom task to lib-ext folder and packaging of artifact.
Project artifact should be represented as zip package, containing 

  * lib-ext
  * build.xml
  
Create Apache Ant task that renames input from ZIP package files under temp dir. 
It should add postfix to the filename: input.html -> input-${ job.id}.html.

User should be able to send job.id using parameter via command line ant -Djob.id=x3q4hkj97zwp4.

Default value for postfix should be current timestamp.

Custom task must be defined with ant.coreLoader.

### example:
<details>
  <summary>Sample of definition of a custom ant task with ant.coreLoader reference</summary>
  
  ```xml
  <project xmlns:lib="antlib:com.epam.training" basedir="." default="default-end" name="test-project">
    <taskdef
      uri="antlib:com.epam.training"
      resource="com/epam/training/antlib.xml"
      classpathref="project.classpath"
      loaderref="ant.coreLoader"/>      
      
    <target name="rename-files">
      <lib:rename-files destDir="${dir.temp}" jobId=" ${job.id}">
        <fileset dir="${dir.temp}">
          <include name="*.xml"/>
          <include name="*.html"/>
          <include name="*.xhtml"/>
        </fileset>
      </lib:rename-files>
    </target>
  </project> 
  ```
  
</details>


#### Attach sample input files along with project sources.
