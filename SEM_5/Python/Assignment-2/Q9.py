n = int(input("Enter an integer: "))
match n % 5:
    case 0:
        print("The remainder is 0.")
    case 1:
        print("The remainder is 1.")
    case 2:
        print("The remainder is 2.")
    case 3:
        print("The remainder is 3.")
    case 4:
        print("The remainder is 4.")