#include <iostream>
#include <ctime>
using namespace std;

class ATMBanking {
private:
    int accountBalance;
    const int ATMPin = 12345;

public:
    // Constructor to initialize the account balance
    ATMBanking(int balance) : accountBalance(balance) {}

    // Function to display the welcome screen with current date and time
    void displayWelcomeScreen() {
        cout << "Welcome to Bank of Baroda Bank ATM" << endl;
        
        // Display current date and time
        time_t now = time(0);
        tm *ltm = localtime(&now);
        cout << "Current Date and Time: "
                  << 1900 + ltm->tm_year << "-"
                  << 1 + ltm->tm_mon << "-"
                  << ltm->tm_mday << " "
                  << ltm->tm_hour << ":"
                  << ltm->tm_min << ":"
                  << ltm->tm_sec <<endl;
    }

    // Function to display the help screen
    void displayHelpScreen() {
        cout << "Help Screen: Please contact customer support at 1800-123-4567 for assistance." << endl;
    }

    // Function to check the account balance
    void checkBalance() {
        cout << "Your current balance is: Rs. " << accountBalance << endl;
    }

    // Function to deposit money into the account
    void depositMoney(int amount) {
        accountBalance += amount;
        cout << "You have deposited Rs. " << amount << endl;
        checkBalance();
    }

    // Function to withdraw money from the account
    void withdrawMoney(int amount) {
        if (amount > accountBalance) {
            cout << "Unsuccessful Withdrawal: Insufficient balance!" << endl;
        } else {
            accountBalance -= amount;
            cout << "You have withdrawn Rs. " << amount << endl;
            checkBalance();
        }
    }

    // Function to validate the ATM PIN with one attempt only
    bool validatePin(int inputPin) {
        return inputPin == ATMPin;
    }
};

int main() {
    // Create an instance of ATMBanking with an initial balance of Rs. 60000
    ATMBanking atm(60000);

    int choice, amount, inputPin;
    bool accessGranted = false;

    // Display the welcome screen
    atm.displayWelcomeScreen();

    // Ask for the ATM PIN
    cout << "Please enter your ATM PIN: ";
    cin >> inputPin;

    // Validate the ATM PIN with one attempt only
    accessGranted = atm.validatePin(inputPin);

    if (accessGranted) {
        // Display menu screen
        cout << "Menu Screen:" << endl;
        cout << "1. Check Balance" << endl;
        cout << "2. Deposit Money" << endl;
        cout << "3. Withdraw Money" <<endl;
        cout << "4. Help" << endl;
        cout << "5. Exit" << endl;

        do {
            cout << "Select your choice: ";
            cin >> choice;

            switch (choice) {
                case 1: // Check Balance
                    atm.checkBalance();
                    break;
                case 2: // Deposit Money
                    cout << "Enter the amount to deposit: ";
                    cin >> amount;
                    atm.depositMoney(amount);
                    break;
                case 3: // Withdraw Money
                    cout << "Enter the amount to withdraw: ";
                    cin >> amount;
                    atm.withdrawMoney(amount);
                    break;
                case 4: // Display Help Screen
                    atm.displayHelpScreen();
                    break;
                case 5: // Exit
                    cout << "Thank you for using Bank of Baroda Bank ATM. Goodbye!" << endl;
                    break;
                default:
                    cout << "Invalid choice. Please try again."<<endl;
            }
        
        } while (choice != 5);
    }else {
        cout << "Incorrect PIN. Exiting the program."<<endl;
    }

    return 0;
}
