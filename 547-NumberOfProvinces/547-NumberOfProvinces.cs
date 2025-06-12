// Last updated: 6/12/2025, 8:29:49 AM
public class Solution {
    public int FindCircleNum(int[][] isConnected) {
        int n = isConnected.Length;
        var dsu = new UnionFind(n);
        int numberOfComponents = n;
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n; j++){ // upper triangle in matrix is enough
                if(isConnected[i][j]==1 && dsu.find(i) != dsu.find(j)){
                    numberOfComponents -- ;
                    dsu.Union_set(i,j);
                }
            }
        }

        return numberOfComponents;
    }
}

public class UnionFind{
    int[] parent;
    int[] rank;
    public UnionFind(int size){
        parent = new int[size];
        for(int i=0;i<size;i++){
            parent[i] = i;
        }
        rank = new int[size];
    }

    public int find(int x){
        if(parent[x]!=x)
            return parent[x]=find(parent[x]);

        return parent[x];
    }

    public void Union_set(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY){
            return;
        }
        else if(rank[rootX]>rank[rootY]){
            parent[rootY] = rootX;
        }
        else if(rank[rootY]>rank[rootX]){
            parent[rootX] = rootY;
        }else{
            parent[rootY]=rootX;
            rank[rootX]++;
        }
    }
}