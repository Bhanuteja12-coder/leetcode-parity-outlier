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