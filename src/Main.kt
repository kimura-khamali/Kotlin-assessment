
//1. Write and invoke a function that given the string “Tatu city is the third tidiest city today” and prints out a list of all the other words and characters making up the string excluding all occurrences of letter t. (5 pts)
/*fun main(){
    write("Tatu city is the third tidiest city today")
}
fun write(sentence:String){
    sentence.forEach {word ->
        if (word != 't'){
            println(sentence)
        }
    }


}*/
//2.Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, product and average of all the elements. (5 pts)
/*fun main(args: Array<String>) {
    val answers = arrayOf(7, 8, 9, 10)
    println(answers.sum())
    println(answers.average())
answers.forEach { answer ->
    println(answer * answer)
}
}*/



/*3. The volume of a cylinder is calculated using the formula below

V=πr2h

Write and invoke a function that is capable of accurately calculating the
volume of any cylinder given its radius and height. Use 3.14159 as π (5 pts)*/
/*fun main() {
volumeOfCylinder(3.14,10)
}

fun volumeOfCylinder(pie:Double,height: Int) {
var radius = 22/7
    var volume = pie *(radius * radius) * height
    println(volume)
}*/

/*4. A palindrome is a string that reads the same forwards and backwards e.g
madam, wow, kayak. Write and invoke a function:
isPalindrome(word: String) that takes in a single word and prints “$word is a palindrome”  or “$word is not a palindrome”  depending on whether the word is a palindrome.*/

/*fun main() {
isPalindrome("madam")
}

fun isPalindrome(word: String) {
    if(word =="madam") {
        println("$word is a palindrome")
    }else{
        println("$word is not a palindrome")
    }
}*/
