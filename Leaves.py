def leaves(rolls):
    """
    :rolls is a list of dice rolls where each roll is a list of dice values.

    For example, if `rolls = [[1, 2], [3, 4, 5]]` that means that the first roll
    included two dice of values 1 and 2 and the second roll included three dice
    of values 3, 4, and 5.

    :return a Leaves Around The Tree value for each roll. In other words, return
    a list of values.
    """
    d = []
    for i in rolls:
        ans = 0
        for j in i:
            if j == 3: ans += 2
            if j == 5: ans += 4
        d.append(ans)
    return d

def parse_input(name):
    rolls = []
    with open(name, mode='r') as f:
        for line in f:
            rolls.append(map(int, line.split(',')))

    output = leaves(rolls)
    print('\n'.join(map(str, output)))

if __name__ == '__main__':
    parse_input('LeavesIN.txt')
