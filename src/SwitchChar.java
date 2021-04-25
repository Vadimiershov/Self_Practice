public class SwitchChar {

    public static void main(String[] args) {

        char letter = 'b';
        String find = "";

        switch (letter){

            case 'A': find = "Letter \"A\"";
            break;

            case 'B': find = "Letter 'B'";
            break;

            default: find = "No letter";
        }
        System.out.println(find);

    }

}
