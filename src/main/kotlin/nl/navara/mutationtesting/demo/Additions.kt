package nl.navara.mutationtesting.demo

/**
 * This serves as a simple example. Don't mind the silly code design. ;)
 */
class Additions {

    fun additionIsPositive(a: Int, b: Int) = add(a, b) > 0

    private fun add(a: Int, b: Int) = a + b
}
