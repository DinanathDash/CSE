def calculate(weight_file, price_file, output_file):
    try:
        with open(weight_file, 'r') as weight_f, open(price_file, 'r') as price_f:
            weights = weight_f.readlines()
            prices = price_f.readlines()
            if len(weights) != len(prices):
                print("Error: The two files must have the same number of lines.")
                return
            with open(output_file, 'w') as output_f:
                output_f.write("Weight,Price,Price per Unit Weight\n")
                for weight_line, price_line in zip(weights, prices):
                    try:
                        weight = float(weight_line.strip())
                        price = float(price_line.strip())
                        if weight == 0:
                            price_per_unit_weight = 0
                        else:
                            price_per_unit_weight = price / weight
                        output_f.write(f"{weight},{price},{price_per_unit_weight:.2f}\n")
                    except ValueError:
                        print("Error: Invalid data in the files. Ensure all lines contain numeric values.")
                        return
            print(f"Price per unit weight data has been written to '{output_file}'.")
    except FileNotFoundError:
        print("Error: One or both of the input files do not exist.")
weight_file = input("Enter the name of the file containing weights: ")
price_file = input("Enter the name of the file containing prices: ")
output_file = input("Enter the name of the output file: ")
calculate(weight_file, price_file, output_file)