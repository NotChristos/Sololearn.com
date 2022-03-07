fun main(args: Array<String>) {
    println("Сколько часов длилась Ваша парковка? ")
    val hours = readLine()!!.toInt()
    var total: Double = 0.0
    val day = hours / 24
    
    if (hours <= 5) {
        val result: Double = 1.0 * hours // первые 5 часов по 1$
        total += result
    } else if (hours in 6..23) {
        val result: Double = (hours - 5.0) * 0.5 // после 5-ти часов стоимость каждого часа 0.5$
        total += result + 1.0 * 5
    } else {
        val result: Double = (hours % 24.0) * 0.5 // за каждые 24 часа взымается плата в 15%
        total += result + (15 * day)
    }
    
    println("К оплате: $total $")
}
