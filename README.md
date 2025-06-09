# 🔍 Find the Single Parity Outlier in a Sorted Array

## 📌 Problem Description

You are given a sorted array of integers where **all elements except one** have the same **parity** (either all even or all odd).  
The majority parity elements appear as a **single contiguous block** in the array.

Your task is to **identify and return the single element** that has a different parity (the outlier).

---

## 🔧 Constraints
- The input array is sorted in non-decreasing order.
- Exactly one element has a different parity than the rest.
- The majority parity elements form a contiguous block within the array.
- 3 ≤ n ≤ 10^5
- -10^9 ≤ nums[i] ≤ 10^9
- Expected Time Complexity: **O(log n)**
- Expected Auxiliary Space: **O(1)**

---

## 🧠 Approach / Hint

Use **binary search** to find the outlier:
- At each step, check the parity of the middle element.
- Compare it with the majority parity (detected from the first few elements).
- Narrow down search based on parity difference.
- Binary search works because the majority parity block is contiguous.

---

## 🧪 Examples

### Example 1:
```plaintext
Input:
7
2 4 6 8 9 10 12

Output:
9
```
### Example 2:
```plaintext
Input:
7
1 3 5 7 10 11 13

Output:
10
```

### Example 3:
```plaintext
Input:
3
2 3 4

Output:
3
```

---

## 🐍 Python Code

```python
def find_outlier(nums):
    first_parity = nums[0] % 2
    second_parity = nums[1] % 2

    if first_parity == second_parity:
        majority_parity = first_parity
    else:
        majority_parity = nums[2] % 2

    left, right = 0, len(nums) - 1
    while left < right:
        mid = (left + right) // 2
        if (nums[mid] % 2) == majority_parity:
            left = mid + 1
        else:
            right = mid
    return nums[left]
```

---

## ☕ Java Code

```java
public class Solution {
    public int findOutlier(int[] nums) {
        int firstParity = nums[0] % 2;
        int secondParity = nums[1] % 2;
        int majorityParity;

        if (firstParity == secondParity) {
            majorityParity = firstParity;
        } else {
            majorityParity = nums[2] % 2;
        }

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((nums[mid] % 2) == majorityParity) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
```

---

## 🙋 Why This Problem?

This problem is a neat and educational twist on binary search, emphasizing:

- Applying binary search in non-traditional ways
- Recognizing structural array properties
- Using parity for logic optimization

---

## 👤 Contributor
**Bhanu Teja**  
GitHub: [@Bhanuteja12-coder](https://github.com/Bhanuteja12-coder)