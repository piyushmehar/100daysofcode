# number conversion in octal hexadecimal binary 

def print_formatted(number):
    len_b = len(f'{number:b}')
    for i in range(1,number+1):
        print(f'{i:d}'.rjust(len_b), f'{i:o}'.rjust(len_b), f'{i:X}'.rjust(len_b), f'{i:b}'.rjust(len_b), end='\n')       
if __name__ == '__main__':
    n = int(input())
    print_formatted(n)

    
# Sample Input
# 17


# Sample Output

#     1     1     1     1
#     2     2     2    10
#     3     3     3    11
#     4     4     4   100
#     5     5     5   101
#     6     6     6   110
#     7     7     7   111
#     8    10     8  1000
#     9    11     9  1001
#    10    12     A  1010
#    11    13     B  1011
#    12    14     C  1100
#    13    15     D  1101
#    14    16     E  1110
#    15    17     F  1111
#    16    20    10 10000
#    17    21    11 10001
