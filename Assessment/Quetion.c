//Create an application that can perform all string related operations
#include <stdio.h>
#include <string.h>

// Function to reverse 
void reverse(char str[]) {
    int n = strlen(str);
    for (int i = 0; i < n / 2; i++) {
        char temp = str[i];
        str[i] = str[n - i - 1];
        str[n - i - 1] = temp;
    }
    printf("Reversed string: %s\n", str);
}

// Function to check if a string is a palindrome
void palindrome(char str[]) {
    int n = strlen(str);
    for (int i = 0; i < n / 2; i++) {
        if (str[i] != str[n - i - 1]) {
            printf("The string is not a palindrome.\n");
            return;
        }
    }
    printf("The string is a palindrome.\n");
}

// Function to copy a string
void copy(char str[]) {
    char copy[100];
    strcpy(copy, str);
    printf("Copied string: %s\n", copy);
}

// Function to find the length of a string
void length(char str[]) {
    printf("Length of the string: %d\n", strlen(str));
}

// Function to find the frequency of a character in a string
void frequency(char str[], char c) {
    int count = 0;
    for (int i = 0; str[i]; i++)
        if (str[i] == c)
            count++;
    printf("Frequency of %c: %d\n", c, count);
}

// Function to find the number of vowels and consonants in a string
void vowels_and_consonants(char str[]) {
    int vowels = 0, consonants = 0;
    for (int i = 0; str[i]; i++) {
        if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z') {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
                vowels++;
            else
                consonants++;
        }
    }
    printf("Number of vowels: %d\n", vowels);
    printf("Number of consonants: %d\n", consonants);
}

// Function to find the number of blank spaces and digits in a string
void spaces_and_digits(char str[]) {
    int spaces = 0, digits = 0;
    for (int i = 0; str[i]; i++) {
        if (str[i] == ' ')
            spaces++;
        else if (str[i] >= '0' && str[i] <= '9')
            digits++;
    }
    printf("Number of blank spaces: %d\n", spaces);
    printf("Number of digits: %d\n", digits);
}

int main() {
    char str[100], c;
    int choice;
    printf("Enter a string: ");
    gets(str);
    do {
        printf("\n1. Reverse string\n2. Check palindrome\n3. Copy string\n4. Find length\n5. Find frequency of a character\n6. Find number of vowels and consonants\n7. Find number of blank spaces and digits\n8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                reverse(str);
                break;
            case 2:
                palindrome(str);
                break;
            case 3:
                copy(str);
                break;
            case 4:
                length(str);
                break;
            case 5:
                printf("Enter a character: ");
                scanf(" %c", &c);
                frequency(str, c);
                break;
            case 6:
                vowels_and_consonants(str);
                break;
            case 7:
                spaces_and_digits(str);
                break;
            case 8:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
        printf("\nDo you want to continue? (1 for yes, 0 for no): ");
        scanf("%d", &choice);
    } while (choice != 0);
    return 0;
}
