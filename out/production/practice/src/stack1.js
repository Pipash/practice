class StackNode {
	constructor(val) {
		this.val = val;
		this.next = null;
	}
}

class Stack {
	constructor() {
		this.top = null;
		this.size = 0;
	}

	push(val) {
		if (this.size === 0) {
			this.top = new StackNode(val);
		} else {
			const pushedNote = new StackNode(val);
			pushedNote.next = this.top;
			this.top = pushedNote;
		}

		this.size++;
	}

	pop() {
		if (this.size === 0) {
			return null;
		}

		const poppedNode = this.top;
		this.top = this.top.next;
		this.size--;

		return poppedNode.val
	}
}

const myStack = new Stack();
myStack.push('a');
myStack.push('b');
myStack.push('c');
//console.log(myStack);
console.log(myStack.size);
console.log(myStack.top);
console.log(myStack.pop());
console.log(myStack.size);
