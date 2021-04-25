import java.util.Scanner;

public class BrowserName {

    public static void main(String[] args) {

        String browser = "safar";
        String result = "";

        if (browser == "chrome") {
            result = "Chrome Browser is Selected";

        }else if (browser == "firefox") {
            result = "Firefox browser is Selected";

        } else if (browser == "opera") {
            result = "Opera Browser is Selected";

        } else if (browser == "safari"){
            result = "Safari Browser is Selected";

        }else
              result = "Invalid browser name";
        System.out.println(result);




    }


}
