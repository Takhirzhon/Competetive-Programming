import sys

def plural(words):
    for word in words:
        print(word[:-2] + "i")
        
if __name__== "__main__":
    data = sys.stdin.read().split()
    test_case = int (data[0])
    words = data[1:test_case+1]
    plural(words)
    