'''
	* Language - Python (Python3)
	* Level - Expert

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

    Problem - Create a simple Banking System using OOP Principles

	** Do not use any AI tool like Chat GPT or Google Bard
'''

class BankAccount:
    def __init__(self, accountNumber, balance):
        self.accountNumber = accountNumber
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds")

    def getBalance(self):
        return self.balance

account = BankAccount("123456789", 1000.0)
account.deposit(500.0)
account.withdraw(200.0)
print("Balance:", account.getBalance())