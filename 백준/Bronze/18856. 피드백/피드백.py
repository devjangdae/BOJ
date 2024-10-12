N = int(input())
li = [1]*230
for i in range(2, int(230**0.5)+1):
    if li[i] == 1:
        for j in range(i+i, 230, i):
            li[j] = 0
prime = [i for i in range(2, 230) if li[i] == 1]
res = [1] + prime[:N-1]
print(N)
print(*res)