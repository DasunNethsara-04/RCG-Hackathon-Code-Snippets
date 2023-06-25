<?php
/*
	* Language - PHP
	* Level - Expert

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

    Problem - Create a simple Banking System using OOP Principles

	** Do not use any online help or AI tool like Chat GPT or Google Bard
*/

class BankAccount {
    private $accountNumber;
    private $balance;

    public function __construct($accountNumber, $balance) {
        $this->accountNumber = $accountNumber;
        $this->balance = $balance;
    }

    public function deposit($amount) {
        $this->balance += $amount;
    }

    public function withdraw($amount) {
        if ($this->balance >= $amount) {
            $this->balance -= $amount;
        } else {
            echo "Insufficient funds<br/>";
        }
    }

    public function getBalance() {
        return $this->balance;
    }
}

$account = new BankAccount("123456789", 1000.0);
$account->deposit(500.0);
$account->withdraw(200.0);
echo "Balance: " . $account->getBalance() . "<br/>";

?>