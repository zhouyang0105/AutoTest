package mianshi;

public class MidSearch {

    public  static void main(String[] args){
        int[] arr = {1,3,5,7,9,11};
        int key = 9;
        int position = binarySearch(arr,key,0,arr.length - 1);


        if(position == -1){
            System.out.println("查找的是"+key+",序列中没有该数！");
        }else{
            System.out.println("查找的是"+key+",找到位置为："+position);
        }

    }
    public static int binarySearch(int[] arr,int target,int left,int right) {

        if (target < arr[left] || target > arr[right] || left > right) {
            return -1;
        }

        int middle = (left + right) / 2;            //初始中间位置
        if (arr[middle] > target) {
            //比关键字大则关键字在左区域
            return binarySearch(arr, target, left, middle - 1);
        } else if (arr[middle] < target) {
            //比关键字小则关键字在右区域
            return binarySearch(arr, target, middle + 1, right);
        } else {
            return middle;
        }
    }
}
