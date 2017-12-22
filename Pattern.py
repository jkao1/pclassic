def has_pattern(st, pat):
    """
    :st an arbitrary string
    :pat a pattern like ABCABC

    :return whether the string conforms to the pattern
    """
    return False

def parse_input(name):
    pattern_words = []
    with open(name, mode='r') as f:
        for line in f:
            pattern_words.append(line.strip().split(','))

    for p_w in pattern_words:
        print(has_pattern(p_w[1], p_w[0]))

if __name__ == '__main__':
    parse_input('PatternIN.txt')
