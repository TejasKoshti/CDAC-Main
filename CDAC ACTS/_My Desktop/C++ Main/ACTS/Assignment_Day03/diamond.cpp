#include <iostream>
using namespace std;

int main(){
int n;
        cout<< "Enter the number:";
        cin>>n;

	for(int i=n;i>0;i--){
		for(int j=0;j<i;j++){
			cout<<"*";
		}
		for(int k=0;k<n-i;k++)
		{
			cout<<"  ";
		}
		for(int j=i;j>0;j--){
			cout<<"*";
		}
		cout<<endl;
	}
        for(int i=0;i<5;i++)
	{
		for(int j=i;j>=0;j--){
			cout<<"*";
		}
		for(int k=n-i;k>1;k--){
			cout<<"  ";
		}
		for(int j=0;j<=i;j++){
			cout<<"*";
		}
		cout<<endl;
	}

	return 0;
}
