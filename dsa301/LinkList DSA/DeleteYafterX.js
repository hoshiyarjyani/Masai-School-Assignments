const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};

var deleteXAfterY = function (head, n, x, y) {
  let cur = head;
  let prev = null;
  while (cur) {
    for (let i = 1; i <= x && cur != null; i++) {
      prev = cur;
      cur = cur.next;
    }
    for (let i = 1; i <= y && cur != null; i++) {
      cur = cur.next;
    }
    prev.next = cur;
  }
  return head;
};
