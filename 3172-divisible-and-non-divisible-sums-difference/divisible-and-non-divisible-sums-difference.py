class Solution(object):
    def differenceOfSums(self, n, m):
        """
        :type n: int
        :type m: int
        :rtype: int
        """
        sum = 0
        sumdiv = 0
        for i in range(1,n + 1):
            if(i % m == 0):
                sumdiv += i
            else:
                sum += i
        return sum - sumdiv