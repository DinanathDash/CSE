def calculate(weights_file, prices_file, output_file):
    try:
        with open(weights_file) as wf, open(prices_file) as pf:
            weights = list(map(float, wf))
            prices = list(map(float, pf))
        if len(weights) != len(prices):
            print("Error: Files must have the same number of items.")
            return
        with open(output_file, 'w') as of:
            for i, (w, p) in enumerate(zip(weights, prices), start=1):
                of.write(f"Item {i}: {round(p / w, 2)}\n")
        print(f"Results written to '{output_file}'.")
    except Exception as e:
        print(f"Error: {e}")
weight_file = input("Enter the name of the file containing weights: ")
price_file = input("Enter the name of the file containing prices: ")
output_file = input("Enter the name of the output file: ")
calculate(weight_file, price_file, output_file)