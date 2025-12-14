import sys

N = int(input())
X = list(map(int, input().strip().split()))[:N]
X_ = sorted(set(X))

d2={X_[i] : i for i in range(len(X_))}

for i in X:
    print(d2[i], end = ' ')
            

    
