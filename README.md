# TestNG_POM
Data driven framework with TestNG and POM
Github Configuration and operation steps:
To Push a code:
1) Move to project directory in the terminal - [Copy the project directory path from the properties(right click on project) of the project and hit "CD <project directory path>" on the terminal.]
2) Git init - [in the terminal]/[Initializes git]
3) Git add Remote origin <url> - [copied from the Github repository]
4) Git status - [in the terminal]/ [Lists the pending items to be commited and pushed]
5) Git add . - [[in the terminal]/ Commit readies the pending items]
6) Git status 
7) Git commit -m "<commit comments>" - [in the terminal]/[Commits all the pending commit items]
8) Git push origin master - [Pushes the code to the master branch.]
  
Creating and adding SSH key to Github (For Mac):
1) ssh-keygen -t rsa - [in the terminal]
2) type "Yes" to the path of the file to be saved.
3) Enter laptop password.
4) Re-enter laptop password.
5) pbcopy < ~/.ssh/id_rsa.pub - [in the terminal]
6) paste it on a note pad
