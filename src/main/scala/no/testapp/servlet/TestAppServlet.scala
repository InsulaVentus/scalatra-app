package no.testapp.servlet

import org.scalatra.ScalatraServlet

class TestAppServlet extends ScalatraServlet {

  val WelcomeMessage = "Yes this is the controller, how may I help you?"

  get("/") {
    WelcomeMessage
  }

  get("/:name") {
    params.get("name") match {
      case Some(name) => s"Hello $name. $WelcomeMessage"
      case _ => WelcomeMessage
    }
  }
}
