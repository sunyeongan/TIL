from collections import Counter
class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        words = [word for word in re.sub(r'[^\w]',' ', paragraph).lower().split() if word not in banned]
        return Counter(words).most_common()[0][0]