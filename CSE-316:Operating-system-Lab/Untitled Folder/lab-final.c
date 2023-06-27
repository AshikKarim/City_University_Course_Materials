#include <stdio.h>
#include <stdlib.h>
#define FRAME_SIZE 3

int main()
{
    int page_reference_string[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5};
    int page_reference_length = sizeof(page_reference_string) / sizeof(page_reference_string[0]);
    int page_faults = 0;
    int page_hits = 0;
    int frames[FRAME_SIZE];
    int frame_index = 0;
    int page_index = 0;
    int i, j, k;
    for (i = 0; i < FRAME_SIZE; i++)
    {
        frames[i] = -1;
    }
    printf("Page reference string: ");
    for (i = 0; i < page_reference_length; i++)
    {
        printf("%d ", page_reference_string[i]);
    }
    printf("\n\n");
    printf("Frames\tPage Faults\tPage Hits\n");
    printf("------\t-----------\t---------\n");
    for (i = 0; i < page_reference_length; i++)
    {
        int page_number = page_reference_string[i];
        int is_page_hit = 0;
        for (j = 0; j < FRAME_SIZE; j++)
        {
            if (frames[j] == page_number)
            {
                is_page_hit = 1;
                page_hits++;
                break;
            }
        }
        if (!is_page_hit)
        {
            int is_frame_empty = 0;
            for (j = 0; j < FRAME_SIZE; j++)
            {
                if (frames[j] == -1)
                {
                    frames[j] = page_number;
                    is_frame_empty = 1;
                    break;
                }
            }
            if (!is_frame_empty)
            {
                int max_future_distance = -1;
                int page_to_replace_index = -1;
                for (j = 0; j < FRAME_SIZE; j++)
                {
                    int page_in_frame = frames[j];
                    int future_distance = 0;
                    for (k = i + 1; k < page_reference_length; k++)
                    {
                        if (page_reference_string[k] == page_in_frame)
                        {
                            break;
                        }
                        future_distance++;
                    }
                    if (future_distance > max_future_distance)
                    {
                        max_future_distance = future_distance;
                        page_to_replace_index = j;
                    }
                }
                frames[page_to_replace_index] = page_number;
            }
            page_faults++;
        }
        printf(" ");
        for (j = 0; j < FRAME_SIZE; j++)
        {
            if (frames[j] == -1)
            {
                printf("- ");
            }
            else
            {
                printf("%d ", frames[j]);
            }
        }
        printf("\t\t%d\t\t%d\n", page_faults, page_hits);
    }
    return 0;
}