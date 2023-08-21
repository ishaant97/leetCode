list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]


def binarySearch(list1, target):
    length = len(list1)
    l = 0
    r = length - 1
    while (l <= r):
        middle = (l+r)//2
        if (list1[middle] == target):
            return middle
        elif (list1[middle] > target):
            r = middle - 1
        elif (list1[middle] < target):
            l = middle + 1
        else:
            return -1


target = 10
result = binarySearch(list1, target)

print(result)
