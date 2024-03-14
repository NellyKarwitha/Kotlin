import java.time.LocalDate


fun main(){
    ifss()
    test()
    abc()
    xyz()
    //incr()
    text()
    hij()
   // now()
}

fun ifss() {

    var text = 85
    var red = 56

    if (text > red) {
        println("Text > Red")
    } else if (text < red) {
        println("Text < Red")
    } else{
        println("Text = Red")
    }

}

fun test(){

    var number = 5

    if (number < 0) {
        println("Negative Integer")
    }else if(number > 0) {
        println("Positive Integer")
    }else {
        println("Zero")
    }

}

fun abc(){

    var Math = 40
    var Eng = 20
    var Kisw = 20

    var Mean:Int = (Math+Eng+Kisw)/3
        println("Mean: $Mean")

    if (Mean >= 80){
        println("Grade : A")
    }else if (Mean >= 60){
        println("Grade : B")
    }else if (Mean >= 40) {
        println("Grade: C")
    }else{
        println("Grade: D")
    }

}

fun xyz(){

    var one = 6
    var two = 80
    var three = 4

//    var maximum:Int = maxOf(one, two, three)
//    println("The greatest number is $maximum")

//    if (one>two && one>three) {
//        println("The greatest number is $one")
//    }else if (two>one && two>three){
//        println("The greatest number is $two")
//    }else{
//       println("The greatest number is $three")
//    }

    if(one > two){
        println(one)
    }

    else if(two > three){
        println(two)
    }

    else if(three > one){
        println{three}
    }

    else{
        print("similar")
    }
}

//fun incr() {

//    var grade = 10

//    while (grade > 8) {
 //       println(grade)
//        grade++
//    }
//}

// fun now(){

//    val current:LocalDate = LocalDate.now()
//    println("current")

// }

fun hij(){

    var text = -45                                                                                                                    

    if (text < 0){
        println("Negative number")
    }

    if(text < 10 && text > 0){
        println("One digit")
    }

    else if (text >= 10 && text <= 99){
        println("Two digits")
    }

    else if (text > 99 && text <= 999){
        println("Three digits")
    }

    else if (text > 999 && text <= 9999){
        println("Four digits")
    }

    else if (text > 9999 && text <= 99999){
        println("Five digits")
    }




}
