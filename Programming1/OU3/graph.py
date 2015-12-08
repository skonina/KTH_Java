import networkx as nx
import pygraphviz as pgv # need pygraphviz or pydot for nx.to_agraph()

def Graph_draw (G_in, G_name):
	default_attributes={'graph':{},'node':{},'edge':{}}
	#default_attributes['graph']['label']='pygraphviz graph'
	default_attributes['node']['shape']='box'
	
	for u,v,d in G_in.edges(data=True):
	    d['label'] = d.get('weight','')
	A = nx.to_agraph(G_in)
	
# 	A.edge_attr['constraint']='false'
# 	A.edge_attr['labeldistance']='1'
# 	A.edge_attr['forcelabels']='true'
	#A.edge_attr['decorate']='true'
# 	A.graph_attr['ranksep']='equally'
	A.graph_attr['rankdir']='LR'
# 	A.graph_attr['splines']='line'
# 	A.node_attr['shape']='oval'

	A.add_subgraph(('X'), name = 'cluster_1',style='invis', rank=1)
	A.add_subgraph((1,2,3), name = 'cluster_2',style='invis', rank =2)
	A.add_subgraph((10,20,30,40), name = 'cluster_3',style='invis', rank=3)
	A.add_subgraph(('Y'), name = 'cluster_4',style='invis', rank=4)
	A.add_subgraph(('X',3,30,'Y'), name='path')
	
	A.layout(prog='dot')
	A.draw(G_name+'.png')
	A.write('G1.dot')
	
	return


G = nx.DiGraph()
G.add_edge('X',1,weight=1)
G.add_edge('X',2,weight=2)
G.add_edge('X',3,weight=2)

G.add_edge(1,10,weight=5)
G.add_edge(1,20,weight=2)
G.add_edge(1,30,weight=4)
G.add_edge(1,40,weight=2)

G.add_edge(2,10,weight=1)
G.add_edge(2,20,weight=3)
G.add_edge(2,30,weight=2)
G.add_edge(2,40,weight=5)

G.add_edge(3,10,weight=3)
G.add_edge(3,20,weight=2)
G.add_edge(3,30,weight=1)
G.add_edge(3,40,weight=4)

G.add_edge(10,'Y',weight=3)
G.add_edge(20,'Y',weight=2)
G.add_edge(30,'Y',weight=1)
G.add_edge(40,'Y',weight=3)

Graph_draw(G, 'Graph G')


