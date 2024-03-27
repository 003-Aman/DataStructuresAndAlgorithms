'''
Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order
Just like the movement of bubbles in the water that rise up to the surface, each element of the array move to the end in each iteration4

working:
take one element and keep comparing to the next element and swaping it until the last
same happens in the next iteration take an element and compare to the next one unitl it reaches its designated position
the largest is at the last


'''
def BubbleSort(array):
    for i in range(len(array)):#this loop accesses each array element from the outside
        for j in range(0,len(array)-i-1):#this loop keep comparing between the elements
            if array[j]>array[j+1]:#if the index on the right has a greater value
                temp = array[j] #store the current data in the temp variable and in the current j index
                array[j]= array[j+1] #in the index greater that is at the right, store the current value
                array[j+1]= temp # this is swap, the current element moves aside and the one at the right is stored here

Array = [78,-7,35,5,67,49]
BubbleSort(Array)
print("Sorted Array in Ascending Order:")
print(Array)