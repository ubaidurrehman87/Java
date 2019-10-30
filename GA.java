import java.util.*;
import org.apache.commons.lang3.ArrayUtils;
class GA{
    public static void fitness_func(int [][]array){
        Stack<Integer> mystack=new Stack<Integer>();
        int []fit=new int[4];
        for (int i = 0; i < 4; i++) {
            fit[i]=0;
        }
        int checker,count=0;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 8; k++) {
               mystack.push(array[i][j]);
                for(int j=k+1;j<8;j++){
                    if(checker==array[i][j]){
                        count++;
                    }
               }
               fit[i]+=count;
               count=0;
            }
            
        }
        System.out.print("Fitness Values: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(fit[i]);
                
            }
        // return fit;
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // int x=input.nextInt();
        boolean check=true;
        int array[][]=new int[4][8];
        for (int i=0;i<4;i++){
            for (int k = 0; k < 8; k++) {
                int ran=(int)(Math.random()*(8))+1;
                array[i][k]=ran;
                // removing duplication
                // check=Arrays.stream(array[i]).anyMatch(j -> j == ran);
                // if(check==false){
                //     array[i][k]=ran;
                // }
                // else{
                //     k--;
                // }
            }
           
        }
       for (int i = 0; i < 4; i++) {
           System.out.println("\narray "+(i+1)+"):    ");
            for (int k = 0; k < 8; k++) {
               System.out.print(array[i][k]);
           }
       }
       int [] fitness_test=new int[4];
       fitness_func(array);
    //    fitness_test=fitness_func(array);
    //    System.out.print("Fitness Values: ");
    //     for (int i = 0; i < 4; i++) {
    //         System.out.print(fitness_test[i]);
    //     }
        // String name=input.nextLine();
        // System.out.println(name);
        input.close();
    }

    
}