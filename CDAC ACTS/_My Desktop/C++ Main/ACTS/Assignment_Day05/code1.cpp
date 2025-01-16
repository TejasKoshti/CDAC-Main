#include<iostream>
using namespace std;

void bubbleSort(int* arr, int size) {
    for (int i = 0; i < size - 1; ++i) {
        for (int j = 0; j < size - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}



void stored_arr(int num)
{

 int *p = new int[num];

  for(int i=0;i<num;i++)
  {
       cin>>p[i];
  }

  bubbleSort(p,num);
  for(int i=0;i<num;i++)
  {
       cout<<p[i]<<" ";
  }

    delete []p;
}


int main()
{
  int n;

  cout<<"enter";
  cin>>n;
	stored_arr(n);
  return 0;
}

