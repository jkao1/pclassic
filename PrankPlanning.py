def reverse(sign):
	# YOUR CODE HERE
    return None

# DO NOT MODIFY BELOW THIS LINE
if __name__ == '__main__':
    with open('PrankPlanningIN.txt', 'r') as f:
        n = f.readline().strip()
        while n != "":
            x = int(n)
            for i in range(x):
                print(reverse(f.readline().strip()))
            n = f.readline().strip()
