import sys
input = sys.stdin.readline

S = input().rstrip()

if S == ")1(" : 
    print(2)

elif S == "(1)" : 
    print(0)
else : 
    print(1)