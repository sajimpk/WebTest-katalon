
### Need to Download <a href="https://download.katalon.com/9.7.1/Katalon_Studio_Engine_Windows_64-9.7.1.zip">katalon Engine<a>

### ***create jenkin new job.****
### ***select FreeStyle pipline.***
### ***select Execute Windows batch command.***


## ***hereExecute Windows batch command***
###### Edit {Path} Katalon Engin & webTest.prj
```
c:
cd C:\Users\MDS\Desktop\WebTest-katalon\Katalon_Studio_Engine_Windows_64-9.7.1

katalonc -noSplash -runMode=console -projectPath="C:\Users\MDS\Desktop\WebTest-katalon\webTest.prj" -retry=0 -testSuitePath="Test Suites/Bikroi_test_Case" -browserType="Chrome" -executionProfile="default" -apiKey="4663dda7-4802-4448-b1df-6bdcab360878" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
```
