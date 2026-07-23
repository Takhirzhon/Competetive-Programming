class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        list_array = []
        curr = head

        while curr:
            list_array.append(curr.val)
            curr = curr.next
        curr = head
        for i in range(len(list_array)):
            if i % 2 == 0:
                curr.val = list_array[i//2]
            else:
                curr.val = list_array[len(list_array) - (i+1) //2]
            curr = curr.next