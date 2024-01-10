'''
You are given two paper strips. On each strip, all numbers in the range [1, 2, ... N| are written in random order and no number is repeated. Cut the original paper strip into several pieces and rearrange those pieces to form the desired sequence.
Write a function that, efficiently with respect to time used, returns the minimum number of cut pieces needed to perform the described operation.
For example, the following code should display 3 because the pieces used should be (1), (4, 3), and (2):
original = [1, 4, 3, 2]
desired = [1, 2, 4, 3]
print (min_pieces (original, desired))
'''

def min_pieces(original, desired):
    id = original.index(desired[0])
    count = 1
    n = len(original)
    for i in desired:
        if id < n and original[id] == i:
            id += 1
        else:
            count += 1
            id = original.index(i) + 1
    return count
        
if __name__ == '__main__':
    original_lists = [[1, 4, 3, 2], [1, 2, 3], [1,4,3,2,6,5,7,8,9]]
    desired_lists = [[1,2,4,3], [1, 2, 3], [7,2,6,5,4,3,2,8,9,1]]
    for original, desired in zip(original_lists, desired_lists):
        print(min_pieces(original, desired))
