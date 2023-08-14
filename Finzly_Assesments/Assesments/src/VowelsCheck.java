import java.util.Scanner;
public class VowelsCheck {
    public static void main(String[] args){
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = a.nextLine();

        if(containsAllVowels(input)){
            System.out.println("All Vowels are present in the String :-" + input);
        }else {
            System.out.println("All Vowels are not present in the String : " + input);
        }
    }
    public static boolean
    containsAllVowels(String str) {
        str = str.toLowerCase();
        boolean hasa = false, hase = false, hasi = false, haso = false, hasu = false;

        for (char c : str.toCharArray()) {
            if (c == 'a') {
                hasa = true;
            } else if (c == 'e') {
                hase = true;
            } else if (c == 'i') {
                hasi = true;
            } else if (c == 'o') {
                haso = true;
            } else if (c == 'u') {
                hasu = true;
            }
        }
        return hasa && hase && hasi && haso && hasu;
    }
}

