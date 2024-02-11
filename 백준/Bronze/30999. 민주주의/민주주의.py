N, M = map(int, input().split())

M = (M // 2) + 1

proCnt = 0

for i in range(N) : 
    result = input()
    
    cnt = 0
    
    for j in result : 
        if j == 'O' : 
            cnt += 1
    
    if M <= cnt : 
        proCnt += 1
        
print(proCnt)