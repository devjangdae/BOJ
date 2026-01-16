for _ in range(int(input())):
    num = int(input())
    start_num = num
    while num >= 100:
        print(num)
        num = num // 10 - num % 10
    print(num)
    if start_num % 11 == 0:
        print(f"The number {start_num} is divisible by 11.")
    else:
        print(f"The number {start_num} is not divisible by 11.")
    print()