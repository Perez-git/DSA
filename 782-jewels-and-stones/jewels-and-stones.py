class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        # Time: o(s + j)
        jewels = set(jewels)
        numJ = 0

        for s in stones: # O(S)

            if s in jewels: # O(J)
                numJ += 1
        
        return numJ