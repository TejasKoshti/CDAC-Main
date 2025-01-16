#include <iostream>
#include <iomanip>

class Time {
private:
    int hours;
    int minutes;
    int seconds;

    void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        // No need to normalize hours beyond 24 for simplicity
    }

public:
    // Default constructor
    Time(int h = 0, int m = 0, int s = 0) : hours(h), minutes(m), seconds(s) {
        normalize();
    }

    // Overload + operator
    Time operator+(const Time& other) const {
        return Time(hours + other.hours, minutes + other.minutes, seconds + other.seconds);
    }

    // Overload - operator
    Time operator-(const Time& other) const {
        int totalSeconds1 = hours * 3600 + minutes * 60 + seconds;
        int totalSeconds2 = other.hours * 3600 + other.minutes * 60 + other.seconds;
        int diffSeconds = totalSeconds1 - totalSeconds2;
        
        if (diffSeconds < 0) diffSeconds = 0; // Ensure non-negative result

        return Time(diffSeconds / 3600, (diffSeconds % 3600) / 60, diffSeconds % 60);
    }

    // Read time from user
    void read() {
        std::cout << "Enter time (hh mm ss): ";
        std::cin >> hours >> minutes >> seconds;
        normalize();
    }

    // Print time in hh:mm:ss format
    void print() const {
        std::cout << std::setfill('0') << std::setw(2) << hours << ":"
                  << std::setfill('0') << std::setw(2) << minutes << ":"
                  << std::setfill('0') << std::setw(2) << seconds << std::endl;
    }
};

int main() {
    Time t1, t2, result;

    std::cout << "Enter first time:\n";
    t1.read();

    std::cout << "Enter second time:\n";
    t2.read();

    result = t1 + t2;
    std::cout << "Sum of times: ";
    result.print();

    result = t1 - t2;
    std::cout << "Difference of times: ";
    result.print();

    return 0;
}

