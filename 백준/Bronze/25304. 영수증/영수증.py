import sys
price = int(sys.stdin.readline())
items = int(sys.stdin.readline())
total_price = 0

for i in range(items):
    a, b = map(int, sys.stdin.readline().split())
    total_price += a*b

result = "Yes" if price == total_price else "No"
print(result)