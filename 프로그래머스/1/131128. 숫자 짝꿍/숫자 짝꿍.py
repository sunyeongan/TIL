
from collections import Counter
def solution(X, Y):
    cc = ''
    X_, Y_ = sorted(list(map(int, X))), sorted(list(map(int, Y)))
    X_c, Y_c = Counter(X_), Counter(Y_)
    is_ = set(X_) & set(Y_)
    answer = sorted(list(is_), reverse=True)            
    
    for i in answer:
        X_c[i] = min(X_c[i],Y_c[i])
        cc += str(i) * X_c[i]
    
    if cc == "":
        cc = "-1"
    if cc[0] == "0":
        cc = "0"
    return cc