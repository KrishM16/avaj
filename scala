//123 pattern

object Main {
  def main(args: Array[String]): Unit = {
    var n = scala.io.StdIn.readInt()
    val og = n
    var s: String = ""

    while (n > 0) {
      var temp = n % 10
      n = n / 10

      temp match {
        case 1 => s = "One " + s
        case 2 => s = "Two " + s
        case 3 => s = "Three " + s
        case 4 => s = "Four " + s
        case 5 => s = "Five " + s
        case 6 => s = "Six " + s
        case 7 => s = "Seven " + s
        case 8 => s = "Eight " + s
        case 9 => s = "Nine " + s
        case 0 => s = "Zero " + s
        case _ => s = "Non-digit " + s
      }
    }

    print(s)
  }
}

//prime or not prime using do while
object Q19 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    var i = 2
    var flag = 0

    do {
      if (n % i == 0) {
        flag = 1
      }
      i += 1
    } while (i <= n)
  }
}

//string interpolation
object Main {
  def main(args: Array[String]): Unit = {
    var name: String = "Dev Patel"
    var sap: String = "60009200016"

    println(s"My name is $name and my SAP ID is $sap")
  }
}

//salary and grade
object Main {
  def main(args: Array[String]): Unit = {
    var e = new Employee()
    e.getEmployee()
    e.showGrade()
    e.showEmployee()
  }
}

class Employee {
  var empid: Int = 0
  var empname: String = null
  var designation: String = null
  var salary: Int = 0
  var grade: Char = '-'

  def getEmployee(): Unit = {
    print("Enter Emp ID: ")
    this.empid = scala.io.StdIn.readInt()
    print("Enter Emp Name: ")
    this.empname = scala.io.StdIn.readLine()
    print("Enter Designation: ")
    this.designation = scala.io.StdIn.readLine()
    print("Enter Salary: ")
    this.salary = scala.io.StdIn.readInt()
  }

  def showGrade(): Unit = {
    if (this.salary < 10000) {
      this.grade = 'D'
      println("Employee Grade: " + this.grade)
    } else if (this.salary >= 10000 && this.salary < 25000) {
      this.grade = 'C'
      println("Employee Grade: " + this.grade)
    } else if (this.salary >= 25000 && this.salary < 50000) {
      this.grade = 'B'
      println("Employee Grade: " + this.grade)
    } else {
      this.grade = 'A'
      println("Employee Grade: " + this.grade)
    }
  }

  def showEmployee(): Unit = {
    print(s"${this.empid} ${this.empname} ${this.designation} ${this.salary} ${this.grade}")
  }
}

//bikers race
object Main {
  def main(args: Array[String]): Unit = {
    // Declare variables to store speeds of racers
    var r1: Int = 0
    var r2: Int = 0
    var r3: Int = 0
    var r4: Int = 0
    var r5: Int = 0

    // Input speeds of racers
    print("Enter speed of racer 1: ")
    r1 = scala.io.StdIn.readInt()
    print("Enter speed of racer 2: ")
    r2 = scala.io.StdIn.readInt()
    print("Enter speed of racer 3: ")
    r3 = scala.io.StdIn.readInt()
    print("Enter speed of racer 4: ")
    r4 = scala.io.StdIn.readInt()
    print("Enter speed of racer 5: ")
    r5 = scala.io.StdIn.readInt()

    // Calculate average speed
    var avg: Double = (r1 + r2 + r3 + r4 + r5) / 5

    // Output average speed
    println(s"Average Speed: $avg")

    // Check and display qualifying racers
    if (r1 > avg) {
      println(s"Racer 1 qualifies with speed $r1")
    }
    if (r2 > avg) {
      println(s"Racer 2 qualifies with speed $r2")
    }
    if (r3 > avg) {
      println(s"Racer 3 qualifies with speed $r3")
    }
    if (r4 > avg) {
      println(s"Racer 4 qualifies with speed $r4")
    }
    if (r5 > avg) {
      println(s"Racer 5 qualifies with speed $r5")
    }
  }
}
//members
object Main {
  def main(args: Array[String]): Unit = {
    var e = new Employee()
    e.getMember()
    e.printSalary()
    e.showMember()

    var m = new Manager()
    m.getMember()
    m.printSalary()
    m.showMember()
  }
}

class Member {
  var name: String = null
  var age: Int = 0
  var phoneno: String = null
  var address: String = null
  var salary: Int = 0

  def getMember(): Unit = {
    print("Name: ")
    this.name = scala.io.StdIn.readLine()
    print("Age: ")
    this.age = scala.io.StdIn.readInt()
    print("Phone no: ")
    this.phoneno = scala.io.StdIn.readLine()
    print("Address: ")
    this.address = scala.io.StdIn.readLine()
    print("Salary: ")
    this.salary = scala.io.StdIn.readInt()
  }

  def showMember(): Unit = {
    println("Name: " + this.name)
    println("Age: " + this.age)
    println("Phone no: " + this.phoneno)
    println("Address: " + this.address)
    println("Salary: " + this.salary)
  }

  def printSalary(): Unit = {
    println(this.salary)
  }
}

class Employee extends Member {
  var specialization: String = null

  override def getMember(): Unit = {
    super.getMember
    print("Specialization: ")
    this.specialization = scala.io.StdIn.readLine()
  }

  override def showMember(): Unit = {
    super.showMember
    print("Specialization: " + this.specialization)
  }
}

class Manager extends Member {
  var department: String = null

  override def getMember(): Unit = {
    super.getMember
    print("Department: ")
    this.department = scala.io.StdIn.readLine()
  }

  override def showMember(): Unit = {
    super.showMember
    print("Department: " + this.department)
  }
}

object MainHierarchy {
  def main(args: Array[String]): Unit = {
    var h = new HourlyEmployee()
    h.accessor()
    h.calculateWeeklyPay()
    h.mutator()
    h.calculateWeeklyPay()

    var w = new WeeklyEmployee()
    w.accessor()
    w.calculateWeeklyPay()
    w.mutator()
    w.calculateWeeklyPay()
  }
}

abstract class EmployeeHierarchy {
  var name: String = null
  var jobtitle: String = null

  def accessor()

  def mutator()

  def calculateWeeklyPay()
}

class HourlyEmployee extends EmployeeHierarchy {
  var payrate: Int = 0
  var hoursworked: Int = 0

  def accessor(): Unit = {
    println("Enter payrate: ")
    payrate = scala.io.StdIn.readInt()
    println("Enter Hours worked this week: ")
    hoursworked = scala.io.StdIn.readInt()
  }

  def mutator(): Unit = {
    println("Enter changed payrate: ")
    payrate = scala.io.StdIn.readInt()
    println("Enter the changed hours worked this week: ")
    hoursworked = scala.io.StdIn.readInt()
  }

  def calculateWeeklyPay(): Unit = {
    println("Weekly pay is: " + (this.payrate * this.hoursworked))
  }
}

class WeeklyEmployee extends EmployeeHierarchy {
  var weeklysalary: Int = 0

  def accessor(): Unit = {
    println("Enter Weekly Salary: ")
    weeklysalary = scala.io.StdIn.readInt()
  }

  def mutator(): Unit = {
    println("Enter changed Weekly Salary: ")
    weeklysalary = scala.io.StdIn.readInt()
  }

  def calculateWeeklyPay(): Unit = {
    println("Weekly pay is: " + this.weeklysalary)
  }
}

//fibonacci
object Main {
  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    var n: Int = scala.io.StdIn.readInt()
    var t1: Int = 0
    var t2: Int = 1
    var fib: Int = fibonacci(t1, t2, n - 2)
    println(fib)
  }

  def fibonacci(t1: Int, t2: Int, n: Int): Int = {
    if (n == 0) {
      return t2
    }
    fibonacci(t2, t1 + t2, n - 1)
  }
}

//find the values of following series
object Main {
  def main(args: Array[String]): Unit = {
    // var a:Int=scala.io.StdIn.readInt();
    // var n:Int=scala.io.StdIn.readInt();
    func(2, 3, func2)
  }

  def func(a: Int, n: Int, f: (Int, Int) => Unit): Unit = {
    f(a, n)
  }

  def func2(a: Int, n: Int): Unit = {
    var sum: Double = 0.0
    var prod: Double = 1
    var fac: Int = 1
    var i: Int = 1

    for (i <- 1 to n) {
      prod = prod * a
      fac = fac * i
      sum = sum + prod / fac
      println(sum)
    }
    print(sum)
  }
}

//Write a Scala program to compute the sum of the two given integer values. If the two
values are the same, then return triples their sum

object Main {
  def main(args: Array[String]): Unit = {
    var result = (a: Int, b: Int) => if (a == b) (a + b) * 3 else (a + b)
    print(result(3, 3))
  }

//Write a Scala program to check whether a given positive number is a multiple of 3 or
a multiple of 7

object Main {
  def main(args: Array[String]): Unit = {
    var result = (a: Int, b: Int) => if (a % 3 == 0) {
      println(a + " is a multiple of 3")
    } else if (a % 7 == 0) {
      println(a + " is a multiple of 7")
    }
    if (a % 3 == 0) {
      println(a + " is a multiple of 3")
    }
    if (a % 7 == 0) {
      println(a + " is a multiple of 7")
    }
    } else {
      (a + b) * 3
    }
    print(result(3, 3))
  }
}

//bank
object Main {
  def main(args: Array[String]): Unit = {
    var a = new BankA(500)
    a.getBalance()
  }
}

abstract class Bank {
  var balance: Int = 0

  def getBalance()
}

class BankA(b: Int) extends Bank {
  this.balance = b

  def getBalance(): Unit = {
    println("Balance = " + this.balance)
  }
}
//rectangle
object Main {
  def main(args: Array[String]): Unit = {
    var a = new Area()
    a.rectangleArea(5, 10)
    a.squareArea(10)
    a.circleArea(10)
  }
}

abstract class Shape {
  def rectangleArea(a: Int, b: Int)
  def squareArea(s: Int)
  def circleArea(r: Int)
}

class Area extends Shape {
  def rectangleArea(a: Int, b: Int): Unit = {
    println(a * b)
  }

  def squareArea(s: Int): Unit = {
    println(s * s)
  }

  def circleArea(r: Int): Unit = {
    println(3.14 * r * r)
  }
}
//marks of 3 subjects
object Main {
  def main(args: Array[String]): Unit = {
    var a = new A(93, 90, 98)
    println(a.getPercentage())

    var b = new B(90, 92, 94, 97)
    println(b.getPercentage())
  }
}

abstract class Marks {
  def getPercentage(): Double
}

class A(s1: Int, s2: Int, s3: Int) extends Marks {
  def getPercentage(): Double = {
    return (s1 + s2 + s3) * 100.0 / 300
  }
}

class B(s1: Int, s2: Int, s3: Int, s4: Int) extends Marks {
  def getPercentage(): Double = {
    return (s1 + s2 + s3 + s4) * 100.0 / 400
  }
}


}


