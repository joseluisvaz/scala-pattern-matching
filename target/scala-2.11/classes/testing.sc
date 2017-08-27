import patmat._

val A = List('a','b','c','a','b','b','c','b')

val B = Huffman.times(A)
val leaf = Huffman.Leaf('c', 5)
val leaf2 = Huffman.Leaf('p', 6)
val leaf3 = Huffman.Leaf('b', 4)
val leaf4 = Huffman.Leaf('l', 9)
val fork1 = Huffman.makeCodeTree(leaf, leaf2)
val fork2 = Huffman.makeCodeTree(leaf3, leaf4)

val listie = List(leaf, fork1, leaf3)


val C = Huffman.makeOrderedLeafList(B)
val nuevo = Huffman.combine(C)



B.sortWith((t1, t2) => t1._2 < t2._2)


val D = List()
Huffman.insertLeaf(leaf, C, List())

Huffman.weight(leaf)

val newfork = Huffman.makeCodeTree(leaf, leaf2)


A.takeRight(4)