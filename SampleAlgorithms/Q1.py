#Bochao Zhang
#B00748967
#Assignment 1
#Question 1

def chop(tar,k):
    base=list(tar)
    choar=[]
    for i in range(len(base)-k+1):
        ktp=[]
        for j in range(i,i+k,1):
            ktp.append(base[j])
        ktp="".join(ktp)
        if ktp not in choar:
            choar.append(ktp)
    return choar

def makeGraph(gset):
    rr=[]
    re=[]
    for i in range(len(gset)):
        temp=chop(gset[i],2)
        for j in range(len(temp)):
            if temp[j] not in rr:
                rr.append(temp[j])
    for i in range(len(rr)-1):
        temp=[]
        temp.append(rr[i])
        temp.append(rr[i+1])
        re.append(temp)
    return rr,re

def nextNode(edge, current):
    return edge[0] if current == edge[1] else edge[1]

def removeEdge(rawlist, discard):
    return [item for item in rawlist if item != discard]

def findTour(graph):
    search = [[[], graph[0][0], graph]]
    while search:
        path, node, unexplore = search.pop()
        path += [node]

        if not unexplore:
            return path

        for edge in unexplore:
            if node in edge:
                search += [[path, nextNode(edge, node), removeEdge(unexplore, edge)]]

num=int(input("How many strings?\n"))
print("Enter these strings with with As, Ts, Gs and Cs:")
gset=[]
for i in range(num):
    usrin=str(input())
    gset.append(usrin)

chpr=[]
itr=3
for i in range(num):
    ktp=chop(gset[i],itr)
    for j in range(len(ktp)):
        if ktp[j] not in chpr:
            chpr.append(ktp[j])
grv,gre=makeGraph(chpr)
result = findTour(gre)
fin=[]
fin.append(result[0])
del(result[0])
for i in range(len(result)):
    temp=list(result[i])
    fin.append(temp[1])
fin=''.join(fin)
print("k="+str(itr))
print(fin)


