const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// k=3
// 1 2 3 4 5
// 3 4 5 1 2 clock wise  (from right side)
// 4 5 1 2 3 anticlock wise (from left side)
var rotateRight = function (head, k) {
  let a = 0;
  let cur1 = head;
  while (cur1) {
    cur1 = cur1.next;
    a++;
  }

  //k = k % a;

  //console.log(a);

  if (k == 0) {
    return head;
  }
  let curr = head;
  let kth = null;
  let count = 1;
  while (count < k && curr != null) {
    kth = curr;
    curr = curr.next;
    count++;
  }
  if (curr == null) {
    return head;
  }

  while (curr.next) {
    curr = curr.next;
  }

  curr.next = head;
  head = kth.next;
  kth.next = null;

  return head;
};
