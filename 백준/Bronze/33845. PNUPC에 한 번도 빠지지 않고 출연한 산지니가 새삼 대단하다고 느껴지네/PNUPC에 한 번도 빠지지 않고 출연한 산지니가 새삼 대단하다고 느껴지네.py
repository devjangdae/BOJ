S = input()
T = input()
result = ""
 
for i in T:
    if i not in S:
        result += i
 
print(result)