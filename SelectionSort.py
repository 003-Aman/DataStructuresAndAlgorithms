'''
selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list

shuru ma take the first element which is at index 0 and set it as minimum
now if the one next to that is smaller make it the minimum
now compare again, if it is smaller again pass it otherwise go to the one after that and see if it is minimum
this all happens in one iteration now the minimum will be swapped with the index 0

'''
# look at it and actually understand what happens after every interation and the inner iteration, draw it imagine it
def SelectionSort(array,size):#can take len(array) doesnt need an extra parameter
    for step in range(size):# iterating over the array
        min_idx = step #shuru ma minimum will be the first element since step will start with 0
        for i in range(step+1,size): # we start from the second element and leave the first set minimum
            if array[i]<array[min_idx]:#if the element when we iterate is smaller than what we just set that is the first element
                min_idx=i #set the minimum index as i not the value but the index
        (array[step],array[min_idx])=(array[min_idx],array[step]) #now swap the initial and the one which takes the minimum after the first iteration
        #now it keeps on iterating since we have the smallest one in the first index, we bother about whats on the right

Array =[0,65,11,2,-5,39]
size = len(Array)
SelectionSort(Array,size)
print("Sorted array in Ascending order: ")
print(Array)