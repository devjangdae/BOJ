n, k, T = map(int, input().split())
d = [0] + list(map(int, input().split()))
T_lst = [T] + [0] * n

for i in range(n):
    if T_lst[i] > k:  # 물이 너무 뜨거울 때
        T_lst[i + 1] = T_lst[i] + d[i + 1] - abs(T_lst[i] - k)
    elif T_lst[i - 1] < k:  # 물이 너무 차가울 때
        T_lst[i + 1] = T_lst[i] + d[i + 1] + abs(T_lst[i] - k)
    else:  # 물 온도가 적절할 때
        T_lst[i + 1] = T_lst[i] + d[i + 1]

result = 0
for t in T_lst[1:]:
    result += abs(t - k)

print(result)