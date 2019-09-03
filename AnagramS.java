import java.util.*;  
   
public class AnagramS 
{
     public static void main(String[] args)
        {  
          Scanner sc=new Scanner(System.in);
          System.out.println("enter 1st letter");
          String n1=sc.nextLine();
          System.out.println("enter 2nd letter");
          String n2=sc.nextLine();

         Validate(n1,n2);   
        }  


    static void Validate(String str1, String str2) 
     {  
         String s1 = str1.replaceAll("\\s", "");  
         String s2 = str2.replaceAll("\\s", "");  
         boolean check = true;  
        if (s1.length() != s2.length()) 
           {  
             check = false;  
           }
       else
             {  
                char[] ArrayS1 = s1.toLowerCase().toCharArray();  
                char[] ArrayS2 = s2.toLowerCase().toCharArray();  
                Arrays.sort(ArrayS1);  
                Arrays.sort(ArrayS2);  
                check = Arrays.equals(ArrayS1, ArrayS2);  
            }  
        if (check)
           {  
              System.out.println(s1 + " and " + s2 + " are anagrams");  
           }
       else 
          {  
             System.out.println(s1 + " and " + s2 + " are not anagrams");  
          }  
    }  
   

} 