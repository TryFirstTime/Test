package p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

interface Graph
{
	public int getVertexCount();
	public int getEdgeCount();
	public boolean isDirected();
	
	public Edge addEdge( Vertex v, Vertex w );
	public Edge addEdge( Vertex v, Vertex w , int edgeWeight);
	public Edge addEdge( Edge e );
	public Edge removeEdge( Vertex v, Vertex w );
	public Edge removeEdge( Edge e );
	public boolean hasEdge( Vertex v, Vertex w );
	
	public Vertex addVertex( String vertexName );
	public Vertex addVertex( Object vertexName, Vertex v );
	public Vertex removeVertex( Vertex v );
	public Vertex removeVertex( Object vertexName );
	public Vertex getVertex( Object vertexName );

	public Iterator getAdjacentVertices( Vertex v );
	public Iterator getAdjacentVertices( Object vertexName );
	public Iterator getEdges( Vertex v );
	public Iterator getEdges( Object vertexName );
	
	public Iterator getVertices();
	public Iterator getEdges();
	
	public Graph Prim(Vertex root); //for Lab9
	public Map getTreeMap();
	
	public Edge getEdgeForUV_KEY( Vertex v, Vertex w );
	public Vertex minVertexInPriorityQue();
	public HashMap getParent();
}

