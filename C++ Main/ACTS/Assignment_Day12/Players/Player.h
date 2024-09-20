#ifndef PLAYER_H

#define PLAYER_H
#include<string>
using namespace std;

class Player
{
	private:
		string name;
		int age;

	public:
	        // Default constructor
		Player();
		
		  // Parameterized constructor
		Player(string name,int age);

	    // Method to accept player details from the user
    void Accept();

    // Method to display player details
    void Display() const;

};

#endif
