// Function to calculate factorial using reference

#include<iostream>
using namespace std;


int fact(int &n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    
    int temp = n;
    
    n = n - 1;
     
    int result = temp * fact(n);
    
    n = temp;
    
    return result;
}

int main() {
    int num;
    cin >> num;

    for (int i = 1; i <= num; ++i) {
        int temp = i; 
        int res = fact(temp);
        cout << res << " ";
    }
    cout << endl;

    return 0;
}

