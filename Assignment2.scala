package FP

object Assignment02_Scala {
  
  def main(args:Array[String])
  {
    //Q1
    var showsalary = showsalaryf()
    println("Take home salary for month : " +showsalary*4)
    
    
    //Q2
    println("Enter ticket price")
    var pro = scala.io.StdIn.readInt()
    println("Profit - Rs.  "+profit(pro)+"/=")
    
  }
  
  def showsalaryf():Double=
  {
    println("Enter number of WORKING HOURS per week : ")
    var workh = scala.io.StdIn.readInt()
    
    println("Enter number of OT HOURS per week : ")
    var oth = scala.io.StdIn.readInt()
    
    var total = (workh*150)+(oth*75)
    
    if((workh>=40)&&(oth>=20))
    {
      total = (total*90)/100
      //return total
    }
    else
    {
      total = total
    }
    
    return total 
  }
  
  def attendees(price:Int):Int=120+(15-price)/5*20
  
  def revenue(price:Int):Int= attendees(price)*price
  
  def cost(price:Int):Int=500+attendees(price)
  
  def profit(price:Int):Int= revenue(price) - cost(price)
  
}