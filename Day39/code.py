def merge_the_tools(string, k):
    for x in range(len(string) // k):
        res = []
        for letter in string[x*k : x*k+k]:
            if letter not in res: res.append(letter)
        print(''.join(res))

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
