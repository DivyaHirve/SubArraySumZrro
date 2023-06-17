import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // finding subsequence by bit manipulation
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];

        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        // total no. of subsequence
        int n =((int)Math.pow(2 , arr.length))-1;

        while(n>=0){
            String ans="";
            // convert n to binary
            String b = Integer.toString(n , 2);

            // zeroes in the start which are not there in b which we have to add
            int x = arr.length-b.length();

            for(int k=0 ; k<x ; k++){
                b = '0' +  b  ;
            }

            int sum = 0;
            for(int j=0 ; j<b.length() ; j++){
                if(b.charAt(j)=='1'){
                    // add characters where binary digit is one
                    ans = ans + ""+ arr[j]+" ";
                    sum+=arr[j];
                }
            }

            if(sum==0){
                System.out.print(ans+" ");
                return;
            }

            n--;
        }
    }
}