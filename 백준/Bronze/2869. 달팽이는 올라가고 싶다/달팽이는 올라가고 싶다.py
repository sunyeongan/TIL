import sys

A,B,V = map(int,sys.stdin.readline().split())

print((V - B - 1) // (A - B) + 1)