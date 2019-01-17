# TestNG_POM - Data driven framework with TestNG and POM
Github Configuration and operation steps:

To Push a code:
1) Move to project directory in the terminal - [Copy the project directory path from the properties(right click on project) of the project and hit "CD <project directory path>" on the terminal.]
2) git init - [in the terminal]/[Initializes git]
3) git add Remote origin <url> - [copied from the Github repository]
4) git status - [in the terminal]/ [Lists the pending items to be commited and pushed]
5) git add . - [[in the terminal]/ Commit readies the pending items]
6) git status 
7) git commit -m "<commit comments>" - [in the terminal]/[Commits all the pending commit items]
8) git push origin master - [Pushes the code to the master branch.]
  
Creating and adding SSH key to Github (For Mac):
1) ssh-keygen -t rsa - [in the terminal]
2) type "Yes" to the path of the file to be saved.
3) Enter laptop password.
4) Re-enter laptop password.
5) pbcopy < ~/.ssh/id_rsa.pub - [in the terminal]
6) paste it on a note pad

To Create A Clone:
1) mkdir <local directory where the project need to be cloned>
2) cd <local directory where the project need to be cloned> - [in the terminal]
3) git clone https://github.com/Jaishankar0707/<name of the repository to be cloned> - [in the terminal]
4) On the Eclipse:
    File->Import-> <Select project type i.e, Gradle/ Java/ Maven> -> Choose "Existing <Gradle/ maven/java> projects in to     workspace" -> Choose the root directory, where the clone exist. [The clone successfully gets imported in to eclipse workspace]
  
To Pull a code:
1) cd <project directory>  -  [Move to the project directory in the terminal]
2) git pull origin master  -  [Pulls the latest code]

