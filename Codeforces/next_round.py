import sys


def solve(n, k, scores):
    kth_score = scores[k - 1]
    return sum(1 for score in scores if score >= kth_score and score > 0)


def main():
    data = sys.stdin.read().splitlines()

    n, k = map(int, data[0].split())
    scores = list(map(int, data[1].split()))

    print(solve(n, k, scores))


if __name__ == "__main__":
    main()
