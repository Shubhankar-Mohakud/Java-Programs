/*
-Write a program to perform following operations on user entered strings and
a character –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
v) Convert the string to upper case and lower case
vi) Check whether the character is present in the string and at which position
vii) Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string
*/

import java.util.Scanner;

class Q1 {
    public static void changeCase(String s){
        String s_new = s.toUpperCase();
        System.out.println("Change case");
        System.out.println(s);
        System.out.println(s_new);
    }

    public static void reverse(String s) {
        String s_new = "";
        for(int i=s.length()-1; i>=0; i--){
            s_new += s.charAt(i);
        }
        System.out.println("Reverse String");
        System.out.println("String: "+s);
        System.out.println("Reversed String: "+s_new);
    }

    public static void comapre(String s){
        String s1 = "mohakud";
        int diff = 0;
        for(int i=0; i<s.length(); i++){
            diff += (int)s.charAt(i);
        }
        for(int i=0; i<s1.length(); i++){
            diff -= (int)s1.charAt(i);
        }

        System.out.println("ASCII difference b/w strings: "+diff);
    }

    public static void changeCase2(String s){
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            if(a>=65 && a<=90) a += 32;
            else a -= 32;
            System.out.print(a);
        }
    }

    public static void insert(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be added: ");
        String s2 = sc.nextLine();
        s = s + s2;
        System.out.println("New String: "+ s);
        sc.close();
    }

    public static void checkChar(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the charracter to search: ");
        char a = sc.next().charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==a){
                System.out.print((i+1)+" ");
            }
        }
    }

    public static void palindrome(String s){
        int n = s.length();
        boolean flag = true;
        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                flag = false;
            }
        }
        if(flag) System.out.println("String is palindrome");
        else System.out.println("String is not a palindrome");
    }

    public static void count(String s){
        int vowel = 0;
        for(int i=0; i<s.length(); i++){
            int a = (int)s.charAt(i);
            
            if(a==97 || a==101 || a==105 || a==111 || a==117){
                vowel++;
            }
        }
        int consonant = s.length()-vowel;
        
    }
    public static void main(String[] args) {
        String s = "Shubhankar";
        comapre(s);
    }    
}