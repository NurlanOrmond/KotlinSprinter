package lesson02

fun main () {
    val quantityOfPuples = 4

    var markOfFirstPuple = 3.00
    var markOfSecondPuple = 4.00
    var markOfThirdPuple = 3.00
    var markOfForthPuple = 5.00

    var arithmeticMean = ((markOfFirstPuple+markOfSecondPuple+markOfThirdPuple+markOfForthPuple)/quantityOfPuples).toDouble()

    println(arithmeticMean)
}