'''
insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration
like sorting cards in our hand
sano sano goes ahead and the larger one go at last

take the first element and compare it to the second one if greater swap
now look at the third element if it is smmaler place it directly at first
similarly place every unsorted element in its correct position

'''
def InsertionSort(array):
    for step in range(1,len(array)):#we start from the second element
        key = array[step] #we make the second element key
        j= step -1 #j is used as an index to iterate over the sorted part of the array, moving backward
        while j>=0 and key <array[j]: #this is actually comparing the ones to its right at the first iteration and as it goes it compares to the left element and it looks for the correct position to reach in
            array[j+1]=array[j] #if the element is greater than the key, we move it to the right
            j=j-1  
        array[j+1]=key

Array = [7,15,13,0,-2] 
InsertionSort(Array)
print("Sorted array in ascending order: ")
print(Array)

