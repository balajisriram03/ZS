lst = list()
numwords = int(input("Enter the list of words you want to add to the list:"))
for i in range(0, numwords):
  print("Say word", i + 1)
  txt = input()
  lst.append(txt)

print( "Enter 1 if you want to make title case character by capitalizing first letter: ")
print("Enter 2 if you want captalize the whole word in the list:  ")
print("Enter 3 if you want to find no of vowels in the given words in the list")
print("Enter 4 if you want to find frequency of the vowel ")
print("Enter 5 if you  want to reverse the word")

selectedop = int(
    input("Enter a number from from 1 to 5 to do the given function:"))

if (selectedop==1):
  updlst= list()
  for i in range(0,len(lst)):
    word = lst[i].title()
    updlst.append(word)
  print(updlst)
  
elif(selectedop == 2):
  upper = list()
  for i in range(0,len(lst)):
    word = lst[i].upper()
    upper.append(word)
  print(upper)

elif(selectedop == 3):
  for i in range(0,len(lst)):
    count=0
    word = lst[i]
    for j in range(0,len(word)):
      if(word[j] == 'a' or word[j] == 'e' or word[j] == 'i' or word[j] == 'o' or word[j] == 'u' or word[j] == 'A' or word[j] == 'E' or word[j] == 'I' or word[j] == 'O' or word[j] == 'U'):
        count+=1
    print("The total no of vowels in the given list is ",word," is ",count)
elif(selectedop == 4):
  char = input("Enter a character:")
  for i in range(0,len(lst)):
    word = lst[i]
    print("The number of ",char ," in ",word," is ",word.count(char))

elif(selectedop == 5):
  updlist = list()
  reversedword = ""
  for i in range(0,len(lst)):
    word = lst[i]
    reversedword = word[::-1]
    updlist.append(reversedword)
  print("The reversed word is ", updlist)
  
    

