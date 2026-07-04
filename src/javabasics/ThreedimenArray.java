package javabasics;

public class ThreedimenArray {
        public static void main(String args[]){


// 3 dimentional array =3D → stack of tables
// arr[block][row][column]
            int arr[][][]=new int[2][2][2];

            int value = 1;

            for(int i = 0; i < arr.length; i++) {

                for(int j = 0; j < arr[i].length; j++) {
                    for(int k = 0; k < arr[i][j].length; k++) {
                        arr[i][j][k] = value++;
                    }
                }
            }

            // Printing
            for(int i = 0; i < arr.length; i++) {
                System.out.println("Block " + i);

                for(int j = 0; j < arr[i].length; j++) {
                    for(int k = 0; k < arr[i][j].length; k++) {
                        System.out.print(arr[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

