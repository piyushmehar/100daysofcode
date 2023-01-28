def print_rangoli(size):
    
    height = 2*size - 1
    width = 2*height - 1

    l = []
    next_mid = chr(96 + size)

    for i in range(size, -size+1, -1):
        if i == size:
            # first character
            l.append(next_mid)
        elif i in range(size, 0, -1):
            # top and middle
            middle = len(l)//2
            previous_mid = next_mid
            next_mid = chr(96 + i)
            l.insert(middle, next_mid)
            l.insert(middle, previous_mid)
        else:
            # bottom
            middle = len(l)//2
            l.pop(middle)
            l.pop(middle)
        string = '-'.join(l)
        string = string.center(width, '-')
        print(string)
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
