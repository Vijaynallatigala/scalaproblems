object first {

  def main(args:Array[String]):Unit= {


    println("Enter the number")

    // even and positive number

    var x = scala.io.StdIn.readInt()
    if (x % 2 == 0 && x>0) {
      println("even number and positive")
    }
    else if (x % 2 == 0 && x<0)
      {
        println("even and negative")
      }
    else if (x%2!=0 && x<0)
      {
        println("odd and negative")
      }
    else {
      println("odd number")

    }
  }
}
