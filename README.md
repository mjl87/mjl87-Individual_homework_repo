Getting Started:
  - Download as a zip file under the Code button
  - Place and extract zip file in the Eclipse Workspace 
  - Open the extracted zip folder as a project directory under Import from Existing Project File in the file tab
  - Right Click on the Project Folder, then navigate to Properties -> Java Build Path -> Libraries, and add the Javafx-sdk-23.01 User Library, JavaFX SDK Library, and JRE System Library to Modulepath
  - Then add the H2 User Library to the Classpath.
  - Apply and Close
  - Right click on the Project folder, then navigate to Run as -> Run Configurations. Under Java Application, open the source code main program in the Main tab.
  - Add the following under VM Arguments: --module-path "C:\Users\YOURUSERNAME\javafx-sdk-23.0.1\lib” --add-modules javafx.controls,javafx.fxml
  - Apply and Close
  - Click on dropdown for CSE360-Group-Mon-30-main
  - Right click on dropdown for CSE360-Group-Mon-30-main(should be on the bottom) go to run as then run configuration and click run. If there is an error click the proceed button.
  - alternatively you can click the dropdown for CSE360-Group-Mon-30-main click on the other drop down for CSE360-Group-Mon-30-main click the dropdown for TP1 click on Start360.java and run.(TP1 is the most recent version and ignore the archives folder)
    
The project is now ready.

Follow the screen casts for some of the userstories and changes we implemented!

Phase 1
Technichal Screencast:
- https://www.youtube.com/watch?v=6lv5CUQEauE
  
User Experience Screencast
- https://youtu.be/83lbF3gMBh4

Phase 2
Technichal Screencast:
- https://youtu.be/PZkSdsnYznY (flow of the code)
- https://youtu.be/NNsSHAMaFeM (functions)
  
User Experience Screencast
- https://youtu.be/U6ESqtazhUY
- https://youtu.be/kDsWRfd2ij0 (update answer and first time running program)

Stand Up Recordings
  - Feb 2: https://youtu.be/fdNShmNr9AA
  - Feb 4: https://youtu.be/ZNjCvMk30vo
  - Feb 11: https://youtu.be/8PM5enf_lF4
  - Feb 17: https://youtu.be/9FqrYcIFAmo
  - Feb 20: https://youtu.be/mYv2-iXJmG8
  - Feb 23: https://youtu.be/POCSOWQHCXA
  - Feb 25: https://youtu.be/9233hyhP8Lg

Application Rough Draft: https://docs.google.com/presentation/d/1rE6zyn5JvCUSPGnGOsktnejpo9bnRexhPFlR2IOlhcI/edit?usp=sharing

Group Notes:

Added PasswordEvaluator.java and UserNameRecognizer.java classes 

AdminSetupPage.java - line 53 through line 71 UserNameRecognizer caller
                    - line 73 through line 90 calling PasswordEvaluator class

PasswordEvaluator.java - line 102 invalid character checker
                       - line 139 and below minor print statements change
                       
UserNameRecognizer.java - line 116 checking for first character alphabet
                        - line 154 special character - and _ implemented as valid special character
                        
UserLoginPage.java - line 46 username length check

SetupAccountPage.java - line 52 through line 86 username class and password class called here
