/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Codec {
public:

    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if(!root)return "";
        string str= "";
       queue<TreeNode*> q;
       q.push(root);
       
       while(!q.empty()){
        TreeNode* temp = q.front();
        q.pop();
        if(temp==nullptr)str.append("#,");
        else{
            str.append(to_string(temp->val)+',');
        }
        if(temp!=NULL){
            q.push(temp->left);
            q.push(temp->right);
        }
       
       }
       return str;
        
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        if(data.size()==0)return nullptr;
        stringstream s(data);
        string str;
        getline(s,str,',');
        TreeNode *root = new TreeNode(stoi(str));
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
        TreeNode* temp = q.front();
        q.pop();
        getline(s,str,',');
        if(str=="#"){
          temp->left=nullptr;  
        }
        else{
            TreeNode* left = new TreeNode(stoi(str));
            temp->left = left;
            q.push(left);
        }
        getline(s,str,',');
         if(str=="#"){
          temp->right=nullptr;  
        }
        else{
            TreeNode* right = new TreeNode(stoi(str));
            temp->right = right;
            q.push(right);
        }

        }
        return root;
    }
};
