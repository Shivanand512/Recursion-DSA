public class Arraysorted{

    static boolean checkArraySort(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&checkArraySort(arr, index+1);
    }

     public static void main(String[] args) {
        int[] arr={2,3,4,25,67,89,90,92};
        System.out.println(checkArraySort(arr,0));
    }
}