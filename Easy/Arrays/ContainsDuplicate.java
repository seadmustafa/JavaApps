import java.util.*;
// This is a java program that helps to find if the array contains any duplicates.
// Function will return true if any value appears at least twice in the array, and it will return false if every element is distinct.
class ContainsDuplicate {
public boolean containsDuplicate(int[] nums) {
         
        HashSet<Integer> array = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(array.contains(nums[i])) return true; 
                array.add(nums[i]);    
        }
        return false;
    }
    
    public static void main (String[] args) {
    
    int[] firstarray = {1,2,3,4,1};
	  int[] secondarray={1,2,4};	
    int[] nums = {};    
    ContainsDuplicate cd = new ContainsDuplicate();
    System.out.println(cd.containsDuplicate(firstarray));
    System.out.println(cd.containsDuplicate(secondarray));
    System.out.println(cd.containsDuplicate(nums));
    
    }
    }
