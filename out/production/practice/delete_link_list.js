class Node {
	constructor(val) {
		this.val = val;
		this.next = null;
	}
}

const deleteValue = (head, target) => {
	/*if (head.val === target) {
		return head.next;
	}
	let prev = null;
	let curr = head;
	while(curr !== null) {
		//console.log(curr.val, target)
		if (curr.val === target) {
			prev.next = curr.next;
		}
		prev = curr;
		curr = curr.next;
	}*/
	if (head.val === target) {
		return head.next;
	}

	__delete_value(head, null, target);

	return head;
}

const __delete_value = (curr, prev, target) => {
	if (curr === null) {
		return;
	}

	if (curr.val === target) {
		prev.next = curr.next;
	}
	prev = curr;
	curr = curr.next;
	__delete_value(curr, prev, target);
}

const print = (head) => {
	if (head === null) return;
	console.log(head.val);
	print(head.next);
}

const a = new Node('a');
const b = new Node('b');
const c = new Node('c');
const d = new Node('d');
a.next = b;
b.next = c;
c.next = d;
//console.log(d);
//console.log(deleteValue(a, 'c'));
console.log('prev');
print(a);
let newHead = deleteValue(a, 'a');
console.log('next');
print(newHead);