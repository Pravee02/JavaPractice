package ProblemSolving;

public class Findmaxmin {
    static void maxmin(int[] arr){
        if(arr.length==0){
            System.out.println("the array was empty");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the maximum number is "+max);
        System.out.println("the mini mum number is "+min);

    }
    public static void main(String[] args){
        int[] arr={2,5,6,1,0,8,44,5,99};
        maxmin(arr);
    }
}
