#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>
#include <sys/wait.h>

void copy_file() {
    int src = open("file1.txt", O_RDONLY);
    int dest = open("file2.txt", O_WRONLY | O_CREAT | O_TRUNC, 0644);
    char buf[1024];
    ssize_t bytes;
    while ((bytes = read(src, buf, sizeof(buf))) > 0)
        write(dest, buf, bytes);
    close(src);
    close(dest);
}

void display_file(const char *filename) {
    char buf[1024];
    int fd = open(filename, O_RDONLY);
    while (read(fd, buf, sizeof(buf)) > 0)
        write(STDOUT_FILENO, buf, strlen(buf));
    close(fd);
}

void display_sorted_reverse() {
    FILE *file = fopen("file2.txt", "r");
    char *lines[100];
    size_t n = 0;
    char buf[1024];

    while (fgets(buf, sizeof(buf), file))
        lines[n++] = strdup(buf);
    fclose(file);

    for (size_t i = 0; i < n - 1; i++)
        for (size_t j = 0; j < n - i - 1; j++)
            if (strcmp(lines[j], lines[j + 1]) < 0) {
                char *temp = lines[j];
                lines[j] = lines[j + 1];
                lines[j + 1] = temp;
            }

    for (size_t i = 0; i < n; i++) {
        printf("%s", lines[i]);
        free(lines[i]);
    }
}

int main() {
    if (fork() == 0) {
        printf("First Child: Copying file content\n");
        copy_file();
        exit(0);
    }
    wait(NULL);

    if (fork() == 0) {
        printf("Second Child: Displaying file content\n");
        display_file("file2.txt");
        exit(0);
    }
    wait(NULL);

    if (fork() == 0) {
        printf("Third Child: Displaying sorted reverse content\n");
        display_sorted_reverse();
        exit(0);
    }
    wait(NULL);

    printf("Parent: All tasks completed.\n");
    return 0;
}

