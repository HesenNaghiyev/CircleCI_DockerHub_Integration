# CirleCi

Circleci is an automation tool for enabling application to auto-test, containerize and deploy to server including container service; ECR, Docker hub, EC2 and etc. In this projecr, to automate the process using circleci, l have created a directory called .circleci. Inside of the circleci directory, l have created a file called config.yml. All the process that you want to automate is written inside of it. In this task,  l automate the process of containerizing application. 


## Testing
You can run my app with following command, however,firstly, you must have docker installed on your machine.

```python
docker run -p 8080:8080 hnaghiyev/circleci_docker_integration:14
```


## DockerHub link for this image
<https://hub.docker.com/r/hnaghiyev/circleci_docker_integration>
