class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = []
        p = 1
        for i in range(len(nums)):
            l.append(p)
            p = p * nums[i]
        p = 1
        for i in range(len(nums)-1, -1, -1):
            l[i] = l[i] * p
            p = p * nums[i]
        return l
