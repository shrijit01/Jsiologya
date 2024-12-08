package Lecture32TriesandHuffmanCoding;


class TrieNode{
	char data;//root node
	boolean isTerminal;//terminal node for every word
	TrieNode children[]; //Array of Children of Tries
	int childCount;

	public TrieNode(char data) {
		this.isTerminal = false;
		this.children = new TrieNode[26];
		this.childCount = 0;
	}

}

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode('\0');
	}


	public void addHelper(TrieNode root,String word) {

		if(word.length() == 0) {
			root.isTerminal = true;

			//			System.out.println("hi");
			return;
		}


		//		System.out.println(word.charAt(0));

		//		char c = word.charAt(0);
		//		int childIndex ;
		//		if(c>'z') {
		//			childIndex = c - 'a';
		//		}else {
		//			childIndex = c - 'A';
		//		}

		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		addHelper(child,word.substring(1));

	}


	public void add(String word) {
		addHelper(root,word);
	}


	public boolean searchHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			return root.isTerminal;
		}
		//		System.out.println(word);
		/* child value is word's charAt 0 index */
		//		char c = word.charAt(0);
		//		int childIndex ;
		//		if(c>'z') {
		//			childIndex = c - 'a';
		//		}else {
		//			childIndex = c - 'A';
		//		}
		int childIndex = word.charAt(0) - 'A';
		/*  child = root k andar children array me [childIndex]*/
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child, word.substring(1));
	}
	public boolean search(String word) {
		return searchHelper(root, word);
	}

	public void removeHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}

		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			return;
		}
		removeHelper(child,word.substring(1));

		//Most Important in Interview
		if(!child.isTerminal && child.childCount  == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
		
	}


	public void remove(String word) {
		removeHelper(root,word);
	}


}
