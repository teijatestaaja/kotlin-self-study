fun append(arr: Array<String>, element: String): Array<String> {
    val list: MutableList<String> = arr.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun main() {
    var arrayOfStrings = arrayOf("apple", "pear", "banana")
    arrayOfStrings = append(arrayOfStrings, "watermelon")
    for (item in arrayOfStrings)
      println(item)
}