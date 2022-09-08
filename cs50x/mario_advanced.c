#include <stdlib.h>
#include <stdio.h>

int main() {
	int value = 0;
	
	while (value <= 0 || value > 8) {
	    printf("Input value between 1..=8: ");
	    scanf("%i", &value);
	}
	value++;
	for (int i = 0; i < value; ++i) {
		int x = value - i;
		for (int j = 0; j < x; ++j) {
			printf(" ");
		}
		//print spaces
		for (int l = 0; l < i; ++l) {
			printf("#");
		}
		//print the first #
		printf("  ");
		for (int l = 0; l < i; ++l) {
			printf("#");
		}
		//print the second #
		printf(" \n");
		
	}
}