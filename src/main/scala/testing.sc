import patmat._

val A = List('a','b','c','a','b','b','c','b')

val B = Huffman.times(A)


val leaf = Huffman.Leaf('k', 3)
val C = Huffman.makeOrderedLeafList(B)

val D = List()
Huffman.insertLeaf(leaf, C, List())




