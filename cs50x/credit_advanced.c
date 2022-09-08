#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv) {
    if (argc < 2)
        return -1;

    size_t size_str = strlen(argv[1]);
    int* second_digits = (int*) malloc(sizeof(int) * size_str);
    int* first_digits = (int*) malloc(sizeof(int) * size_str);
    int count_s = 0;
    int count_f = 0;
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

    int sum2 = 0;
    for (int i = 0; i < count_s; ++i) {
        for (int j = second_digits[i]; j != 0; j /= 10) {
            sum2 += j % 10;
        }
    }
    int sum1 = 0;
    for (int i = 0; i < count_f; ++i) {
        sum1 += first_digits[i];
    }

    if ((sum2 + sum1) % 10 == 0)
        printf("Valid %i\n", (sum2 + sum1));
    else
        printf("Invalid %i\n", (sum2 + sum1));

    free(second_digits);
    free(first_digits);
}
