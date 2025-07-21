public class CountVowelAndConsonant {
   public static void main(String[] args) {
    String str="Hello World";
    VowelConsonantCount(str);
   } 
   public static void VowelConsonantCount(String str){
    int vowel=0;
    int consonant=0;
    str=str.toLowerCase();
    for(char ch:str.toCharArray()){
         if(ch>='a' && ch <'z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else{
                consonant++;
            }
         }
     }
         System.out.println("Vowel: "+ vowel);
         System.out.println("Consonant: "+consonant);
    
   }
}
