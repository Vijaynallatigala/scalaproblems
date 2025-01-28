object first {

  def main(args: Array[String]): Unit = {


    // 1. even and positive number

    //    println("Enter the number")

    //    var x = scala.io.StdIn.readInt()
    //    if (x % 2 == 0 && x>0) {
    //      println("even number and positive")
    //    }
    //    else if (x % 2 == 0 && x<0)
    //      {
    //        println("even and negative")
    //      }
    //    else if (x%2!=0 && x<0)
    //      {
    //        println("odd and negative")
    //      }
    //    else {
    //      println("odd number")
    //
    //    }

    // 2.  Range Check with OR

    //determine if a given value is less than -10 or greater than 10

    //   println("Enter the number")
    //
    //    var x = scala.io.StdIn.readInt()
    //    if (x < -10 || x > 10 )
    //      {
    //        println("Greater than 10")
    //
    //      }
    //    else {
    //      println("less than -10")
    //    }

    // 3. odd number check with AND
    // implement a scala function to check if a given number is odd and not divisible by 3

    //    println("Enter the number")

    //    var x = scala.io.StdIn.readInt()
    //
    //    if(x % 2 !=0 && x % 3!=0)
    //      {
    //        println("the number is odd and not divisible by 3")
    //
    //      }
    //    else if (x%2!=0)
    //      {
    //        println("the number is odd and divisible by 3")
    //
    //      }
    //    else
    //      {
    //        println("the number is not odd")
    //      }


    // 4)Divisibility by 4 OR 6
    // Write a Scala program to check if a given number is divisible by either 4 or 6.

    //    println("enter the number")
    //
    //    var x = scala.io.StdIn.readInt()
    //    if(x % 4 ==0 || x % 6==0)
    //      {
    //        println("divisible by 4 or 6")
    //      }
    //    else
    //      {
    //        println("not divisible by 4 or 6")
    //      }


    // 5)Eligibility for Voting OR Driving:

    // Create a Scala program to check if a person is eligible to vote
    // (age greater than or equal to 18) or
    //eligible to drive (age greater than or equal to 16).

    //
    //    println("Enter the number")
    //    var age = scala.io.StdIn.readInt()
    //
    //    if (age >=18)
    //      {
    //        println("eligible to vote and drive")
    //
    //      }
    //   else if(age >=16)
    //      {
    //        println("eligible to drive but not vote")
    //      }
    //   else
    //     {
    //       println("not eligible to drive and vote")
    //     }

    // 6. multiple range check
    // write a scala function to check if a given number is in the range[1,10] or [20,30]

    //    println("Enter the number")
    //    var x =scala.io.StdIn.readInt()
    //    if(x>1 && x<10 || x>20 && x<30)
    //      {
    //        //println(" the number is in the range of(1,10) or (20, 30)")
    //        println(s"the number $x is in the range (1,10) or (20,30)")
    //
    //      }
    //    else
    //      {
    //        //println(" the number is not in the range of(1,10) or (20, 30)")
    //        println(s"the number $x is not in the range (1,10) or (20, 30)")
    //
    //      }

    // 7. check for negative AND ODD number

    // implement a scala program to check if a given number is both negative and odd number

    //    println("enter the number")
    //
    //    var x = scala.io.StdIn.readInt()
    //    if(x%2!=0 && x<0)
    //      {
    //        println("the number is negative and odd number")
    //      }
    //    else if(x%2==0 && x<0)
    //      {
    //        println("the number is negative and even number")
    //      }
    //    else
    //      {
    //        println("the number is positive and even number")
    //      }

    // 8.  Eligibility for senior discount OR student discount

    //create a scala program to check if a person is eligible for a senior citizen discount
    //(age greater than 60) or a student discount(age less than 25)

    //    println("enter the age")
    //    var x= scala.io.StdIn.readInt()
    //    if(x>60 )
    //      {
    //        println("eligible for senior citizen discount")
    //      }
    //    else if(x<25)
    //      {
    //        println("eligible for student discount")
    //      }
    //      else{
    //        println("not eligible for anything")
    //      }

    // 9. divisibility by 5 AND 7

    //write a scala function to check if a given number is divisble by 5 and 7
    //
    //    println("enter any number")
    //
    //    var x =scala.io.StdIn.readInt()
    //
    //    if(x%5==0 && x%7==0)
    //      {
    //        println("Divisible by 5 and 7")
    //      }
    //    else
    //      {
    //        println("not divisible by 5 and 7")
    //      }

    // 10. Check for Non-Negative OR Even Number
    // Create a Scala program to check if a given number is either non-negative or even.
   // println("enter the number")

    //var x = scala.io.StdIn.readInt()

    //    if (x%2==0 && x<0)
    //      {
    //        println("the number is divisible by 2 and is negative")
    //
    //      }
    //    else if(x%2==0 && x>0)
    //      {
    //        println("the number is even  and non negative")
    //
    //    }
    //    else {
    //      println("not divisible by 2")
    //}


    // 11)Check for Prime AND Odd Number

    // Write a Scala function to check if a given number is both a prime number
    // and an odd number


    // 12)Eligibility for Discount OR Free Shipping

    //Create a Scala program to check if a customer is eligible for a discount
    // (purchase amount greater than 150)
    // or qualifies for free shipping (purchase amount greater than 100)

//    println("enter the number")
//    var x = scala.io.StdIn.readInt()
//    if(x >150 )
//      {
//        println("customer is eligible for a discount")
//      }
//
//    else if(x>100)
//      {
//        println("eligible for free shipping")
//      }
//    else
//      {
//        println("not eligible")
//      }



// 13)Divisibility by 3 OR 8

    // Write a Scala function to check if a given number is divisible by either 3 or 8.
//
//    println("enter the number")
//
//    var x = scala.io.StdIn.readInt()
//
//    if(x%3==0 || x%8==0)
//      {
//        println("the number is divisible")
//      }
//    else
//      {
//        println("the number is not divisible")
//      }


    // 14)Check for Non-Positive AND Even Number:
    //Implement a Scala program to check if a given number is both non-positive and even.

//    println("enter the number")
//    var x =scala.io.StdIn.readInt()
//    if(x<0 && x%2==0)
//      {
//        println("the number is negative  and even")
//
//      }
//    else if(x>0 && x%2!=0)
//      {
//        println("the number is  positive and odd ")
//      }
//
//    else if(x>0 && x%2==0)
//    {
//     println(" positive but even number")
//
//    }
//    else if(x<0 && x%2!=0){
//          print("negative and odd number")
//  }
//
//    else {
//    println("none")
//    }


    // 15)Age Group Classification with AND

    //Create a Scala program to classify a person's age group.
    // Classify them as a child (less than 13),
    //teenager (between 13 and 19), and an adult (20 and above)
    // using both logical AND and OR.

//    println("enter the age")
//
//    var x = scala.io.StdIn.readInt()
//    if(x<13)
//      {
//        println("Child")
//      }
//    else if( x>15 && x<19)
//      {
//        println("teenager")
//
//      }
//    else if (x>20)
//      {
//        println("adult")
//      }

    // 16. Check for Divisibility by 2 OR 5

    //Write a Scala function to check if a given number is divisible by either 2 or 5.

//    println("enter the number")
//
//    var x = scala.io.StdIn.readInt()
//    if(x%2==0 || x%5==0)
//      {
//        println("yes it is divisible by either 2 or 5")
//
//      }
//      else
//      {
//       println("it is not divisible")
//}

    // 17. Eligibility for Senior Discount AND Student Discount

    // Create a Scala program to check if a person is eligible for both a senior
    // citizen discount (age greater than 60) and a student discount (age less than 25)


//    println("enter the age")
//
//    var x = scala.io.StdIn.readInt()
//    if(x>60)
//      {
//        println("yes eligible for senior citizen discount ")
//      }
//    else if (x<25){
//        println("eligible for  student discount")
//      }
//    else {
//      println("not eligible for anything")
//    }

    // 19)Check for Multiple of 3 AND 7

    //Implement a Scala function to check if a given number is both a multiple of 3 and 7

//
//    println("enter the number")
//    var x = scala.io.StdIn.readInt()
//    if(x%3==0 && x%7==0){
//      println("it is multiple by 3 and 7")
//    }
//    else if(x%3==0 || x%7==0){
//      println("it is multiple either 3 or 7")
//    }
//    else{
//      println("not multiple by 3 and 7")
//    }

    // 20)Divisibility by 5 OR 9:
    //Write a Scala program to check if a given number is divisible by either 5 or 9.

//    println("enter the number")
//    var x = scala.io.StdIn.readInt()
//
//     if(x%5==0 && x%9==0){
//      println("yes divisible by both 5 and 9")
//    }
//     else if(x%5==0 || x%9==0){
//      println("divisible by either 5 or 9")
//    }
//
//    else{
//      println("not divisible by 5 or 9")
//    }

    // 19)Check for Multiple of 3 AND 7:
    //Implement a Scala function to check if a given number is both a multiple of 3 and 7

//    println("enter the number")
//    var x = scala.io.StdIn.readInt()
//    if(x%3==0 && x%7==0)
//      {
//        println("yes the given number is multiplied with both 3 and 7")
//      }
//    else if(x%3==0 || x%7==0){
//      println("the given number is multiplied with either 3 or 7")
//    }
//    else {
//      println("no the given number is not multiplied with both 3 and 7")
//    }

    //  21)Check for Odd AND Not Divisible by 4:
    //Create a Scala program to check if a given number is both odd and not divisible by 4.

    println("enter the number")
    var x =scala.io.StdIn.readInt()
    if (x%2!=0 && x%4!=0){
      println("number is odd and not divisible by 4")

    }
    else{
      println("the number is even")
    }


  }
}