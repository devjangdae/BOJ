n = int(input())
S = input()
C = [S.count(i) for i in "uospc"]

print(min(C))