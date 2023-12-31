package chapter01

class UpperCasedList: ArrayList<String>() {

    override fun add(element: String) : Boolean{
        return super.add(element.uppercase())
    }

    override fun add(index: Int, element: String){
        super.add(index, element.uppercase())
    }

    override fun addAll(elements: Collection<String>): Boolean {
        return super.addAll(elements.map { it -> it.uppercase() })
    }

    override fun addAll(index: Int, elements: Collection<String>): Boolean {
        return super.addAll(index, elements.map { it -> it.uppercase() })
    }

    override fun set(index: Int, element: String): String {
        return super.set(index, element.uppercase())
    }
}

fun main(args: Array<String>){
    val names = UpperCasedList()
    names.add("vatsal")
    names.add("limbachia")
    println("Name in upper case is : $names")
}