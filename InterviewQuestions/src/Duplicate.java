import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int [] array={1,2,3,4,7,5,6,8};
        System.out.println(containsDuplicateElement(array));
    }
    //now we use additional data structure but time complexity is O(n) because of only 1 for loop
    public static boolean containsDuplicateElement(int []array){
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i]))
                return true;
            set.add(array[i]);
        }
        return false;
    }
    //this method checks if there is repeated element in given array return true otherwise false
    //this method waste time because time complexity is O(n²)
    /*public static boolean containsDuplicateElement(int []array){
        boolean duplicate=false;
        for(int i=0;i<array.length;i++){
            for (int j=1+i;j<array.length;j++){
                if(array[i]==array[j])
                    duplicate=true;
            }
        }
        return duplicate;
    }*/
    //finally we approach another way .Firstly , we sort array and if there is duplicate element they wil locate side by side
    //but it is not enough ,time complexity is O(nlogn)
}
