//Umap method (O(n)) 

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int, int> umap;
        for (int i = 0; i < nums.size(); i++)
            if (++umap[nums[i]] == 2) return true;
        return false;
    }
};

//Sorting  Method O(nlogn)
class Solution{
public:
    bool containsDuplicate(vector<int>& nums){
        sort(nums.begin(), nums.end());
        for(int i=0; i<nums.size(); i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}