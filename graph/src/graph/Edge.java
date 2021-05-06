package graph;
public abstract class Edge{
    int id;
    COLOR color;
    Vertex[] ends;
    double value;

    public Edge(int id, COLOR color, Vertex v1,Vertex v2,double value){
        this.id = id;
        this.color = color;
        ends = new Vertex[2];
        ends[0] = v1;
        ends[1] = v2;
        this.value = value;
    }

    public String toString(){
        return "Edge [ID : "+id+"\nCOLOR : "+color+"\nVERTEX 1 : "+ ends[0].toString()+"\nVERTEX 2 : "+ends[1].toString()+"\nVALUE : "+value+"\n";
    }
}