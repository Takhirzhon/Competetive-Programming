class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        values = []

        for head in lists:
            while head:
                values.append(head.val)
                head = head.next

        values.sort()

        dummy = ListNode(0)
        current = dummy

        for i in values:
            current.next = ListNode(i)
            current = current.next

        return dummy.next