dial = list(input())
AZ_dict = {"ABC":3, "DEF":4, "GHI":5, "JKL":6, "MNO":7, "PQRS":8, "TUV":9, "WXYZ":10}

total_time = 0

for d in dial:
    for t in AZ_dict:
        if d in t:
            total_time += AZ_dict[t]
print(total_time)