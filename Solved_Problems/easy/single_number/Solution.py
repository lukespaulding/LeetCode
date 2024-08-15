class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        checkedNums = []
        for x in nums:
            if x in checkedNums:
                checkedNums.remove(x)
            else: 
                checkedNums.append(x)
        return checkedNums[0]