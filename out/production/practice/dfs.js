class Node {
	constructor(val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

const a  = new Node('a');
const b  = new Node('b');
const c  = new Node('c');
const d  = new Node('d');
const e  = new Node('e');
const f  = new Node('f');

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.left = f;

const depthFirstPrint = (root) => {
	const stack = [root];
	while(stack.length !== 0) {
		const curr = stack.pop();
		console.log(curr.val);
		if (curr.right !== null) {
			stack.push(curr.right);
		}

		if (curr.left !== null) {
			stack.push(curr.left);
		}
	}
}

depthFirstPrint(a);