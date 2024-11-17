// 1 -List (on a deux type de liste mutable et immutable )

val listNumber: List<Any>  =listOf(1,2,3,4,5,)
val listString: List<String>  =listOf("apple", "banana", "cherry", "apricot", "blueberry")

// fun main (){
//     val listNumberTwo : MutableList<Int> =mutableListOf(1,2,3,4,5) // on peut changer sur cette liste avec ces propres methode

//     listNumberTwo.add(2)

//     for (number in listNumber){
//           println(number)      
//     }

//     println(listNumberTwo)
// }

// * Les methode de liste 


// fun main(){
//     // * FILTER 
//     println(listNumber.filter { it % 2 ==0 })

//     // * map (elle faire une copie de telle sorte array)
//     println(listNumber.map { it*it })
// }


// 2 - Array  ( généralement on utilise array collection de taille fixe )

// val arrayNumber = arrayOf("haythem","said",1)
// fun main(){
//     println(arrayNumber.joinToString())
// }

// 3 - Map (ou Dictionnaires)

fun main() {
    val map = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(map.keys) // Affiche: [one, two, three]


    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap["three"] = 3
    println(mutableMap) // Affiche: {one=1, two=2, three=3}
}
