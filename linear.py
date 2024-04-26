def linearcongruential(Xo,m,a,c,randNos,noOfRandNos):
    randNos[0]=Xo
    for i in range(1,noOfRandNos):
        randNos[i]=((randNos[i-1]*a)+c)%m

if __name__=='__main__':
    Xo=5
    m=7
    a=3
    c=3
    noOfRandNos=5
    randNos=[0]*(noOfRandNos)
    linearcongruential(Xo,m,a,c,randNos,noOfRandNos)
    for i in randNos:
        print(i,end=" ")
