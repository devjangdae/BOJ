res = "left"
while True:
    n = input()

    if n == "99999":
        break

    sum_num = int(n[0]) + int(n[1])

    if sum_num == 0 :
        pass
    elif sum_num % 2 == 1:
        res = "left"
    else:
        res = "right" if res == "left" else "right"

    print(f"{res} {n[2:]}")