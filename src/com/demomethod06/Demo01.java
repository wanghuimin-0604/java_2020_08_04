package demomethod06;

import java.util.Arrays;

/*
冒泡排序:由小到大，升序排列
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void bubbleSort(int[] arr) {
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            //因为不一定一开始就是有序的
            //他可能在排序的过程当中的某一次
            //忽然有序了
            flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){//如果是有序的话，就直接结束程序
                return;
            }
        }
    }
}
