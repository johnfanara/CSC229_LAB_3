package com.mycompany.csc229_lab_3;

/**
 *
 * @author johnf
 */
public class ComputeBig {
    
    public static int getLargest(int arr[], int sz){
        int iterate1 = 0; //1
        int iterate2 = 0; //1
        int largest = 0;  //1
        while(iterate1 < sz - 1) { //n 
            iterate2++; //1
            if(iterate2 == sz) {//1
                iterate1++;//1
                iterate2 = iterate1;//1
                continue;//1
            }
            int product = arr[iterate1] * arr[iterate2];//n
            if(product > largest){ //1
                largest = product; //1
            }
        }
        return largest; //1
    }
    //2n + 10 -> 2n -> O(n)
}


