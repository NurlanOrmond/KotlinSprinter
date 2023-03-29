fun main() {
    val seconds: Short = 6480
    val secondsInMinute: Byte = 60
    var minute: Short
    var second: Byte

    minute = (seconds/secondsInMinute).toShort()
    second = (seconds - minute*secondsInMinute).toByte()

    println("\n\n$minute" + ":" + second.toString().padStart(2, '0'))

}