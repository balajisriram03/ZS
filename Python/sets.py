'''set1 = {2,4,6,8}
set2 = {1,5,7,9}
print(set1.union(set2))
print(set1.intersection(set2))'''
def intersection():
    l=[]
    a=set(input('Enter an set(without comma): '))
    b=set(input('Enter another set:(without comma) '))
    for i in a:
        for j in b:
            if i==j and (i or j) not in l:
                l.append(i)
                break
    print(l)

def union():
    m=[]
    a=set(input('Enter an set(without comma): '))
    b=set(input('Enter another set:(without comma) '))
    for i in a:
        m.append(i)
    for j in b:
        if j not in m:
            m.append(j)
    print(m)


def aminusb():
    n=[]
    a=set(input('Enter an set(without comma): '))
    b=set(input('Enter another set:(without comma) '))
    for i in a:
            if i not in (a and b):
                n.append(i)
    print(n)

def bminusa():
    o=[]
    a=set(input('Enter an set(without comma): '))
    b=set(input('Enter another set:(without comma) '))
    for i in b:
            if i not in (b and a):
                o.append(i)
    print(o)

def main():
    while True:
        print("\nMenu:")
        print("1. Find Intersection of Two Sets")
        print("2. Find Union of Two Sets")
        print("3. Find A - B (Elements in Set A but not in Set B)")
        print("4. Find B - A (Elements in Set B but not in Set A)")
        print("5. Exit")

        choice = input("Enter your choice (1/2/3/4/5): ")

        if choice == '1':
            intersection()
        elif choice == '2':
            union()
        elif choice == '3':
            aminusb()
        elif choice == '4':
            bminusa()
        elif choice == '5':
            print("Exiting...")
            break
        else:
            print("Invalid choice! Please select a valid option (1/2/3/4/5).")

main()
