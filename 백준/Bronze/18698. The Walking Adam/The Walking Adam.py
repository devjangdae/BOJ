trials = int(input())
 
for i in range(trials):
    _ = input()
    print ( len(_[:_.index("D")]) if "D" in _ else len(_) )