#include <stdio.h>

#define NUM_FRAMES 3

int main() {
    int pageStream[] = {1, 2, 3, 4, 1, 2, 5, 7, 10, 11, 7, 8, 7, 9, 1, 2, 3, 4, 1, 2, 1, 3, 4, 1};
    int streamLength = sizeof(pageStream) / sizeof(pageStream[0]);

    int frames[NUM_FRAMES];
    int faults = 0;
    int hits = 0;
    int i, j, k, flag, max, index;

    for (i = 0; i < NUM_FRAMES; i++) {
        frames[i] = -1; // Initialize frames to -1 indicating empty
    }

    printf("Page Stream: ");
    for (i = 0; i < streamLength; i++) {
        printf("%d ", pageStream[i]);
    }
    printf("\n");

    printf("Page Status: ");
    for (i = 0; i < streamLength; i++) {
        flag = 0;
        for (j = 0; j < NUM_FRAMES; j++) {
            if (frames[j] == pageStream[i]) {
                flag = 1; // Page hit
                hits++;
                break;
            }
        }
        printf("\n");


        if (flag == 0) {
            for (j = 0; j < NUM_FRAMES; j++) {
                if (frames[j] == -1) {
                    faults++;
                    frames[j] = pageStream[i]; // Page miss, replace empty frame
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                faults++;
                max = -1;
                index = -1;
                for (j = 0; j < NUM_FRAMES; j++) {
                    flag = 0;
                    for (k = i + 1; k < streamLength; k++) {
                        if (frames[j] == pageStream[k]) {
                            if (k > max) {
                                max = k;
                                index = j;
                            }
                            flag = 1;
                            break;
                            }
                    }
                    if (flag == 0) {
                        index = j;
                        break;
                    }
                }
                frames[index] = pageStream[i]; // Page miss, replace page with the farthest occurrence in the future
            }
        }
        for (j = 0; j < NUM_FRAMES; j++) {
            if (frames[j] == -1) {
                printf("- ");
            } else {
                printf("%d ", frames[j]);
            }
        }
        printf("\n");
    }

    printf("\n\nPage Faults: %d\n", faults);
    printf("Page Hits: %d\n", hits);

    return 0;
}
