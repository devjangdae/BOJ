import sys

T=int(sys.stdin.readline())

for _ in range(T):
    n=int(sys.stdin.readline())

    count=0

    for i in range(1,n):

        if i**2<=n:
            count=count+1
        elif i**2>n:
            break

    print(count)