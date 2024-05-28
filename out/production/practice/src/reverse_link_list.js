class Node {
	constructor(val) {
		this.val = val;
		this.next = null;
	}
}

const a = new Node('a');
const b = new Node('b');
const c = new Node('c');
const d = new Node('d');
a.next = b;
b.next = c;
c.next = d;
//console.log(a);

const print = (head) => {
	if (head === null) {
		return;
	}
	console.log(head.val);
	print(head.next);
}
print(a);
console.log('---')

const reverseList = (head, prev = null) => {
	/*prev = null;
	curr = head;
	while (curr !== null) {
		let next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
	}

	return prev;*/

	curr = head;
	if (curr === null) {
		return prev;
	}
	let next = curr.next;
	curr.next = prev;
	prev = curr;
	curr = next;
	return reverseList(curr, prev);
}

const newHead = reverseList(a);

print(newHead);