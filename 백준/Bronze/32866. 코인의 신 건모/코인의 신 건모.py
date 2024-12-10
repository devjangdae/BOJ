import sys
input = sys.stdin.readline

N = int(input())
X = int(input())

temp_result = N - N * (X/100)
result = N / temp_result - 1

print(round(result * 100, 6))