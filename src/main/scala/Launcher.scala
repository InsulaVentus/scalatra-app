import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

object Launcher {
  def main(args: Array[String]): Unit = {
    val server = new Server(8989)
    val context = new WebAppContext()

    context.setContextPath("/")
    context.setResourceBase("src/main/webapp")
    context.addEventListener(new ScalatraListener)

    server.setHandler(context)
    server.start()
    server.join()
  }
}
