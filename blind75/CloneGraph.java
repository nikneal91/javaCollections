package blind75;

import java.util.ArrayList;
import java.util.List;

class GNode {
    public int val;
    public List<GNode> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<GNode>();
    }
    public GNode(int _val) {
        val = _val;
        neighbors = new ArrayList<GNode>();
    }
    public GNode(int _val, ArrayList<GNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {



    public static void main(String[] args) {
        
    }
}