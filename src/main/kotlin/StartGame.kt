import Grafica.HangmanGraphic
import HugMan.hangMan
import java.awt.PageAttributes.PrintQualityType

fun main() {
    var vida = 0
    val hgm = hangMan()
    val img = HangmanGraphic().imagen
    val palabra = hgm.lettterList
    var miPalabra = hgm.showCharacter()
    var letrasIngresadas = mutableListOf<Char>()
    var letra: Char



    print("\n### ADIVINA LA PALABRA ###\n\n")
    do {
        println(img[vida])
        println("palabra: $miPalabra")

        print("que letra va: ")

        letra = readln().first()
        if (letra in palabra) {
            if (letra !in letrasIngresadas) {
                letrasIngresadas.add(letra)
                palabra.forEachIndexed { i, it ->
                    if(letra == it) {
                        if(letra != miPalabra[i]) {
                            miPalabra[i] = letra
                        }
                    }
                }
            }
            else{
                println("Ya intentastes con esta letra $letrasIngresadas")
            }
            if (miPalabra == palabra){
                println("Te felicito te has SALVADO, la palabra era: $palabra")
                break
            }
        }
        else{
            println("\nPilas la letra no esta en la palabran\n")
            ++vida
        }
        if (vida == 6){
            println()
            println("Perdistes estas AHORCADO")
            println(img[vida])
        }

    }while (vida < 6)
}