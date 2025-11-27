import sys
input = sys.stdin.readline
from math import *

T = int(input())
for _ in range(T):
    possible_set = []
    n = int(input())
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i*j > n:
                break
            for k in range(1, ceil(sqrt(n))+1):
                if i*j*k == n:
                    possible_set.append((i, j, k))
                    break
    min_val = 1e9
    for a, b, c in possible_set:
        if min_val > 2*(a*b + b*c + c*a):
            min_val = 2*(a*b + b*c + c*a)
    print(min_val)