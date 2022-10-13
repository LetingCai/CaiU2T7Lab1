import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Say something: ");
        String str1 = scan.nextLine();
        System.out.println("String length: " + str1.length());
        System.out.println("First half: " + str1.substring(0,(str1.length()+1)/2));
        System.out.println("Second half: " + str1.substring((str1.length())/2));

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        if (str1.length()>str2.length()){
            System.out.println(str1 + " is longer.");
        } else {
            System.out.println(str2 + " is longer.");
        }
        if (str1.compareTo(str2)>0){
            System.out.println(str1 + " is first alphabetically.");
        } else {
            System.out.println(str2 + " is first alphabetically.");
        }
        if (str1.contains(str2)){
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is not found in " + str1 +".");
        }
        if (str1.indexOf(str2)==0){
            System.out.println("They are the same string.");
        }
    }
}
