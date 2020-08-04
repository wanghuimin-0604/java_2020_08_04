package demomethod06;

import java.util.Arrays;

/*

给定两个整型数组, 交换两个数组的内容.
    创建两个整型数组，创建对象来进行交换

 */
public class SwapArray {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{5,6,7,8};
        int[] temp;
        System.out.println("交换前");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        temp=arr1;
        arr1=arr2;
        arr2=temp;
        System.out.println("###############");
        System.out.println("交换后");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
