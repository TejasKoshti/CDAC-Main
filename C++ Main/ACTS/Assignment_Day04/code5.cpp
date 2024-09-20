#include<iostream>
using namespace std;


void reverse(string s)
{
	   char* char_array = new char[s.length() + 1]; 
           int n=s.length() + 1;
    
    char_array[s.length()] = '\0'; 
      
    for (int i = s.length(); i>=0; i--) { 
        char_array[n-i] = s[i]; 
    } 
    for(int j=0;j<=n;j++)
    {
	    cout<<char_array[j];
    }
    cout<<endl;



}
int main()
{
	cout<<"Enter The Name: ";
	string name;
	cin>>name;

	reverse(name);



  return 0;
}
