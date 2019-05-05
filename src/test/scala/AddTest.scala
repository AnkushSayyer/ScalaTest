import org.scalatest.FunSuite

class AddTest extends FunSuite{

  test("Add.sum"){
    assert(Subtract.sub(5,2) === 3)
    assert(Subtract.sub(5,2) != 2)
  }

  test("Subtract.sub"){
    val add = new Add()
    assert(add.sum(2,3) == 5)
  }


}
