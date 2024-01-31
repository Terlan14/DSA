import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        int[]array={3,4,4,7,6,8,3,3};
        removeDuplicateElement(array);
        int[]sortedArray={0,1,1,2,2,2,3,4,5};
        System.out.println("number of unique elements are "+removeDuplicateElementArray(sortedArray));
    }
    //this method is used for given sorted array and return numbers of the unique elements in array
    public static int removeDuplicateElementArray(int [] array){
        int i=1;
        for(int j=1;j<array.length;j++){
            if(array[j-1]!=array[j]){
                array[i]=array[j];
                i++;
            }
        }
        return i;
    }

    //it's one approach
    public static void removeDuplicateElement(int []array){
        Set<Integer>set=new HashSet<>();
        List<Object> result=new ArrayList<>();
        int count=0;
        for (int i=0;i<array.length;i++){
            if(!set.contains(array[i])) {
                result.add(array[i]);
            }
            else
                count++;
            set.add(array[i]);
        }
        System.out.println("count is "+count);
        for(int i=0;i<=count;i++){
            result.add("_");
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i) +" ");
        }
        System.out.println();
    }

}