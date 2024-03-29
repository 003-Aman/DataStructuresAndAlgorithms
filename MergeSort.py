'''
uses divide and conquer
the merge sort function repeatedly divides the array into two halves until we reach a stage where we try to perform MergeSort on a subarray of size 1
dividing into subclass from the middle and progressively dividing the other halves into subclasses recursively

'''
""""
the sub arrays will be sorted in itself but not as a whole orignal array so last step is important as it is where
the two sorted arrays merge and get sorted as a whole again



"""
def mergeSort(array):
    if len(array)>1:#if the original array has more than 1 element which is obvious
        r = len(array)//2 #floor division
        L = array[:r]#the first half
        M = array[r:]#the second half to the last

        mergeSort(L)#sort the two halves recursively
        mergeSort(M)

        i=j=k=0#three pointers: i for L,j for M,k for original big array
        while i<len(L) and j<len(M): #if both left and right have at least one element that is more than one
            if L[i]<M[j]:
                array[k]=L[i]
                i+=1
            else:
                array[k]=M[j]
                j+=1
            k+=1
        while i<len(L):
            array[k]=L[i]
            i+=1
            k+=1
        while j<len(M):
            j+=1
            k+=1

def printList(array):
    for i in range(len(array)):
        print(array[i],end =" ")
    print()

if __name__ == "__main__":
    array =[23,6,0,-8,9,1]
    mergeSort(array)
    print("Sorted array is: ")#here euta line ma print garna milena because a string and an array cannot concactinate
    printList(array)




def MergeSort(arr):
    if len(arr)>1:
        left_arr = arr[:len(arr)//2]
        right_arr = arr[len(arr)//2:]

        #recursion
        MergeSort(left_arr)
        MergeSort(right_arr)

        #merge step
        i =0
        j=0
        k=0
        while i<len(left_arr) and j<len(right_arr):
            if left_arr[i]<right_arr[j]:
                arr[k]=left_arr[i]
                i+=1
                k+=1
            else:
                arr[k]=right_arr[j]
                j+=1
                k+=1

        while i<len(left_arr):
            arr[k]=left_arr[i]
            i+=1
            k+=1
        while j<len(right_arr):
            arr[k]=right_arr[j]
            j+=1
            k+=1

Array =[2,56,78,9,-67,0,-8,2]
MergeSort(Array)
print(Array)



