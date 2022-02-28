fun main(args: Array<String>) {
    println("Укажите, сколько лет вы живёте в этом доме:")
    var years = readLine()!!.toInt()
    years *= 15
    years *= 365
    println("$years литров воды было израсходованнно за это время")
}
