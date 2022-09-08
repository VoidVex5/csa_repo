#include <stdlib.h>
#include <stdio.h>
// the standard libraries

int main() {
	int value = 0; 
	// the value of pyramid levels
	while (value <= 0 || value > 8) {
	    printf("Input value between 1..=8: ");
	    scanf("%i", &value);
	}
	// repeatedly input int values till I get a valid one
	value++;
	// increment so that when "value" is 1 it still works
	for (int i = 0; i < value; ++i) {
		int x = value - i;
		for (int j = 0; j < x; ++j) {
			printf(" ");
		}
		// print spaces equal to the total character count minus the '#' count
		for (int l = 0; l < i; ++l) {
			printf("#");
		}
		// prints the '#' at the front
		printf("  ");
		for (int l = 0; l < i; ++l) {
			printf("#");
		}
		// prints an equal amount of '#' after 2 spaces from the first one to emulate the pit
		printf(" \n");
		// begins a new line
	}
}
