#include <stdio.h>

int dodawanie(int a, int b) {
    return a + b;
}

int odejmowanie(int a, int b) {
    return a - b;
}

int main() {
    int liczba1 = 10;
    int liczba2 = 5;

    int suma = dodawanie(liczba1, liczba2);
    int roznica = odejmowanie(liczba1, liczba2);

    printf("Suma: %d\n", suma);
    printf("Roznica: %d\n", roznica);

    return 0;
}