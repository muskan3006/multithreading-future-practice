class ThreadExtend extends Thread{
  override def run(): Unit = {
    println("Start thread")
    val counter = for {
      counter <- 0 to 10
    } yield counter
    println(counter)
    println("End Thread")
  }
}
