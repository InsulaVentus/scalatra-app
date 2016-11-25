package no.testapp.servlet

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuiteLike, Matchers}
import org.scalatra.test.scalatest.ScalatraSuite

@RunWith(classOf[JUnitRunner])
class TestAppServletTest extends ScalatraSuite with Matchers with FunSuiteLike {
  addServlet(classOf[TestAppServlet], "/*")

  test("servlet should respond with 200 OK") {
    get("/") {
      status should equal(200)
      body should include("this is the controller")
    }
  }

  test("servlet should respond with 200 OK and custom message") {
    get("/neo") {
      status should equal(200)
      body should include("Hello neo")
    }
  }
}
