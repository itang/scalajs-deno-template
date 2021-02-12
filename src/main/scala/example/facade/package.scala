package example

import scala.scalajs.js
import scala.scalajs.js.annotation._

package object facade {
  @js.native
  @JSGlobal
  object JSON extends js.Object {
    def parse(text: String): js.Any = js.native

    def stringify(value: js.Any, a: js.Any, indent: js.Any): String = js.native
  }
}
