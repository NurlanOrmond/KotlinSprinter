fun main () {
    val oldEmployee = 50
    val oldEmployeeSalary = 30_000
    val newEmployee = 30
    val newEmployeeSalary = 20_000

    val totalOldSalary = oldEmployee * oldEmployeeSalary
    val tolalSalary = oldEmployee * oldEmployeeSalary + newEmployee * newEmployeeSalary
    val meanSalary = tolalSalary / (oldEmployee + newEmployee)

    println("\n\nTotal salary of old employees -" + totalOldSalary)
    println("Total salaty after coming new employees - " + tolalSalary)
    println("Mean salary now - "+meanSalary)
}