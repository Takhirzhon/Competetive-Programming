import sys

def plural(words):
    for word in words:
        n = len(word) 
        adjacent_duplicates = sum(1 for i in range(len(word) - 1) if word[i] == word[i + 1])
        print(n - adjacent_duplicates)
if __name__== "__main__":
    data = sys.stdin.read().split()
    test_case = int (data[0])
    words = data[1:test_case+1]
    plural(words)
    