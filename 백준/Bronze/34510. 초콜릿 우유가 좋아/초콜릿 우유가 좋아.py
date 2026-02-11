def s():
    a,b,c,n=map(int,open(0).read().split())
    print((a+b)*(n&1)+b*(n>>1)+c*n)
s()