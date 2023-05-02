fun main() {
    personsInfo("MaryJane",24,"Kenya")
    println(addition(45,65,55,35))

    println(getAverage(2,3,4,5,6))

    var name: String="Mary Jane"
    println(name)
    var age: Byte = 23
    println(age)
    var phoneNumber: String = "254757197885"
    println(phoneNumber)
    var weight: Double = 50.3
    println(weight)
    var Ugandan: Boolean = true
    println(!Ugandan)

}
//1. Create and invoke a function
//that takes in a users name, age, and nationality and prints out “Hello my name is
//${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
//I am 23 years old and I am from Kenya” (2 points)
fun personsInfo(name: String,age: Int,nationality: String){
    println("Hello my name is $name,I am $age years old and I am from $nationality")

}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(num1: Int,num2: Int,num3: Int,num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}

//3. Create and invoke a function that given any 5 numbers, it returns their average
fun getAverage(num5: Int,num6: Int,num7: Int,num8:Int,num9: Int): Int{
    var totalAverage = (num5 + num6 + num7 + num8 + num9)/5
    return totalAverage

}

//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)

