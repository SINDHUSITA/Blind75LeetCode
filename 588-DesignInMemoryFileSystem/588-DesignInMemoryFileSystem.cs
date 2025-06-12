// Last updated: 6/12/2025, 8:29:47 AM
public class Node
{
    public bool isFile{get;set;} = false;
    private StringBuilder _content = new StringBuilder();
    public string content{get => _content.ToString();
        set => _content.Append(value);}
    public SortedDictionary<string,Node> children {set;get;} = new();
}
public class FileSystem {
    private Node root;
    public FileSystem() {
        root = new Node();
    }
    
    public IList<string> Ls(string path) {
        string[] paths = path.Split('/');
        List<string> fileFolders = new List<string>();
        // if(path.Contains('.'))
        //     fileFolders.Add(paths[paths.Length-1]);
        // else
        // {
            Node lsPath = root;
            if(path.Length!=1)
            {
                for(int folderIndex = 1;folderIndex<paths.Length;folderIndex++)
                {
                    lsPath = lsPath.children[paths[folderIndex]];
                }
            }
            foreach(string child in lsPath.children.Keys)
            {
                fileFolders.Add(child);
            }
            if(lsPath.isFile)
                fileFolders.Add(paths[paths.Length-1]);
        // }
        return fileFolders;
    }
    
    public void Mkdir(string path) {
        string[] folders = path.Split('/');
        MkdirHelper(folders);
    }
    private Node MkdirHelper(string[] folders)
    {
        Node currDir = root;
        for(int folderIndex = 1;folderIndex<folders.Length;folderIndex++)
        {
            string folder = folders[folderIndex];
            if(currDir.children.ContainsKey(folder))
            {
                currDir = currDir.children[folder];
            }
            else
            {
                currDir.children.Add( folder, new Node());
                currDir = currDir.children[folder];
            }
        }
        return currDir;
    }
    
    public void AddContentToFile(string filePath, string content) {
        string[] folders = filePath.Split('/');
        string file = folders[folders.Length-1];
        Node currDir = MkdirHelper(folders.Take(folders.Length-1).ToArray());
        if(!currDir.children.ContainsKey(file))
        {
            currDir.children.Add(file,new Node(){isFile = true});
            currDir = currDir.children[file];
        }
        else
            currDir = currDir.children[file];
        // Console.WriteLine(content+"-"+currDir.content);
             currDir.content = content;
        //     Console.WriteLine(content+"-"+currDir.content);
    }
    
    public string ReadContentFromFile(string filePath) {
        string[] paths = filePath.Split('/');
        Node currDir = root;
        for(int folderIndex = 1;folderIndex<paths.Length;folderIndex++)
        {
            currDir = currDir.children[paths[folderIndex]];
        }
        return currDir.content;
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * IList<string> param_1 = obj.Ls(path);
 * obj.Mkdir(path);
 * obj.AddContentToFile(filePath,content);
 * string param_4 = obj.ReadContentFromFile(filePath);
 */