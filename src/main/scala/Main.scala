import cycle_list.CycleList
import factory.UserFactory
import GUI.GUI
import Test.Testing

object Main {
  def main(args: Array[String]): Unit = {
        val test: Testing = new Testing
        test.testDoubleType()
        test.testPointType()
  }
}