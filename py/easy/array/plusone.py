from typing import List
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        last = len(digits)-1
        while last != -1:
            if(digits[last] < 9):
                digits[last] += 1
                return digits
            digits[last] = 0
            last -= 1
        result = [1] + digits
        return result

test = [1,2,3]
test = [4,3,2,1]
test = [9]
test = [9,0,9]
print(Solution().plusOne(test))




