import sys

def cal_char(a):
    hp = a[0] + a[4]
    if hp < 1:
        hp = 1
    mp = a[1] + a[5]
    if mp < 1:
        mp = 1
    st = a[2] + a[6]
    if st < 0:
        st = 0
    de = a[3] + a[7]
    v1 = (hp * 1) + (mp * 5) + (st * 2) + (de * 2)
    return v1

a = int(sys.stdin.readline().rstrip())

lst = []
for i in range(a):
    b = sys.stdin.readline().rstrip()
    lst.append(b.split())
    lst[i] = list(map(int, lst[i]))
    print(cal_char(lst[i]))