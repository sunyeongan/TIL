class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        gain = 0
        min_value = sys.maxsize

        for val in prices:
            min_value = min(min_value, val)
            gain = max(gain, val-min_value)
            #print(gain)
        return gain