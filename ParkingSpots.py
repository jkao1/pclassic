def parking(spots):
    return []

# DO NOT MODIFY BELOW THIS LINE
if __name__ == '__main__':
    with open('ParkingSpotsIN.txt', 'r') as f:
        while True:
            num = f.readline()
            if num == '': # EOF
                break
            num = int(num)
            spots = []
            while num > 0:
                spots.append([int(x) for x in f.readline().split()])
                num -= 1
            print(parking(spots))
