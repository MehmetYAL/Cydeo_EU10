package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        /*1. declear a String variable named browserName
        2. Assume that the valid browsers are: chrome,firefox, opera, safari, edge
        3. if the browser name does not match with the valid browsers' names,
        out put should be: Invalid Browser Name
        Ex:String browser = "chrome";
    Output:
    Chrome Browser is selected
Note: MUST use nested if

         */
        String browsername="Chrome";
        String result="";
        boolean validBrowser=browsername=="Chrome"||browsername=="firefox"||browsername=="opera"||
                browsername=="safari"||browsername=="edge";
        if(validBrowser) {
            if (browsername=="Chrome") {result="Chrome Browser is selected";
            }else if (browsername=="firefox"){result="firefox is selected";}
            else if (browsername=="opera"){result="opera is selected";}
            else if (browsername=="safari"){result="safari is selected";}
            else  {result="edge is selected";}
        }else {result="invalid browser";}
        System.out.println(result);
    }
}
