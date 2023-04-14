import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FutureExample extends App {

  def divide(numerator: Int, denominator: Int) = {
    if (denominator == 0)
      Future.successful(0)
    else
      Future(numerator/denominator)

  }

  val future2 = Future(throw new Exception())
  //  println(future)

  //  println(Future.successful(1))
  //  println(Future.failed(new Exception()))
  //  future.onComplete {
  //    case Failure(exception) => Future.successful(0)
  //    case Success(_) => println("value * value")
  //  }
  //  future2.onComplete {
  //    case Failure(exception) => println("2" + exception)
  //    case Success(_) => println("value * value")
  //  }

  //  future.foreach(println(_))
  //  future2.foreach(println(_))

//divide(1, 1).flatMap( _ => divide(2,3))

  val futureToFail = Future.failed(new Exception())

  futureToFail. {
    case _ : ArithmeticException => -1
    case _ : StackOverflowError => -1
    case _ =>

  }
}
