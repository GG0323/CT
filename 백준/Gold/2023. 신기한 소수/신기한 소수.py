n = int(input())

def is_prime(n):
    for i in range(2,int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def back(num, lev):
    if lev == n:
        print(num)
        return
    for i in range(1, 10):
        if i % 2 == 0:
            continue
        prime = num * 10 + i
        if is_prime(prime):
            back(prime, lev + 1)

for i in [2,3,5,7]:
    back(i,1)