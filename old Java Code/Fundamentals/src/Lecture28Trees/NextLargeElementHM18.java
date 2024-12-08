package Lecture28Trees;

public class NextLargeElementHM18 {
	
//	 
// 	public static TreeNode<Integer> nextLargerElement2(TreeNode<int> *root, int n) {
//     /* Given a generic tree and an integer n. Find and return the node with next
//      * larger element in the Tree i.e. find a node with value just greater than
//      * n. */
//     if(root==nullptr) return nullptr;
//     if(root->data>n) return root;
//     int childCount = root->children.size();
//     TreeNode<int> *result;
//     for(int i=0; i<childCount; i++)
//         if((result=nextLargerElement(root->children[i], n))!=nullptr)
//             return result;
//
//     return nullptr;
// }

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//	approch 2
	
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
if(root==null) return null;
    int childCount = root.children.size();
    if(childCount==0) // Base Case
    {
        if(root.data > n) return root; // Found node with value greater than n
        return null;
    }
    TreeNode<Integer> result =null;
    if(root.data > n) result=root; // Found node with value greater than n
    for(int i=0; i<childCount; i++)
    {
        TreeNode<Integer> temp = findNextLargerNode(root.children.get(i), n);
        if(temp==null) continue;
        if(result== null || result.data> temp.data)
            result = temp;
    }
    return result;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
