Q = int(input())

for _ in range(Q):
    S = input()
    result = 0
    for i in range(len(S) - 2):
        if S[i : i + 3] == "WOW":
            result += 1

    print(result)