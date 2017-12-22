ximport math

def is_perfect(n):
    # YOUR CODE HERE
    return False

# DO NOT MODIFY BELOW THIS LINE
if __name__ == '__main__':
    with open('PerfectIN.txt', 'r') as f:
        while True:
            n = f.readline()
            if n == '':
                break
            n = int(n)
            out = is_perfect(n)
            if out:
                print('true')
            else:
                print("false")
