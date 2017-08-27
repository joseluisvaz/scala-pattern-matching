import patmat._

val A = List('a','b','c','a','b','b','c','b')

val B = Huffman.times(A)


val leaf = Huffman.Leaf('c', 4)
val leaf2 = Huffman.Leaf('p', 6)
val forkie = Huffman.Fork(leaf, leaf2, List('k','p'), 10)
val C = Huffman.makeOrderedLeafList(B)

val D = List()
Huffman.insertLeaf(leaf, C, List())

Huffman.weight(leaf)

val newfork = Huffman.makeCodeTree(leaf, leaf2)


