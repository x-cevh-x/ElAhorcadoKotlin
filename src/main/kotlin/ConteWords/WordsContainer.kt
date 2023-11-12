package ConteWords

class WordsContainer {
    val words = arrayListOf("serpiente", "hospital", "murcielago", "computadora", "televisor","mandarina","roblox","escuela","camiseta","cinturon")
    val rand = (0..< words.size).random()

    fun wordRandom(): String{
        return words[rand]
    }


}