#!/bin/bash

#Get parameters

function=$1
cname=$2

#Get current position
TOP_DIR=$(pwd)

#Add all necessary jars
LIBPATH=lib/java-json.jar

#docer start $cname
#docker cp /home/tcalab/Java/co2reader/src/yellow/Thankyou.java penguin:./usr/src/myapp/src/yellow/
#docker exec penguin javac -cp $TOP_DIR/bin:$LIBPATH src/yellow/Thankyou.java -d ./bin/.
#docker exec -d $cname ./run.sh $day1 $day2 $direction $resid 
docker cp /home/tcalab/Java/co2reader/src/yellow/$function.java $cname:./usr/src/myapp/src/yellow/
docker exec -d $cname ./compile.sh $function


