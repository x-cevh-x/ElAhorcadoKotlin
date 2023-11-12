package HugMan

import ConteWords.WordsContainer
import kotlin.math.roundToInt

class hangMan {

    private val word = WordsContainer().wordRandom()
    var lettterList = mutableListOf<Char>()
    private var hidenword = mutableListOf<Char>()


    init {
        word.forEach { it-> lettterList.add(it)}
        lettterList.forEach{it->hidenword.add('_')}
    }

    fun showCharacter(): MutableList<Char>{
        var numLetter = (lettterList.size * 0.4).roundToInt()
        var posLetter: Int
        while (numLetter != 0) {
            posLetter = (0..<lettterList.size).random()
            if(hidenword[posLetter] == '_') {
                hidenword[posLetter] = lettterList[posLetter]
            }
            numLetter--
        }
        return hidenword
    }
}
