fun main () {
//    Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
//    а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//    – Создай целочисленные переменные и проинициализируй их этими данными;
//    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//    – Выведи результат в консоль.

    val hour = 9
    val minute = 39
    val minutesInHour = 60
    val timeOnTrip = 457
    val convertToMinutes = hour * minutesInHour + minute
    val arrivingInMinutes = convertToMinutes + timeOnTrip
    val arrivingHour = arrivingInMinutes/minutesInHour
    val arrivingMinute = arrivingInMinutes - arrivingHour*minutesInHour

    print("\n\nArriving time at $arrivingHour:$arrivingMinute\n\n")

}

