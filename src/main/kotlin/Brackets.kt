fun main() {
    val open = "(".single()
    val close = ")".single()

    val oldBrackets = "()))()()((()()(("
    val oldBrackets2 = "()))()()((()()((".toMutableList()

    if (oldBrackets2.first() == close) oldBrackets2.add(1, open)
    if (oldBrackets2.last() == open) oldBrackets2.add(close)

    val iterator = oldBrackets2.listIterator()
    while (iterator.hasNext()) {
        if (iterator.next() == "(".single()) {
            if (iterator.hasNext()) {
                if (iterator.next() != ")".single()) {
                    iterator.previous()
                    iterator.add(")".single())
                }
            }
        } else {
           if (iterator.previous() != "(".single())  {
               iterator.add("(".single())
               iterator.next()
           }
        }
    }


    println(oldBrackets)
    println(oldBrackets2.joinToString(separator = ""))


}
