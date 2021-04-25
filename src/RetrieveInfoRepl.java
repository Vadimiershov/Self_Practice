public class RetrieveInfoRepl {

    public static void main(String[] args){

        String info = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String name = info.substring(info.indexOf("<")+1,info.indexOf(">"));
        System.out.println(name);
        String phoneNumber = info.substring(info.indexOf("[")+1,info.indexOf("]"));
        System.out.println(phoneNumber);

    }
}
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */