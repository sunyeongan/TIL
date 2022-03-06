import re
p = re.compile('[a-zA-Z]+')
print(len(p.findall(input())))
