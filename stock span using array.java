import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int span = 1; // Default span is at least 1 (current day)
            
            // Check previous days for the nearest greater element
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    span = i - j;
                    break;
                }
            }
            
            list.add(span); // Add the calculated span
        }
        
        return list;
    }
}
