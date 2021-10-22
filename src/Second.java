import java.util.Scanner;

public class Second {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //int [] arr = new int[10];
        int [] arr  = {1,2,3,1,4,5,2,6,7,8};
    }
    public static int[] eliminateDuplicates(int[] list){
        int[] arr = new int[100];
        int temp =list[0];
        for(int i = 0; i<list.length; i++){
            if (temp<list[i]){
                temp = list[i];
            }
        }
        for(int i = 1; i <= temp; i++){
            for(int j = 0; j < 10; j++){
                if(list[j] == i){}
            }
        }


        return list;
    }
}