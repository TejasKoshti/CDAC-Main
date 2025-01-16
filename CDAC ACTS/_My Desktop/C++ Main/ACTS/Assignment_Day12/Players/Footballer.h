
#include "Player.h"

class Footballer:public Player
{
	private:
		int score;

	public:
		 // Default constructor
   		 Footballer();
		
		 // Parameterized constructor
		Footballer(string name,int age, int score);

    // Method to accept footballer details from the user
    void Accept();

    // Method to display footballer details
    void Display() const;
};
