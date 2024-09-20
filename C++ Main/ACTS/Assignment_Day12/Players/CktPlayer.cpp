#include "CktPlayer.h"
#include<iostream>
using namespace std;

		CktPlayer::CktPlayer()
		{		
		}
		CktPlayer::CktPlayer(string name, int age, int run):run(run)
		{
			
		}
		void CktPlayer::Accept()
		{
			Player::Accept();
			cin>>run;
		}

		void CktPlayer::Display()
		{
			Player::Display();
			cout<<run;
		}



