package example

//import io.scalajs.nodejs.os
import util._
import example.facade._
import example.facade.deno._
import scala.scalajs.js
import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world scalajs on deno")
    println("args:")
    args.foreach(println)

    println(JSON.stringify(Deno, null, 2))

    //https://www.scala-js.org/doc/interoperability/types.html#type-correspondence

    println(s"Deno.version: ${Deno.version.v8}")

    val s = Deno
      .run(
        new _Args(js.Array("jy"))
      )
      .status()
    println(s"s: $s")
    for (ret <- s.toFuture) {
      println(s"""ret is: ${JSON.stringify(ret, null, 2)}""")
    }
  }
}
