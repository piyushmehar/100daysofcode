if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    lsti = []
lstj = []
lstk = []
lstc = []

lsti = [i for i in range(x+1)]
lstj = [j for j in range(y+1)]
lstk = [k for k in range(z+1)]

lstc =[[i, j, k] for i in lsti for j in lstj for k in lstk if i+j+k!=n]


print(lstc)
