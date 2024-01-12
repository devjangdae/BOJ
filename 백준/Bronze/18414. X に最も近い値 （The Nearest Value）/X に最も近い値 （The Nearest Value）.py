X, L, R = map(int, input().split())
smallest = 999999999999999999999999999999999
ans = 0
 
for i in range(L, R+1, 1):
    temp = abs(X-i)
    if temp<smallest:
        smallest=temp
        ans = i
print(ans)
