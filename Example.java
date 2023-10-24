import java.util.HashMap;

 class Array {
    public static void main(String[] args) {
        int nums[];
        int target;
        
           HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (h.containsKey(complement)) {
                return  int[]{h.get(complement), i};
            }
            h.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}