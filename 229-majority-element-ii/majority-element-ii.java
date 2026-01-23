class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int element1 = -100001, element2 = 100001;
        
        for (int element : nums) {
            if (count1 == 0 && element != element2) {
                element1 = element;
                count1 = 1;
            } 
            else if (count2 == 0 && element != element1) {
                element2 = element;
                count2 = 1;
            } 
            else if (element == element1) {
                count1++;
            } 
            else if (element == element2) {
                count2++;
            } 
            else {
                count1--;
                count2--;
            }
        }
        
        List<Integer> majority = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        
        for (int element : nums) {
            if (element == element1) count1++;
            else if (element == element2) count2++;
        }
        
        int target = nums.length / 3;
        
        if (count1 > target) majority.add(element1);
        if (count2 > target) majority.add(element2);
        Collections.sort(majority);
        return majority;
    }
}