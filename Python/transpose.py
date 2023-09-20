arr=[[1,2,3],[4,5,6],[7,8,9]]
lst=[0,0,0],[0,0,0],[0,0,0]
for i in range(0,len(arr)):
    for j in range(0,len(arr[i])):
        lst[i][j]=arr[j][i]
print (lst)
