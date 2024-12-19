#include <stdio.h>
#include <stdlib.h>
#define MAX_PROCESSES 100
typedef struct {
    int id;
    int arrival_time;
    int burst_time;
    int waiting_time;
    int turnaround_time;
    int response_time;
} Process;
void calculate_fcfs(Process processes[], int n) {
    int current_time = 0;
    float total_waiting_time = 0, total_turnaround_time = 0;
    printf("\nGantt Chart (FCFS):\n");
    for (int i = 0; i < n; i++) {
        if (current_time < processes[i].arrival_time) {
            current_time = processes[i].arrival_time;
        }
        processes[i].response_time = current_time - processes[i].arrival_time;
        processes[i].waiting_time = current_time - processes[i].arrival_time;
        processes[i].turnaround_time = processes[i].waiting_time + processes[i].burst_time;
        total_waiting_time += processes[i].waiting_time;
        total_turnaround_time += processes[i].turnaround_time;
        printf("P%d [%d - %d] ", processes[i].id, current_time, current_time + processes[i].burst_time);
        current_time += processes[i].burst_time;
    }
    printf("\n\nAverage Waiting Time: %.2f\n", total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", total_turnaround_time / n);
}
void calculate_rr(Process processes[], int n, int time_quantum) {
    int current_time = 0, completed = 0;
    int remaining_burst_time[MAX_PROCESSES];
    float total_waiting_time = 0, total_turnaround_time = 0;
    for (int i = 0; i < n; i++) {
        remaining_burst_time[i] = processes[i].burst_time;
    }
    printf("\nGantt Chart (RR):\n");
    while (completed < n) {
        for (int i = 0; i < n; i++) {
            if (remaining_burst_time[i] > 0 && processes[i].arrival_time <= current_time) {
                printf("P%d [%d - ", processes[i].id, current_time);
                if (remaining_burst_time[i] <= time_quantum) {
                    current_time += remaining_burst_time[i];
                    remaining_burst_time[i] = 0;
                    completed++;
                    processes[i].turnaround_time = current_time - processes[i].arrival_time;
                    processes[i].waiting_time = processes[i].turnaround_time - processes[i].burst_time;
                    total_waiting_time += processes[i].waiting_time;
                    total_turnaround_time += processes[i].turnaround_time;
                } else {
                    current_time += time_quantum;
                    remaining_burst_time[i] -= time_quantum;
                }
                printf("%d] ", current_time);
            }
        }
    }
    printf("\n\nAverage Waiting Time: %.2f\n", total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", total_turnaround_time / n);
}
int main() {
    int n, choice, time_quantum;
    Process processes[MAX_PROCESSES];
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("\nEnter Process ID: ");
        scanf("%d", &processes[i].id);
        printf("Enter Arrival Time: ");
        scanf("%d", &processes[i].arrival_time);
        printf("Enter Burst Time: ");
        scanf("%d", &processes[i].burst_time);
    }
    do {
        printf("\nCPU Scheduling Options:\n");
        printf("1. First Come First Serve (FCFS)\n");
        printf("2. Round Robin (RR)\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                calculate_fcfs(processes, n);
                break;
            case 2:
                printf("Enter Time Quantum: ");
                scanf("%d", &time_quantum);
                calculate_rr(processes, n, time_quantum);
                break;
            case 3:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 3);
    return 0;
}
