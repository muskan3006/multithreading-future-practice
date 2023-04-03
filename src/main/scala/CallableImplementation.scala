import java.util.concurrent.Callable

class CallableImplementation extends Callable[String] {
  override def call(): String = "callable"
}
