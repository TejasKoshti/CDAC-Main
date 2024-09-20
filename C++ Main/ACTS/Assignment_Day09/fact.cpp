// Try passing const reference to factorial function and check if modification is possible

#include <iostream>
using namespace std;

int fact(const int &n) {
    if (n == 0 || n == 1)
        return 1;
    return n * fact(n - 1);
}

int main() {
    int num;
    cin >> num;


    for (int i = 1; i <= num; i++) {
        int res = fact(i);
        cout << res << " ";
    }

    return 0;
}

