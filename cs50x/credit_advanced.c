#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv) {
    if (argc < 2)
        return -1;
    // makes sure I have enough arguments, argc must be 2, since the first value of argv is 
    // the file name and the second will be the actual value

    size_t size_str = strlen(argv[1]);
    // get the size of the command line argument string
    int* second_digits = (int*) malloc(sizeof(int) * size_str);
    int* first_digits = (int*) malloc(sizeof(int) * size_str);
    // C's equivalent of dynamic arrays for every even indexed (second digit, 4th digit, etc.) 
    // and odd indexed (1st digit, 3rd digit, 5th digit, etc.)
    int count_s = 0;
    int count_f = 0;
    // variables for reallocation purposes
    if (size_str % 2 == 0) {
        for (int i = (size_str-1); i >= 0; --i) {
            if (i % 2 == 0) {
                second_digits[count_s] = argv[1][i] - 48;
                count_s++;
            }
            else {
                printf("argv: %c\n", argv[1][i]);
                first_digits[count_f] = argv[1][i] - 48;
                count_f++;
            }
        }
    }
    // if the size of the string is even, every odd index (in 0-indexed terms) 
    // will be an even index (in 1-indexed terms)
    else {
        for (int i = (size_str-1); i >= 0; --i) {
            if (i % 2 == 0) {
                first_digits[count_f] = argv[1][i] - 48;
                count_f++;
            }
            else {
                second_digits[count_s] = argv[1][i] - 48;
                count_s++;
            }
        }
    }
    second_digits = (int*) realloc(second_digits, sizeof(int) * count_s);
    first_digits = (int*) realloc(first_digits, sizeof(int) * count_f);
    for (int i = 0; i < count_s; ++i) {
        second_digits[i] *= 2;
    }
    // if the size of the string is even, every even index (in 0-indexed terms) 
    // will be an odd index (in 1-indexed terms)
    // the point of the if-else pair above is to separate out the digits
    
    int sum2 = 0;
    for (int i = 0; i < count_s; ++i) {
        for (int j = second_digits[i]; j != 0; j /= 10) {
            sum2 += j % 10;
        }
    }
    // simply the smartest for loop ever f---ing written in an AP CS A class in this school
    // so, background. for loops operate like this: (initial statement; continuation condition; end statement)
    // however, these statements can be literally any statement, including being blank
    // a for loop, converted to a while loop would look like this
    /* *initial statment* 
        while (continuation condition) {
        ...
        *end statement* 
        }*/
    // as you can see, the initial statement happens before the loop starts and happens onece,
    // the condition is just the logical statement that must be true for the loop to iterate again,
    // and the end statement gets repeated every time the function ends
    // so what I do is first set up a regular for loop, for iteration sake
    // then I make another nested for loop, which is where the fun begins
    // in my inital statement, I declare an integer which I equate to the current value of my array of odd-indexed digits,
    // then I state that while j is not equal to 0, loop once more,
    // and then, as my final statement, I divide j by 10 every time
    // the brilliance comes from the fact that when you do a division which has a result with a decimal value
    // and assign it to an integer, it will assign only the integer part, dropping the decimal
    // hence, this allows me to essentially remove the end digit from j every time an iteration ends
    // if there is only one digit, then it loops once, and it will loop for as many digits the integer asssigned to j has
    // and then I just use a modulo to add the last digit, before its removal with the end statement, 
    // to the sum value, defined right before the initial loop
    // this allows me to sum uo every digit of every member of second_digits
    // I needed this small victory, I am done
    int sum1 = 0;
    for (int i = 0; i < count_f; ++i) {
        sum1 += first_digits[i];
    }
    // regular iterative for loop to sum the always single digit values of first_digits

    if ((sum2 + sum1) % 10 == 0)
        printf("Valid \n");
    // prints when the value is valid; when the last digit of the sum of both arrays' last digits' sum is equal to 0
    else
        printf("Invalid \n");
    // just an else function for when it is invalid

    free(second_digits);
    free(first_digits);
    // free the allocated memory 
}
