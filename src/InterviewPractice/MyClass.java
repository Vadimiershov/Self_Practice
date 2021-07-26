package InterviewPractice;

public class MyClass {

    private String name = "Chris";

    public MyClass(String name){
        this.name = name;
    }

    public void SetName(String name){
        name = name;
    }

    public String GetName(){
        return name;
    }

    public static void main(String[]args){

        MyClass myClass = new MyClass("Jim");
        System.out.println(myClass.GetName());

    }



}
