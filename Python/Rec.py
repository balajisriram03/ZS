def print_name(name, count):
    if count <= 0:
        return
    print(name)
    print_name(name, count - 1)

name = "Balaji"
print_name(name, 5)