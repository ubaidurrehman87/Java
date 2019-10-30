import java.util.*;
public class practice{
    public static void main(String[]args){
        System.out.println(10);
        String name1="ubaid";
        String name2=" Ur Rehman";
        System.out.println(name1+name2);
        System.out.println(name1.substring(1,3));
        Boolean end=name1.endsWith("@nu.edu.pk");
        System.out.println(end);
        System.out.println(name1); 
        int [] numbers=new int[5];
        numbers[1]=2;
        for(int x:numbers){
            System.out.print(x+",");
        }

    }
}