# spring-batch training #


## To launch the process: ##
1. mvn clean package (generates .zip file)
1. unzip .zip (target/ folder)
1. set input/output files into conf/fileProcessor.properties (there´s a sample input file into resources folder)
1. At the unzip destination folder (contains .jar file) type:
    java -jar ${jarname}.jar ${xml.job.file.name} ${job.id}
    Sample: java -jar springbatch-1.0-SNAPSHOT.jar simpleJob.xml processFileJob



## Folders ##
* lib/: libraries that process depends
* conf/: properties
* sprinbatch-${version}.jar: process module