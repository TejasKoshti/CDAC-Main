
#include "Footballer.h"
#include <iostream>
using namespace std;

// Default constructor
Footballer::Footballer(){}

// Parameterized constructor
Footballer::Footballer(string name,int age,int score):score(score){}

// Method to accept footballer details from the user
void Footballer::Accept() {
    Player::Accept();
    cout << "Enter Footballer's Score: ";
    cin >> score;
}

// Method to display footballer details
void Footballer::Display() const {
    Player::Display();
    cout << " Score: " << score;
}
