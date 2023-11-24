// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]
// Example 3:

// Input: rowIndex = 1
// Output: [1,1]

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(1L);
        
        while (n-- > 1) {
            ArrayList<Long> t = new ArrayList<>(ans.size() + 1);
            for (int i = 0; i < ans.size() + 1; i++) {
                t.add(1L);
            }
            
            for (int i = 1; i < ans.size(); i++) {
                t.set(i, (ans.get(i - 1) + ans.get(i)) % 1000000007);
            }
            
            ans = t;
        }
        return ans;
    }
}
