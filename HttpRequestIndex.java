// This code does use and inherit from HttpRequest.java Library from Eric Pogue (2019)
// Prog assignment 5 - Swiss Army Knife Utility App to be run in terminal sak.java
// @author: Dominic Bruno

import java.util.ArrayList;

class HttpRequestIndex extends HttpRequest {
    private ArrayList <String> urlCrossCheckList;
    private String crossCheckHttp = "https://";

    HttpRequestIndex() {
        super();
        urlCrossCheckList = new ArrayList <String>();
    }

    HttpRequestIndex(String urlIn) {
        super(urlIn);
    }

    public Boolean readURL(String urlIn) {
        long start = System.currentTimeMillis();
        Boolean returnValue = super.readURL(urlIn);
        int index = 0;

        if (returnValue == true) {
            for (String content : urlContent) {
//              Splits into lines using " delimiter
                String[] splitLines = content.split("\"");
//              Parsing....Finds Index of crossCheck String variable             
                for (int i = 0; i < splitLines.length; i ++) {
                    if (splitLines[i].contains(crossCheckHttp) == true) {
                        urlCrossCheckList.add(splitLines[i]);
                        returnValue = true;
                    }
                    else {  continue; }
                }
            }
        }
        long end = System.currentTimeMillis();
        long timeSpent = end - start;
        System.out.println("\n Time Spent: " + timeSpent + " millis\n");
        return returnValue;
    }

    public String toString() {
        String indexString = "";
        int counter = 0;
//      Checks each URL and runs an Http Request at ea iteration
        for (String url: urlCrossCheckList) {
            counter ++;
            HttpRequest request = new HttpRequest();
            request.readURL(url);
            indexString += " Contents of URL-" + counter+ "\n " + request.toString();
        }
        return indexString;
    }

}
