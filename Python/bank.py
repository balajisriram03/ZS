balance = 0
pin = "1234"

def deposit(amount):
    global balance
    balance += amount
    print(f"You have deposited {amount}. Your new balance is {balance}.")

def withdraw(amount):
    global balance
    if balance >= amount:
        balance -= amount
        print(f"You have withdrawn {amount}. Your new balance is {balance}.")
    else:
     print("Insufficient funds.")

def check_balance():
    global balance
    print(f"Your current balance is {balance}.")

def change_pin():
    global pin
    new_pin = input("Enter your new PIN: ")
    confirm_pin = input("Confirm your new PIN: ")
    if new_pin == confirm_pin:
        pin = confirm_pin
        print("Your PIN has been changed successfully.")
    else:
        print("PINs do not match. Please try again.")

def handle_input():
    action = input("What would you like to do? (deposit, withdraw, check balance, change PIN) ")
    if action == "deposit":
        amount = float(input("How much would you like to deposit? "))
        deposit(amount)
    elif action == "withdraw":
        amount = float(input("How much would you like to withdraw? "))
        withdraw(amount)
    elif action == "check balance":
        check_balance()
    elif action == "change PIN":
        change_pin()
    else:
        print("Invalid input. Please try again.")


def authenticate():
    attempts = 0
    while attempts < 3:
        pin_attempt = input("Please enter your PIN: ")
        if pin_attempt == pin:
            return True
        else:
            attempts += 1
            print("Incorrect PIN. Please try again.")
    return False


while True:
    authenticated = authenticate()
    if authenticated:
        handle_input()
    else:
        print("Too many incorrect attempts. Account locked.")
        break











