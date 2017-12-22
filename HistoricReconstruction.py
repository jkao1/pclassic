import hashlib

# Called once at the start of each test case. 
# Don't forget to reset any data structures you might be using!
def initialize(N, Q):
    # TODO: implement this method
    return

# Adds a road between landmarks a and b, which finishes building at time t.
# t is guaranteed to start at 1 and increase by 1 every subsequent call
def addRoad(a, b, t):
    # TODO: implement this method
    return

# At a previous time t, how many landmarks are reachable from x using
# roads that existed at that time?
# t is guaranteed to be at most as large as the biggest t seen by addRoad
def reachable(x, t):
    # TODO: implement this method
    return 1


# Before submitting, make sure the main method hasn't been changed!
if __name__ == "__main__":
    class RNG:
        def __init__(self, S):
            self.S = S

        def get_next_rand(self, V):
            self.S = self.S + V.encode('ascii')
            self.S = hashlib.md5(self.S).digest()
            t = self.S[0]
            t += self.S[1] << 8 
            t += self.S[2] << 16 
            t += self.S[3] << 24
            return t

    with open("HistoricReconstructionIN.txt", "r") as f:
        while True:
            s = f.readline()
            if s == "":
                break
            vals = s.split()
            N = int(vals[0])
            Q = int(vals[1])
            S = vals[2].encode('ascii')
            P = int(vals[3])
            R = RNG(S)
            last_val = "0"
            initialize(N, Q)
            T = 0
            for i in range(Q):
                r = R.get_next_rand(last_val)
                if r % 100 < P:
                    # new road
                    a = (R.get_next_rand(last_val) % N) + 1
                    b = (R.get_next_rand(last_val) % N) + 1
                    if a == b:
                        b = (b + 1) % N + 1
                    T += 1
                    # print("addRoad(", a, ",", b, ",", T, ")")
                    addRoad(a, b, T)
                    last_val = "0"
                else:
                    # new query
                    x = (R.get_next_rand(last_val) % N) + 1
                    t = (R.get_next_rand(last_val) % (T + 1))
                    # print("reachable(", x, ",", t, ")")
                    last_val = reachable(x, t)
                    print(last_val)
                    last_val = str(last_val)
