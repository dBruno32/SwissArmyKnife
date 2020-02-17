// This code references conditionals but does not copy code from Eric Pogue's sakl.java
// This code does use HttpRequest.java Library from Eric Pogue (2019)
// Prog assignment 5 - Swiss Army Knife Utility App to be run in terminal sak.java
// @author: Dominic Bruno


public class sak {
    public static void main(String[] args) {
        String myURL;
        HttpRequest request;
        if(args.length < 1) {
            System.out.println("\nThis application requires at least 1 input parameter");
            System.out.println("\nExecuting Help...");
            Help.printHelp();           
        }
        else {
            String command = args[0];
            if(args.length == 1 || args.length > 2) {
                System.out.println("\nExecuting Help...");
                Help.printHelp();
            }
            else {
                myURL = args[1];
                if(args[0].equalsIgnoreCase("-HttpRequest")) {
                    System.out.println("\nExecuting HttpRequest");                     
                    request = new HttpRequest();
                    if(request.readURL(myURL) == true) {
                        System.out.println(request);
                    }
                    else {  System.out.println("The -HttpRequest function requires a valid URL");   }
                }
                else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
                    System.out.println("\nExecuting HttpRequestIndex");                     
                    request = new HttpRequestIndex();
                    if(request.readURL(myURL) == true) {
                        System.out.println(request);
                    }
                    else {  System.out.println("The -HttpRequestIndex function requires a valid URL");  }
                }
            }
        }
    }
}