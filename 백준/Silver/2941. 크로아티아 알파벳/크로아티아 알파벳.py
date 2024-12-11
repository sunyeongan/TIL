import sys
word = sys.stdin.readline()

c_alpabet = ("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
for a in c_alpabet:
    word = word.replace(a, "*")
print(len(word)-1)
