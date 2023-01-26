N, M = list(map(int, input().split()))
counter = 1
for n in range(N):
    # if we have found the middle row
    if n == N // 2:
        print("WELCOME".center(M, "-"))
        # counter needs to be decremented to previous value
        counter -= 2
        continue
    print((".|."*counter).center(M, "-"))
    # if we are in the first half of the rows
    if n < N // 2:
        counter += 2
    # if we are in the second half of the rows
    if n > N // 2:
        counter -= 2
