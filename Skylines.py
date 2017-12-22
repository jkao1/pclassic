class Building:
    def __init__(self, left, height, right):
        self.left = left
        self.height = height
        self.right = right

    def __repr__(self):
        return 'Building({}, {}, {})'.format(
            self.left, self.height, self.right)

class Strip:
    def __init__(self, left, height):
        self.left = left
        self.height = height

    def __repr__(self):
        return 'Strip({}, {})'.format(self.left, self.height)

def skylines(buildings):
    """
    :buildings a list of Building

    :return a list of Strip
    """
    return []

def parse_input(name):
    buildings = []
    with open(name, mode='r') as f:

        while True:
            line = f.readline()
            if line == '': # EOF
                break

            n = int(line)
            buildings = []
            for _ in range(n):
                line = f.readline()
                building_as_list = map(int, line.split(','))

                buildings.append(Building(*building_as_list))

            print(skylines(buildings))

if __name__ == '__main__':
    parse_input('SkylinesIN.txt')
