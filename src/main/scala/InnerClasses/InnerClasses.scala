package InnerClasses

class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node): Unit = {
      if(connectedNodes.find(node.equals).isEmpty)
        connectedNodes = node :: connectedNodes
    }
  }
  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}

object InnerClasses {
  def main(args: Array[String]): Unit = {
    val graph1: Graph = new Graph
    val node1: graph1.Node = graph1.newNode
    val node2: graph1.Node = graph1.newNode
    val node3: graph1.Node = graph1.newNode
    node1.connectTo(node2)
    node3.connectTo(node1)
  }
}
