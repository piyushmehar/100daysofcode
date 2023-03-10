// 382. Linked List Random Node
// Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
// Implement the Solution class:
// Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
// int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.


class Solution {
    List<Integer> list = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
    }
    
    public int getRandom() {
        return list.get((int) (Math.random() * list.size()));
    }
}
