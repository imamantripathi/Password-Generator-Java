import java.util.*;
public class Password_Generator {
    public static void main(String args[]) {
int length=10;
    System.out.print(password(length));
    }
    private static char[] password(int len){
    System.out.print("Your New Password is:- ");
    String capChar="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String smallChar="abcdefghijklmnopqrstuvwxyz";
    String Numbers="1234567890";
    String Symbols="!@#$%^&*()_+=-}{[]|\"':;><,.?/";
    String pass=capChar+smallChar+Numbers+Symbols;
    Random rnd_fuction = new Random();
    char array[] = new char[len];
    for (int i = 0; i < len; i++) {
        array[i]=pass.charAt(rnd_fuction.nextInt(pass.length()));
    } 
    return array;
    }
}
