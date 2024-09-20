#include "Player.h"
#include<iostream>

class CktPlayer: public Player
{
	private:
		int run;
	public:
		CktPlayer();
		CktPlayer(string name, int age, int run);
		
		void Accept();

		void Display();
};



