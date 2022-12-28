import scala.beans.BeanProperty

/**
 * @Classname Person
 * @Description
 * @Date 2022/12/24 17:58
 * @Author by tangyao
 */
class Person:
  // 自己生成getter setter
  @BeanProperty var age = 0
  // 只生成 getter方法
  @BeanProperty val name = "tangyao"
  // 自己写setter getter 方法
  private var sex = 'm'

  //  def getSex() = sex

  def setSex(char: Char) =
    sex = char


//@main def m = {
//  val person = new Person
//  val name: String = person.name
//  println(name)
//  //  val sex: Char = person.sex
//  //  val c: Char = person.getSex()
//  //  println(c)
//  //
//  person.setSex('a')
//  //  val age: Int = person.getAge()
//  //  println(age)
//
//}

object Person:
  def main(args: Array[String]): Unit = {

//    val person = new Person
//    val name: String = person.name
//    println(name)
//    val sex: Char = person.sex
//    println(sex)
//    person.setAge(10)
//    println(person.getAge())
    //    val name1: String = person.getName
    //    println(name1)


  }
