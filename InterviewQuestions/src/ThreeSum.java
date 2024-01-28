// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ThreeSum {
    public static void main(String[] args) {
        int [] array={3,4,5,1,2,7,8,6,9};
        threeSum(array,8);
    }
    //it's simplest sorting alghoritm just for implementation so BubleSort
    public static void sortArray(int [] arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            //this condition checks if there is no element left for spawwing then break
            if(swapped=false){
                break;
            }
        }
    }

    public static void threeSum(int [] arr,int target)
    {
        sortArray(arr);
        for (int i=0;i< arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                    System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    j++;
                    k--;
                } else if (sum<target) {
                    j++;
                }
                else
                    k--;
            }
        }
    }
}