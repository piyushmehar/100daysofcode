import math
import os
import random
import re
import sys

#import datetime modules
from datetime import date
from datetime import time
from datetime import datetime
from datetime import timedelta

# Complete the time_delta function below.
def time_delta(t1, t2):
    date1 = datetime.strptime(t1,"%a %d %b %Y %H:%M:%S %z")
    date2 = datetime.strptime(t2,"%a %d %b %Y %H:%M:%S %z")
    
    timedelta = date1 - date2
    
    timedelta = abs(timedelta.total_seconds())
    
    tdelta = ("{:.0f}".format(timedelta))
    return tdelta

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        t1 = input()
        t2 = input()
        delta = time_delta(t1, t2)
        fptr.write(delta + '\n')
    fptr.close()
