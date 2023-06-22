def sort(arr):

    zeroes = 0
    ones = 0
    # 3
    # 2

    for i in range(len(arr)):
        if arr[i] == 0:
            zeroes += 1

        elif arr[i] == 1:
            ones += 1


    for i in range(len(arr)):
        if i < zeroes:
            arr[i] = 0
            if i == zeroes:
                k = i
                break

    return arr


def swap(number_to_swap, number_to_swap_with):
    num1 = number_to_swap
    num2 = number_to_swap_with
    num1 = num2

    return num1


llist = [2, 1, 1, 0, 2, 0]
print(sort(llist))
# print(swap(3, 6))
