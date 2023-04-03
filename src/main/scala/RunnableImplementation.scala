class RunnableImplementation(number : Int) extends Runnable {
  override def run(): Unit = {
    println(s"Start task number $number")
    val counter = for {
      counter <- number to number + 10
    } yield counter
    println(counter)
    println(s"End task number $number")
  }
}
