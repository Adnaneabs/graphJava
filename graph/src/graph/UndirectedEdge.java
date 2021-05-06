package graph;
public class UndirectedEdge extends Edge{
    public UndirectedEdge(int id, COLOR color, Vertex v1,Vertex v2,double value){
        super(id,color,v1,v2,value);
    }
    public Vertex[] getEnds(){
        return ends;
    }
    public String toString(){
        return super.toString()+"UNDIRECTED EDGE\n]";
    }
}