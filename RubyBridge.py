def bridge(l):
    ## YOUR CODE HERE
    max_length = 0
    for i in range(len(l)):
        for j in range(0, i + 1):
            if (j - i) % 2 == 1 or i - j <= max_length: 
                continue
            s = l[j:i]
            if s.count('P') == s.count('T'):
                if len(s) > max_length:
                    max_length = len(s)
    return max_length

## DO NOT MODIFY BELOW THIS LINE

if __name__ == '__main__':
    with open('RubyBridgeIN.txt', 'r') as f:
        while True:
            s = f.readline()
            if s == '':
                break
            N = int(s)
            s = f.readline()
            print(str(bridge(s)))
