package example.facade

import scala.scalajs.js
import scala.scalajs.js.annotation._

package object deno {

  class _Version(
      var deno: String = "",
      var v8: String = "",
      var typescript: String = ""
  ) extends js.Object {
    override def toString(): String = JSON.stringify(this, null, 2)
  }

  class _Process() extends js.Object {
    def status(): js.Promise[js.Any] = null
  }

  class _Args(val cmd: js.Array[String] = js.Array()) extends js.Object

  @js.native
  trait Deno extends js.Object {
    val version: _Version = js.native
    def run(args: _Args): _Process = js.native
  }

  @js.native
  @JSGlobal
  object Deno extends Deno
}
