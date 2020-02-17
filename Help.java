// This code does use HttpRequest.java Library from Eric Pogue (2019)
// Prog assignment 5 - Swiss Army Knife Utility App to be run in terminal sak.java
// @author: Dominic Bruno

class Help {
    public static void printHelp() { 
        long start = System.currentTimeMillis();
        
        System.out.println("\nHello, welcome to Swiss Army Knife Utility App in terminal...");
        System.out.println("Please fee free to Copy [CTR+C] the following java commands and Paste them [CTR + V] into your terminal of choosing");
        System.out.println("This App will read the data of your HTTP URL of choosing and print it's contents back out to the screen");
        System.out.println("If there are additional HTTP URLs in your initial HttpRequestIndex req - this app will open those up as well.");
        
        System.out.println("\njava sak -HttpRequest [URL] examples:");
        System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");
        System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195e.json");
        System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195f.json");
        System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/no-last-name.json");
        System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/too-short-a-last-name.json");
        System.out.println("\nHttpRequestIndex [URL] example:");
        System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");

        System.out.println("\nIf you get lost at any point please Copy + paste the code below to come back to this screen");
        System.out.println("java sak -Help");

        System.out.println("\nCredits: This app uses Eric Pogue's HttpRequest Library (2019) and references SAKL from Sprint 5");

        long end = System.currentTimeMillis();
        long timeSpent = end - start;
        System.out.println("\nTime Spent: " + timeSpent + "millis");
    }
}