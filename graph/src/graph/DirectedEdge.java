package graph;

public class DirectedEdge extends Edge{
    int source;
    public DirectedEdge(int id,COLOR color, Vertex v1,Vertex v2,double value, int source){
        super(id,color,v1,v2,value);
        if(source >=0 && source <=1){
            this.source = source;
        }
        else{
            System.out.println("La source doit être entre 0 et 1");
            //Ne pas initialiser
        }
    }
    public Vertex getSource(){
        return ends[source];
    }

    public Vertex getSink(){
        if(source == 0){
            return ends[1];
        }
        else{
            return ends[0];
        }
    }

    public String toString(){
        return super.toString()+"DIRECTED EDGE WITH SOURCE :" + getSource().toString()+"\n]";
    }
}