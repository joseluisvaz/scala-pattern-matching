import patmat._

val A = List('a','b','c','b','b','c','b','c','d','z','k','e','e')

val B = Huffman.times(A)
val leaf = Huffman.Leaf('c', 5)
val leaf2 = Huffman.Leaf('p', 6)
val leaf3 = Huffman.Leaf('b', 4)
val leaf4 = Huffman.Leaf('l', 9)
val fork1 = Huffman.makeCodeTree(leaf, leaf2)
val fork2 = Huffman.makeCodeTree(leaf3, leaf4)

fork2.chars.contains('b')

Huffman.encode(Huffman.frenchCode)("holamiamigo".toList)

val todecode = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0)

Huffman.decode(Huffman.frenchCode, todecode)