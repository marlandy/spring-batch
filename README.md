spring-batch training
============

To launch the process:

1: mvn clean package (generates .zip file)
2: unzip .zip (target/ folder)
3: set input/output files into conf/fileProcessor.properties
4: At the unzip destination folder (contains .jar file) type:
    java -jar ${nombredeljar} ${nombre.del.xml.donde.esta.el.job} ${id.del.job}
    Sample: java -jar springbatch-1.0-SNAPSHOT.jar simpleJob.xml processFileJob



Folders:
    lib/: libraries that process depends
    conf/: properties
    sprinbatch-${version}.jar: process module