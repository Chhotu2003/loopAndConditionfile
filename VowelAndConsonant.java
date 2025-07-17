import java.util.*;
public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        VowelConstant(ch);
    }
    public static void VowelConstant(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel Charcter: "+ch);
        }
        else 
        {
            System.out.println("Consonant Character: "+ch);
        }
    }
}
