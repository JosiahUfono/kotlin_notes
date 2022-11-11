fun main() {
    val Sides = dice(6)
    println(Sides.sides)
    val secondDice = dice(6)
    println(secondDice.sides)
    val thirdDice = dice(10)
    //calling ffrom a function
    println(" the number of sides of the third dice is ${(thirdDice.roll())}")
}

class dice(val numSides:Int){
    val sides = (1..numSides).random()
    
    fun roll():Int{
        return (1..numSides).random()
    }
}
