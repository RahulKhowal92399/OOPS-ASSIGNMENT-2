class Person(var name:String, var age:Int)extends Ordered[Person]{
  def compare(a:Person): Int ={
    if(this.name.equals(a.name)){
      if(this.age<age)1 else 0
    }
    else if (this.name.length<a.name.length) 1 else 0
  }
}
object Sample {
  def main(args: Array[String]): Unit = {
    var result=new Person("MAX",23)
    var result1=new Person("SAM",25)
    println(result>=result1)
    println(result>result1)
    println(result==result1)
  }
}
