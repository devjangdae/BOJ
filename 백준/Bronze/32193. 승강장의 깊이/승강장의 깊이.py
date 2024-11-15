import sys
input = sys.stdin.readline

N = int(input())
platform = [0]  # 원본 배열
S = [0] * (N + 1)  # 누적합 배열

# 원본 배열 작업
for _ in range(N):
    A, B = map(int, input().split())
    platform.append(A - B)

# 누적합 배열 작업
for k in range(1, N + 1):
    S[k] = S[k - 1] + platform[k]

# 출력
for i in S[1:]:
    print(i)