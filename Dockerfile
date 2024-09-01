# Use an official image as the base image
FROM alpine:latest

# Install necessary packages (including OpenJDK for Java, as Katalon requires it)
RUN apk update && apk add --no-cache git openjdk11 bash unzip wget

# Download and install Katalon Studio Engine
WORKDIR /opt
RUN wget https://download.katalon.com/9.7.1/Katalon_Studio_Engine_Windows_64-9.7.1.zip \
    && unzip Katalon_Studio_Engine_Windows_64-9.7.1.zip \
    && rm Katalon_Studio_Engine_Windows_64-9.7.1.zip

# Clone the repository
WORKDIR /root
RUN git clone https://github.com/sajimpk/WebTest-katalon.git

# Set the working directory inside the cloned repository
WORKDIR /root/WebTest-katalon/Katalon_Studio_Engine_Windows_64-9.7.1

# Command to run the Katalon test suite
CMD ['katalonc -noSplash -runMode=console -projectPath="/root/WebTest-katalon/webTest.prj" -retry=0 -testSuitePath="Test Suites/Bikroi_test_Case" -browserType="Chrome" -executionProfile="default" -apiKey="4663dda7-4802-4448-b1df-6bdcab360878" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true']
