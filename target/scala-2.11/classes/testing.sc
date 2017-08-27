import patmat._

val A = List('a','b','c','a','b','b','c','b','c','d','z','k','e','e')

val B = Huffman.times(A)
val leaf = Huffman.Leaf('c', 5)
val leaf2 = Huffman.Leaf('p', 6)
val leaf3 = Huffman.Leaf('b', 4)
val leaf4 = Huffman.Leaf('l', 9)
val fork1 = Huffman.makeCodeTree(leaf, leaf2)
val fork2 = Huffman.makeCodeTree(leaf3, leaf4)

val listie = List(leaf, fork1, leaf3)


val C = Huffman.makeOrderedLeafList(B)
//val tree = Huffman.until(Huffman.singleton, Huffman.combine)(C)

List(fork1).head

val K = Huffman.createCodeTree(A)