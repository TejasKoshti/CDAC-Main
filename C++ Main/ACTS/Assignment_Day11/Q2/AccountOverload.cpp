#include <iostream>
#include <string>

using namespace std;

class Account {
private:
    string accountHolder;
    int accountNumber;
    double balance;

public:
    // Default constructor
    Account() : accountHolder(""), accountNumber(0), balance(0.0) {}

    // Parameterized constructor
    Account(const string& holder, int number, double bal) 
        : accountHolder(holder), accountNumber(number), balance(bal) {}

    // Overload >> operator for input
    friend istream& operator>>(istream& in, Account& account) {
        cout << "Enter account holder's name: ";
        in.ignore();  // Ignore newline character left in buffer
        getline(in, account.accountHolder);
        cout << "Enter account number: ";
        in >> account.accountNumber;
        cout << "Enter balance: ";
        in >> account.balance;
        return in;
    }

    // Overload << operator for output
    friend ostream& operator<<(ostream& out, const Account& account) {
        out << "Account Holder: " << account.accountHolder << "\n"
            << "Account Number: " << account.accountNumber << "\n"
            << "Balance: $" << account.balance << "\n";
        return out;
    }
};

int main() {
    Account acc;
    cin >> acc; // Input account details
    cout << acc; // Output account details

    return 0;
}
