@echo off
for /l %%i in (1,1,30) do (
    echo // This is file Q%%i.c > Q%%i.c
)
echo 30 .c files have been created successfully.
pause