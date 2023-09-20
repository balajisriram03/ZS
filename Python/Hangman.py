import random

max_attempts = 5
word = ""
wordDictionary = {
    "PROGRAMMING": "_ _ O _ _ _ _ _ I _ _",
    "PLAYGROUND": "P _ _ _ _ R _ _ _ _",
    "AMBITION": "_ M _ _ T _ _ _"
}


def generateRandom():
    n = random.randint(0, len(wordDictionary) - 1)
    return n


def getInput():
    name = input("Enter your Name: ")
    return name


def getKeys(n):
    allKeys = list(wordDictionary.keys())
    global word
    word = allKeys[n]
    dashedTemplate = wordDictionary[word]
    return dashedTemplate


def replaceDash(dashed_template):
    letter = input("Guess a letter: ")
    
    if letterCheck(letter):
        for i in range(len(word)):
            if word[i] == letter:
                dashed_template = dashed_template[:i] + letter + dabashed_template[i+1:]
    else:
        print("Incorrect guess!")

    print(dashed_template)
    return dashed_template


def letterCheck(letter):
    return word.find(letter) != -1


print("Hello, ", getInput(), " Welcome to Hangman.")
n = generateRandom()
dashed_template = getKeys(n)
print(dashed_template)

while word != dashed_template:
    dashed_template = replaceDash(dashed_template)
    if word == dashed_template:
        print("Congratulations! You guessed the word correctly.")
    elif max_attempts == 0:
        print("Oops! You have run out of attempts. The word was:", word)
        break
    else:
        max_attempts -= 1
        print("Attempts remaining:", max_attempts)

