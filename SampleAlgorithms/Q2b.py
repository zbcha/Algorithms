#Bochao Zhang
#B00748967
#Assignment1
#Question 2a

import sys
pmin=-sys.maxsize

def maxcross(ar,low,mid,high):
    global pmin
    sm=0
    lsum=pmin
    rsum=pmin
    for i in range(mid,low-1,-1): 
        sm=sm+ar[i]         
        if(sm>lsum): 
            lsum=sm
    sm=0
    for i in range(mid+1,high+1,1): 
        sm=sm+ar[i] 
        if(sm>rsum): 
            rsum=sm
    return max(lsum+rsum,rsum,lsum) 
  

def findmax(ar,low,high): 
    if(high==low):
        return ar[high] 
    mid=(low+high)//2
    return max(findmax(ar,low,mid),findmax(ar,mid+1,high),maxcross(ar,low,mid,high)) 

def cirly(ar):
    return ar+ar

ss=[-2,1,-3,4,-1,2,1,-5,4]
print(findmax(cirly(ss),0,len(ss)-1))



