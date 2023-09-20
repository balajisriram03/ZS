n = int(input("Enter the number of nodes for the graph: "))
nlist = []
elist = []

for i in range(n):
    node = input()
    nlist.append(node)
    elist.append(i)

l = len(nlist)
l1 = l
for i in range(l1):
    for j in range(i + 1, l1):
        if nlist[i] == nlist[j]:
            elist[j] = i
            l = l - 1

mat = []
for row in range(l):
    t = [0] * l
    mat.append(t)

for i in range(l1 - 1):
    r = elist[i]
    c = elist[i + 1]
    mat[r][c] = 1

for row in mat:
    for col in row:
        print(col, end=" ")
    print()

print("Enter any two vertices: ")
v1 = input()
v2 = input()

e1 = -1
e2 = -1
for i in range(l1):
    if nlist[i] == v1:
        e1 = elist[i]
    if nlist[i] == v2:
        e2 = elist[i]

if e1 != -1 and e2 != -1:
    if mat[e1][e2] == 1:
        print("The given vertices are adjacent.")
    else:
        print("The given vertices are not adjacent.")
else:
    print("Invalid vertices entered.")