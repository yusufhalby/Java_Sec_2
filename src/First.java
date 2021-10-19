import java.util.Scanner;

public class First {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int num;
        int[] nums = new int[100];
        System.out.println("Enter the integers between 1 and 50");
        do {
            num = input.nextInt();
            nums[i]=num;
            i++;
        }
        while (num != 0);
        for (int j = 1; j <= 50; j++) {
            int count = 0;
            for (int k = 0; k <= i; k++){
                if (nums[k] == j) {
                    count++;
                }
            }
            if (count != 0){
                System.out.print( j + " occures " + count);
                if(count>1){System.out.println(" times");} else {System.out.println(" time");}
            }
        }
    }
}