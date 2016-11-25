import javax.servlet.ServletContext

import no.testapp.servlet.TestAppServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    context.mount(new TestAppServlet, "/test-app/*")
  }
}
