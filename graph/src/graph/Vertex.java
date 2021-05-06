package graph;
public class Vertex{
    int id;
    Object info;
    COLOR color;
    public Vertex(int id, Object info, COLOR color){
        this.id = id;
        this.info = info;
        this.color = color;
    }
    public String toString(){
        return "VERTEX ID[\n" + "INFO : "+ info +"\nCOLOR : "+color+ "\n]";
    }
}
