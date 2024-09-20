#include<iostream>
#include "Player.h"

// Default constructor
Player::Player():name(""),age(0)
{
}
// Parameterized constructor
Player::Player(string name,int age):name(name),age(age){}

// Method to accept player details from the user
void Player::Accept() {
    cout << "Enter Player Name: ";
    cin >> name;
    cout << "Enter Player's Age: ";
    cin >> age;
}

// Method to display player details
void Player::Display() const {
    cout << "\n[name = " << name;
    cout << ", age = " << age << " ]";
}
