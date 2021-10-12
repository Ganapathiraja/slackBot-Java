#SlackBotSpringBootApp

#Description about the project:
>A simple bot where user can send bunch of commands to execute to get the desired web Url's for the services that are actually used in the
specific project , this will resolve the need for storing the url's or forgetting to store it.

##Installation used:
```
1.Springboot
2.Docker Container
```

##Run locally: 
1. Build the project using command [mvn clean install] and then package the project [mvn clean package]
2. Check if the target folder contains the .jar file or the snapShot file
3. Run the Dockerfile so that the images gets build and stores locally in your system , and do a cmd [docker images] and check if the `slackbot` image built successfully
4. Final step is to run the `runDocker.sh` and you could be able to the image will be running in the docker container.

##SlackIntegration:
Slack integration has been made to the cts workspace and the bot name is `ServiceUrl-Bot` , to 
interact with this bot do the following 

>Note: Create your own channel in slack and then just call `@yourBotName` into your slack channel

