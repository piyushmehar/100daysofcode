if __name__ == '__main__':
    N = int(input())
    ans = []
for i in range(N):
    instr = input().split()
    if instr[0] == 'insert':
        ans.insert(int(instr[1]), int(instr[2]))
    elif instr[0] == 'print':
        print(ans)
    elif instr[0] == 'remove':
        ans.remove(int(instr[1]))
    elif instr[0] == 'append':
        ans.append(int(instr[1]))
    elif instr[0] == 'sort':
        ans.sort()
    elif instr[0] == 'pop':
        ans.pop(len(ans) - 1)
    elif instr[0] == 'reverse':
        ans.reverse()
