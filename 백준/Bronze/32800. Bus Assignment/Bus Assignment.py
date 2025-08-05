from sys import stdin
input = stdin.readline
passengers = 0
res = 0

for _ in range(int(input())):
    a, b = map(int, input().split())
    passengers = passengers - a + b
    res = max(res, passengers)

print(res)