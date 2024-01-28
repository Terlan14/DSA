public class Product {
    public static void main(String[] args) {
        int [] array={1,2,3,4};
        int [] result=findProduct(array);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    /*given array arr [] return array result [] and result [i] equal all elements of array except arr [i]
    it should be O(n) time and without division operator
    for example:input is {1,2,3,4} output is {24,12,8,6}
    * */
    public  static int[] findProduct(int [] arr){
        int temp=1;
        int [] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=temp;   //1 1 2 6
            temp=temp*arr[i]; //1 2 6 24
        }
        temp=1;
        for (int i=arr.length-1;i>=0;i--){

            result[i]=temp*result[i];
            temp=temp*arr[i];
        }
        return result;
    }
}
