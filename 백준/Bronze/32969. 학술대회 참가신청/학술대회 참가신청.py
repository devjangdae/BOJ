import sys
input = sys.stdin.readline

title = input()

if ("social" in title or "history" in title or "language" in title or "literacy" in title) : 
    print('digital humanities')
else : 
    print('public bigdata')