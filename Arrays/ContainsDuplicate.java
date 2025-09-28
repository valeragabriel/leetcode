package Arrays;

import java.util.HashSet;

class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    } 
    return false;
  }


  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 }));
    System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4 }));
    System.out.println(containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));    
  }
}