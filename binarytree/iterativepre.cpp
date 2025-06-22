#include <iostream>
#include <vector>
#include<stack>
using namespace std;
struct TreeNode{
    int val;
    TreeNode*left;
    TreeNode*right;
    TreeNode(int val){
        this->val=val;
        this->left=NULL;
        this->right=NULL;
    }
};

vector<int>preorder(TreeNode*root){
    vector<int>res;
    stack<TreeNode*>st;
    if(root==NULL){
        return res;
    }
    st.push(root);
    while(!st.empty()){
        TreeNode*temp=st.top();
        st.pop();
        res.push_back(temp->val);
        if(temp->right!=NULL){
            st.push(temp->right);
        }
        if(temp->left!=NULL){
            st.push(temp->left);
        }
    }
    return res;

}