#include<iostream>
#include<vector>
#include<stack>
using namespace std;
class TreeNode{
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int val){
        this->val=val;
        this->left=NULL;
        this->right=NULL;
        
    }
};
vector<int>inorder(TreeNode*root){
    vector<int>res;
    stack<TreeNode*>st;
    st.push(root);
    while(!st.empty()){
        TreeNode*temp=st.top();
        st.pop();
        if(temp!=NULL){
            if(temp->left!=NULL){
                st.push(temp->left);
                
            }
            st.push(temp);
            if(temp->right!=NULL){
                st.push(temp->right);
            }

        }
    }
    return res;
}
int main(){

}