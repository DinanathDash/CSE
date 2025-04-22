/*Example Output of the Program:
Assuming the process PID is 12345, here is an example of what the output might look like when the program runs:

Program Output:

makefile
Copy code
PID=12345
3 4 5 6 7 8 9 10 11 12 
socket descriptor count=10
Inspecting Open File Descriptors:

In another terminal, use the following command:

bash
Copy code
ls -l /proc/12345/fd
The output will show something like this:

lua
Copy code
total 0
lrwx------ 1 user user 64 Jan  8 14:00 0 -> /dev/pts/0
lrwx------ 1 user user 64 Jan  8 14:00 1 -> /dev/pts/0
lrwx------ 1 user user 64 Jan  8 14:00 2 -> /dev/pts/0
lrwx------ 1 user user 64 Jan  8 14:00 3 -> socket:[123456]
lrwx------ 1 user user 64 Jan  8 14:00 4 -> socket:[123457]
lrwx------ 1 user user 64 Jan  8 14:00 5 -> socket:[123458]
lrwx------ 1 user user 64 Jan  8 14:00 6 -> socket:[123459]
lrwx------ 1 user user 64 Jan  8 14:00 7 -> socket:[123460]
lrwx------ 1 user user 64 Jan  8 14:00 8 -> socket:[123461]
lrwx------ 1 user user 64 Jan  8 14:00 9 -> socket:[123462]
lrwx------ 1 user user 64 Jan  8 14:00 10 -> socket:[123463]
lrwx------ 1 user user 64 Jan  8 14:00 11 -> socket:[123464]
Analysis of File Descriptors:
File Descriptors 0, 1, 2:

These correspond to standard input (stdin), standard output (stdout), and standard error (stderr), respectively.
File Descriptors 3 to 12:

These correspond to the 10 sockets created in the loop.
Each socket:[...] entry represents a unique socket created by the socket() system call.
Key Takeaways:
The program creates 10 socket file descriptors starting from 3 and increments for each new socket.
The total number of open file descriptors can be verified using the /proc/[PID]/fd directory.
You can terminate the program manually (e.g., kill -9 12345) once you've inspected the file descriptors.
*/