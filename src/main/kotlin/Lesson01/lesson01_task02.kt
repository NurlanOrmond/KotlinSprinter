import kotlin.math.roundToInt

//Задача 4 к Уроку 2
//В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
// который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной
// руды без баффа – заранее известные данные, объявить и проинициализировать.
//Напиши программу, которая будет учитывать действие баффа и выводить в консоль
// количество “бонусных” (то есть тех материалов, которые даются “сверху” баффом).
// По одной строке на материал с его названием.
//Если получается нецелое число, то дробная часть должна отбрасывается.

fun main () {
    val cristal = 7
    val ferrum = 11
    val buffRatio = 0.2

    val cristalBuffRatio = cristal * buffRatio
    val ferrumBuffRatio = ferrum * buffRatio

    println("Buff of cristal - ${cristalBuffRatio.roundToInt()}")
    println("Buff of ferrum - ${ferrumBuffRatio.roundToInt()}")
}