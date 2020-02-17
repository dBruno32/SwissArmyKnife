# SwissArmyKnife

sak Swiss Army Knife project for Object Oriented Programming class

The source can be downloaded or cloned from GitHub.
To run, compile using javac *.java and then java sak to run main program.
once compiled using:
javac *.java,

Utilities included

-Help (Help.java) : This will display a menu and intro to the app as well as providing C+P examples

-HttpRequest(HttpRequest.java) : This is Eric Pogue's Library that opens a URL and reads the data, storing it to a varaible

-HttpRequestIndex(HttpRequestIndex.java) : This inherits HttpRequest and will open a file.  If the file includes other URLs, this class will parse it and store the additional URLs to a variable in which it will iterate through that variable list to open all the subsequent URLs.

-sak(sak.java) : defaults to -Help but takes in parameters in Terminal to run any of the above utilites.  


feel free to use any of the following commands to run any of the mentioned utilities:
  
  java sak
  
  java sak -Help
  
  java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195d.json
  
  java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195e.json
  
  java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195f.json
  
  java sak -HttpRequest https://thunderbird-index.azurewebsites.net/no-last-name.json
  
  java sak -HttpRequest https://thunderbird-index.azurewebsites.net/too-short-a-last-name.json
  
  java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json

Credits due to Eric Pogue (2019) for using his HttpRequest library and referencing sakl.java 

Thanks!
