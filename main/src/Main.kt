import javax.swing.Painter

//-----------------------Type Conversion------------------------------------
//fun main() {
//    var x: Int = 7
//    var y: Double = 3.14
//
//   // x = y  // ERROR - Converting the type: integer = decimal.toInt()
//    x = y.toInt()
//
//    print(x)


//---------------------- Numbers------------------------------------------
//fun main() {
//    val s: Short = 12
//    val b: Byte = 120
//    val i: Int = -10000
//    val l: Long = 24324324241
//    val f: Float = 7234.234f
//    val d: Double = 834957.456456
//
//    val answer = s + b + i
//    print(answer)
//}

//----------------------Char------------------------------------------------
//fun main() {
//    val letter: Char            // you can do Char like this (1) -----you specify one character in Char
//    letter = 'K'
//
//    val page: Char = 'H'       // or do Char like this (2)
//
//   print(letter)
//    print(page)
//
//}

//--------------------------Boolean----------------------------------------
// Booleans: Have 2 possible values: either true or false-------------------
// Boolean are used in decision-making statements

//fun main() {
//    val flag: Boolean = false;
//    val star = true
//
//    print(flag)
//    print(star)
//
//}


//------------Strings-----------------------------------------------------
// Strings are types of a class------------------------------------------

//fun main() {
//    val stringA: String = "Hello Master Coding Channel" // String Literals
//    print(stringA)
//
//    val stringB = "Hello Ahmed"
//    print(stringB)
//}

//----------------Concatenation----------------------------------------------
//fun main() {
//    val stringA: String= "Hi"
//    val stringB: String = " Ahmed"
//
//    println(stringA + stringB)
//
//    val stringC: String = stringA + stringB
//    println(stringC)
//}

//-----------------------String template----------------------------------
//fun main() {
//    val stringA: String = "Ali"
//    val stringB: String = "Hello my name is $stringA"
//    println(stringB)
//}

//----------------------Pair(x, y) and Triples(x, y, z)-----------------------------------
//In [Kotlin], you represent data in a very simple way using a "pair" or "triple".
//other languages use a type named "tuple" to hold similar combinations of value like [Python].
//Pair or triple are types that represent data composed of two or three values of any type.
//If you want to have more than three values, you can use: Kotlin calls a {data class}.


//*********Pair(x, y)***********
//
//fun main() {
//    val coordinatesA: Pair<Int, Int> = Pair(
//        2,
//        3
//    ) // creating a constant "coordinates" which is a value of the data type: "Pair" which take [x] as integer and [y] as integer.
//    println("The Coordinates: $coordinatesA")     // The {Academic} way
//
//    val coordinatesB = Pair(4, 5)
//    println("The Coordinates: $coordinatesB")   // {Type Interface}
//
//    val coordinatesC = 2 to 3                // using {to} operators
//    println("The x Coordinates: ${coordinatesC.second}")
//
//    val coordinatesD = Pair(4.1, 2)
//    println("The x Coordinates: ${coordinatesD.first}")
//}


//*********Triples(x, y, z)***********
//fun main() {
//
//    val coordinates3D: Triple<Int, Int, Int> = Triple(1,2,3)   // the {academic} way
//    println("The 3D coordinates: " + coordinates3D)    // "string concatenation" way
//    println("The 3D coordinates: $coordinates3D")      // "string template" way ---> using dollar sign
//    val x = coordinates3D.first
//    val y = coordinates3D.second
//    val z = coordinates3D.third
//    print("z of coodinates: " +coordinates3D.third)
//
//    val coordinates3D_2 = Triple(4,5,6)    // using {type interface}
//    println("The 3D coordinates: " + coordinates3D_2)    // "string concatenation" way
//    println("The 3D coordinates: $coordinates3D_2")      // "string template" way ---> using dollar sign
//    val x_2 = coordinates3D_2.first
//    val y_2 = coordinates3D_2.second
//    val z_2 = coordinates3D_2.third
//
//}


// ----------------------------------Any, Unit, Nothing----------------------------------