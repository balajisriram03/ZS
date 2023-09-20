arr  = ["1","2","3","4","5","6","3","4","1"]
arr1 = []
for i in range(len(arr)):
    for j in range(i+1, len(arr)):
         if arr[i] == arr[j] and arr[i] not in arr1:
            arr1.append(arr[i])
print ("The duplicates in the number are" ,arr1)
    

