import java.util.concurrent.{Executors, ThreadPoolExecutor}

object Main extends App {
  //thread
//  val threadExtend = new ThreadExtend
//  threadExtend.start()
  //runnable
  val runnableImplementation1 = new RunnableImplementation(1)
  val runnableImplementation2 = new RunnableImplementation(2)
  val runnableImplementation3 = new RunnableImplementation(3)
  val runnableImplementation4 = new RunnableImplementation(4)
//  new Thread(runnableImplementation).start()
//  Executors.newSingleThreadExecutor().execute(runnableImplementation)
  val fixedPoolExecutor = Executors.newFixedThreadPool(1)
  fixedPoolExecutor.execute(runnableImplementation1)
  fixedPoolExecutor.execute(runnableImplementation2)
  fixedPoolExecutor.execute(runnableImplementation3)
  fixedPoolExecutor.execute(runnableImplementation4)

  val callableImplementation = new CallableImplementation
  fixedPoolExecutor.submit(callableImplementation)
}