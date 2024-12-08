package Lecture32TriesandHuffmanCoding;

public class TrieUse {

	public static void main(String[] args) {
		
		Trie t = new Trie();
//		t.add("NOTE");
//		t.add("AND");
		t.add("AND");
		System.out.println(t.search("AND"));
		t.remove("AND");
		System.out.println(t.search("AND"));
	}

}
