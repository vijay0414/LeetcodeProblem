class Solution(object):
    def mirrorDistance(self, n):
        """
        :type n: int
        :rtype: int
        """
        return abs(n - self.rev(n))

    def rev(self , n):
        rem = 0
        while(n != 0):
            d = n%10
            rem = rem * 10 + d
            n /= 10
        return rem