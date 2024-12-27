import sys
A,B = map(int,sys.stdin.readline().split())
a = set(map(int,sys.stdin.readline().split()))
b = set(map(int,sys.stdin.readline().split()))

print(len(list((a-b)|(b-a))))