class Solution(object):
    def isStrictlyPalindromic(self, n):
        """
        :type n: int
        :rtype: bool
        """
        for i in range(2 , n - 1):
            b = self.base(n,i)
            if(b != b[::-1]):
                return False
        return True
    def base(self,n,i):
        di=[]
        while(n > 0):
            d = n % i
            di.append(str(d))
            n //= i
        return "".join(di)
  