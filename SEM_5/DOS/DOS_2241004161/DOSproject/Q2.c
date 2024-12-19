#include <stdio.h>
#include <stdbool.h>
#define P 5
#define R 4
void calculate_need(int need[P][R], int max[P][R], int allocation[P][R]) {
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++) {
            need[i][j] = max[i][j] - allocation[i][j];
        }
    }
}
bool is_safe(int processes[], int available[], int max[P][R], int allocation[P][R]) {
    int need[P][R];
    calculate_need(need, max, allocation);
    bool finish[P] = {false};
    int safe_sequence[P];
    int work[R];
    for (int i = 0; i < R; i++) {
        work[i] = available[i];
    }
    int count = 0;
    while (count < P) {
        bool found = false;
        for (int p = 0; p < P; p++) {
            if (!finish[p]) {
                bool can_allocate = true;
                for (int j = 0; j < R; j++) {
                    if (need[p][j] > work[j]) {
                        can_allocate = false;
                        break;
                    }
                }
                if (can_allocate) {
                    for (int j = 0; j < R; j++) {
                        work[j] += allocation[p][j];
                    }
                    safe_sequence[count++] = processes[p];
                    finish[p] = true;
                    found = true;
                }
            }
        }
        if (!found) {
            printf("System is not in a safe state.\n");
            return false;
        }
    }
    printf("System is in a safe state.\nSafe sequence is: ");
    for (int i = 0; i < P; i++) {
        printf("P%d ", safe_sequence[i]);
    }
    printf("\n");
    return true;
}
void request_resources(int process_id, int request[R], int available[R], int allocation[P][R], int max[P][R]) {
    int need[P][R];
    calculate_need(need, max, allocation);
    for (int j = 0; j < R; j++) {
        if (request[j] > need[process_id][j]) {
            printf("Error: Process has exceeded its maximum claim.\n");
            return;
        }
        if (request[j] > available[j]) {
            printf("Error: Resources are not available.\n");
            return;
        }
    }
    for (int j = 0; j < R; j++) {
        available[j] -= request[j];
        allocation[process_id][j] += request[j];
    }
    if (!is_safe((int[]){0, 1, 2, 3, 4}, available, max, allocation)) {
        for (int j = 0; j < R; j++) {
            available[j] += request[j];
            allocation[process_id][j] -= request[j];
        }
        printf("Request cannot be granted as it leads to an unsafe state.\n");
    } else {
        printf("Request granted successfully.\n");
    }
}
int main() {
    int processes[] = {0, 1, 2, 3, 4};
    int available[R] = {6, 7, 12, 12};
    int max[P][R] = {
        {0, 0, 1, 2},
        {2, 7, 5, 0},
        {6, 6, 5, 6},
        {4, 3, 5, 6},
        {0, 6, 5, 2}
    };
    int allocation[P][R] = {
        {0, 0, 1, 2},
        {2, 0, 0, 0},
        {0, 0, 3, 4},
        {2, 3, 5, 4},
        {0, 3, 3, 2}
    };
    if (is_safe(processes, available, max, allocation)) {
        printf("\n");
    }
    int request[] = {0, 1, 0, 0};
    printf("Process P3 requesting resources: {0, 1, 0, 0}\n");
    request_resources(2, request, available, allocation, max);
    return 0;
}
