# coding=utf-8

def identify_language(s):
    return "English"

# Before submitting, make sure the main method hasn't been changed!
if __name__ == "__main__":
    with open("MysteriousDocumentsIN.txt", "r") as f:
        while True:
            s = f.readline()
            if s == "":
                break
            print(identify_language(s))
