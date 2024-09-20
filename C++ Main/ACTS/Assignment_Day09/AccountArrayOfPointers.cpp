//Use array of pointers in account assignment.
#include <iostream>
#include <string>
using namespace std;

class Account {
private:
    int accountNo;
    string accountHolderName;
    int branchCode;
    double balance;

public:
    static int nextAccountNo;

    Account() : accountNo(nextAccountNo++), branchCode(0), balance(0.0) {}

    void AcceptData() {
        cin.ignore();
        cout << "Enter account holder name: ";
        getline(cin, accountHolderName);
        cout << "Enter branch code: ";
        cin >> branchCode;
        cout << "Enter initial balance: ";
        cin >> balance;
    }

    void DisplayData() const {
        cout << "Account Number: " << accountNo << endl;
        cout << "Account Holder Name: " << accountHolderName << endl;
        cout << "Branch Code: " << branchCode << endl;
        cout << "Balance: " << balance << endl;
    }

    void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Deposited: " << amount << endl;
        } else {
            cout << "Invalid deposit amount." << endl;
        }
    }

    void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "Withdrawn: " << amount << endl;
        } else {
            cout << "Invalid withdraw amount or insufficient funds." << endl;
        }
    }

    int getAccountNo() const {
        return accountNo;
    }

    static Account* findAccount(Account** arr, int size, int accNo) {
        for (int i = 0; i < size; ++i) {
            if (arr[i]->getAccountNo() == accNo) {
                return arr[i];
            }
        }
        return nullptr;
    }
};

int Account::nextAccountNo = 1000;

int main() {
    int n;
    cout << "Enter the number of accounts: ";
    cin >> n;

    Account** accArr = new Account*[n];
    for (int i = 0; i < n; ++i) {
        accArr[i] = new Account();
        cout << "Entering details for account " << accArr[i]->getAccountNo() << ":\n";
        accArr[i]->AcceptData();
    }

    int choice;
    int accNo;
    double amount;

    do {
        cout << "Menu: \n";
        cout << "1. Deposit\n";
        cout << "2. Withdraw\n";
        cout << "3. Display Account Data\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter account number to deposit: ";
                cin >> accNo;
                cout << "Enter amount to deposit: ";
                cin >> amount;
                {
                    Account* acc = Account::findAccount(accArr, n, accNo);
                    if (acc) {
                        acc->Deposit(amount);
                    } else {
                        cout << "Account number not found." << endl;
                    }
                }
                break;
            case 2:
                cout << "Enter account number to withdraw from: ";
                cin >> accNo;
                cout << "Enter amount to withdraw: ";
                cin >> amount;
                {
                    Account* acc = Account::findAccount(accArr, n, accNo);
                    if (acc) {
                        acc->Withdraw(amount);
                    } else {
                        cout << "Account number not found." << endl;
                    }
                }
                break;
            case 3:
                cout << "Enter account number to display: ";
                cin >> accNo;
                {
                    Account* acc = Account::findAccount(accArr, n, accNo);
                    if (acc) {
                        acc->DisplayData();
                    } else {
                        cout << "Account number not found." << endl;
                    }
                }
                break;
            case 4:
                cout << "Exiting program." << endl;
                break;
            default:
                cout << "Invalid choice. Try again." << endl;
        }
    } while (choice != 4);

    for (int i = 0; i < n; ++i) {
        delete accArr[i];
    }
    delete[] accArr;

    return 0;
}
