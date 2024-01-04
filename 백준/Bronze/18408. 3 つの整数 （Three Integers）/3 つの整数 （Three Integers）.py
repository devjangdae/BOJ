lst = list(map(int, input().split()))
print('1' if lst.count(1) > lst.count(2) else '2')