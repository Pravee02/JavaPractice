package javabasics;

public class Array3 {
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6};
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }

        int num[][]=new int[3][4];
        int value=1;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = value;
                value++;
            }
        }




        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
