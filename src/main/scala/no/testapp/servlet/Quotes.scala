package no.testapp.servlet

import java.net.{URL, URLConnection}

import scala.io.BufferedSource
import scala.io.Source.fromInputStream

object Quotes {

  val HttpRequest = "http://quotes.stormconsultancy.co.uk/random.json"

  def randomQuote(): String = {
    val connection: URLConnection = new URL(HttpRequest).openConnection()

    connection.setConnectTimeout(2000)
    connection.setReadTimeout(2000)

    val inputStream = connection.getInputStream
    val stream: BufferedSource = fromInputStream(inputStream)
    val result: String = stream.mkString
    stream.close()
    result
  }
}
