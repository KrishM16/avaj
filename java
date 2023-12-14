//shop will give 10% discount
import java.util.*;

class Q1 {
    public static void main(String args[]) {
        int units;
        double ppu, total_cost;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of units: ");
        units = s.nextInt();

        System.out.println("Enter price of each unit: ");
        ppu = s.nextDouble();

        total_cost = units * ppu;

        if (total_cost > 1000) {
            total_cost = total_cost * 0.9;
        }

        System.out.println("Total final cost: " + total_cost);
    }
}

//minimum sum and max sum
import java.util.*;

class Q2 {
    public static void main(String args[]) {
        int i, j, min = 0, max = 0, n, temp;
        int a[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < n - 1; i++) {
            min = min + a[i];
        }

        for (i = 1; i < n; i++) {
            max = max + a[i];
        }

        System.out.println("Minimum sum: " + min);
        System.out.println("Maximum sum: " + max);

        sc.close();
    }
}
//gross and net salary
import java.util.*;

class Q3 {
    public static void main(String[] args) {
        double da, hra, cca, pt, pf, gross, net, basic;
        Scanner sc = new Scanner(System.in);
        String empname = new String();
        String empno = new String();

        System.out.print("Enter Employee Name: ");
        empname = sc.nextLine();

        System.out.print("Enter Employee Number: ");
        empno = sc.next();

        System.out.print("Enter Basic: ");
        basic = sc.nextDouble();

        da = 0.7 * basic;
        hra = 0.3 * basic;
        cca = 240;
        pf = 0.1 * basic;
        pt = 100;
        gross = basic + da + hra;
        net = gross - pt - cca - pf;

        System.out.println("Gross salary = " + gross + "\nNet salary= " + net);

        sc.close();
    }
}
//menu driven on dimensional array
import java.util.*;

class Q4 {
    public static void main(String[] args) {
        int i, j, n, temp, choice;
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("MENU\n1. Search element\n2. Sort descending\n3. Delete Duplicate\nEnter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                int flag = 0, ele;
                System.out.println("Enter element to be searched: ");
                ele = sc.nextInt();

                for (i = 0; i < n; i++) {
                    if (a[i] == ele) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 1) {
                    System.out.println(ele + " has been found!");
                } else {
                    System.out.println(ele + " not found!");
                }
                break;

            case 2:
                for (i = 0; i < n - 1; i++) {
                    for (j = 0; j < n - 1; j++) {
                        if (a[j] < a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                for (i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                break;

            case 3:
                int tem[] = new int[n];
                int count = 0;

                for (i = 0; i < n - 1; i++) {
                    for (j = 0; j < n - 1; j++) {
                        if (a[j] > a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                for (i = 0; i < n - 1; i++) {
                    if (a[i] != a[i + 1]) {
                        tem[count++] = a[i];
                    }
                }

                tem[count++] = a[n - 1];

                for (i = 0; i < count; i++) {
                    System.out.print(tem[i] + " ");
                }
                break;

            default:
                System.out.println("Enter a number between 1-3.");
        }

        sc.close();
    }
}
//election
import java.util.*;

class Q5 {
    public static void main(String[] args) {
        int i, n, j;
        int a[] = new int[50];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + " Vote: ");
            a[i] = sc.nextInt();
        }

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, sv = 0;

        for (i = 0; i < n; i++) {
            if (a[i] == 1) {
                c1 += 1;
            } else if (a[i] == 2) {
                c2 += 1;
            } else if (a[i] == 3) {
                c3 += 1;
            } else if (a[i] == 4) {
                c4 += 1;
            } else if (a[i] == 5) {
                c5 += 1;
            } else {
                sv += 1;
            }
        }

        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + " " + sv);

        sc.close();
    }
}
//find missing positive number
import java.util.*;

class Q6 {
    public static void main(String[] args) {
        int i, n, j, temp;
        int a[] = new int[50];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + " Value: ");
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int minm = a[0];

        for (i = 0; i < n; i++) {
            if (a[i] != minm) {
                System.out.println("Missing value is: " + minm);
                break;
            }
            minm++;
        }

        sc.close();
    }
}
//caesar cipher
class Q7 {
    public static void main(String[] args) {
        int i, j, asc;
        char temp;
        String s = new String("WXYZ");
        String c = new String("");

        for (i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            asc = (int) (temp);
            asc = 65 + (asc - 65 + 3) % 26;
            temp = (char) (asc);
            c += temp;
        }

        System.out.println(c);
    }
}
//car brand
class Car {
    String brand = new String();

    Car() {
        this("Ford");
    }

    Car(String br) {
        this.brand = br;
    }

    void getBrand() {
        System.out.println("The car brand is " + this.brand);
    }
}

class Q8 {
    public static void main(String[] args) {
        Car c = new Car();
        c.getBrand();
        Car d = new Car("BMW");
        d.getBrand();
    }
}
//calculator
package letmecalculate;

public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }
}
import letmecalculate.Calculator;

class Q9 {
    public static void main(String[] args) {
        double a = 9.2, b = 8.8;
        Calculator c = new Calculator();

        System.out.println(c.add(a, b));
        System.out.println(c.sub(a, b));
        System.out.println(c.mul(a, b));
        System.out.println(c.div(a, b));
    }
}
//vampire or not
import java.util.*;

class Q10 {
    public static void main(String[] args) {
        int n, i = 0, j, temp, k, l;
        int a[] = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        n = sc.nextInt();
        int og = n;

        while (n > 0) {
            temp = n % 10;
            a[i++] = temp;
            n = n / 10;
        }

        int num1, num2;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i != j) {
                    num1 = 10 * a[i] + a[j];
                    for (k = 0; k < 4; k++) {
                        if (k != i && k != j) {
                            for (l = 0; l < 4; l++) {
                                if (l != i && l != j && l != k) {
                                    num2 = 10 * a[k] + a[l];
                                    if (num1 * num2 == og) {
                                        System.out.println(og + " is a Vampire number with solution " + num1 + " , " + num2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
//count no. of alphabets, digits, special symbol, vovels etc
class Q11 {
    public static void main(String[] args) {
        String s = new String("Dev scored 10.00 in semester 4!");
        int i, al = 0, no = 0, sc = 0, sp = 0, vow = 0, con = 0;
        char c;

        for (i = 0; i < s.length(); i++) {
            s = s.toLowerCase();
            c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                no += 1;
            } else if (c >= 'a' && c <= 'z') {
                al += 1;

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vow += 1;
                } else {
                    con += 1;
                }
            } else if (c == ' ') {
                sp += 1;
            } else {
                sc += 1;
            }
        }

        System.out.println("Alphabet " + al + "\nVowels " + vow + "\nConsonants " + con +
                "\nDigits " + no + "\nSpaces " + sp + "\nWords " + (sp + 1) + "\nSpecial Characters " + sc);
    }
}
//shopping list
import java.util.*;

class Q12 {
    public static void main(String[] args) {
        Vector<String> sl = new Vector<>(3, 2);
        Scanner sc = new Scanner(System.in);
        String ele;

        while (true) {
            System.out.print("\nMENU\n1. Add element to pos\n2. Delete an item\n3. Print list\n4. Exit\nEnter your choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("\nEnter position: ");
                    int pos = sc.nextInt();
                    System.out.print("\nEnter element: ");
                    ele = sc.next();

                    if (pos <= sl.size()) {
                        sl.insertElementAt(ele, pos - 1);
                    } else {
                        sl.addElement(ele);
                    }
                    break;
                case 2:
                    System.out.print("\nEnter element: ");
                    ele = sc.next();
                    sl.removeElement(ele);
                    break;
                case 3:
                    System.out.println("\nCurrent list: ");
                    System.out.println(sl);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
//diagram, student, test, result, sports
class Q13 {
    public static void main(String[] args) {
        Result r = new Result(16, 0, 95, 90);
        r.score();
    }
}

class Student {
    int rollno;
}

class Test extends Student {
    int sem1_marks, sem2_marks;
}

interface Sports {
    void score();
}

class Result extends Test implements Sports {
    int total, sports_score;

    Result(int rn, int sc, int s1, int s2) {
        this.rollno = rn;
        this.sports_score = sc;
        this.sem1_marks = s1;
        this.sem2_marks = s2;
        this.total = sc + s1 + s2;
    }

    public void score() {
        System.out.println("Roll No: " + rollno + "\nSem1 Marks: " + sem1_marks + "\nSem2 Marks: " + sem2_marks
                + "\nSports Score: " + sports_score);
        System.out.println("Total score: " + total);
    }
}
//account class
class Q14 {
    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount("A", "x", 5000, 2000);
        SavingsAccount acc2 = new SavingsAccount("B", "y", 8000);
        acc1.withdraw();
        acc1.getBalance();
        acc2.addInterest();
        acc2.getBalance();
    }
}

class Account {
    String name, accno;
    double balance;

    Account(String n, String acc, double bal) {
        this.name = n;
        this.accno = acc;
        this.balance = bal;
    }

    void getBalance() {
        System.out.println(balance);
    }
}

class SavingsAccount extends Account {
    double interest = 0.065;

    SavingsAccount(String n, String acc, double bal) {
        super(n, acc, bal);
    }

    void addInterest() {
        balance = balance + balance * interest;
    }
}

class CurrentAccount extends Account {
    int odlimit = 6000, wd;

    CurrentAccount(String n, String acc, double bal, int w) {
        super(n, acc, bal);
        this.wd = w;
    }

    void withdraw() {
        if (wd > odlimit || wd > balance) {
            System.out.println("Aukaat ke bahar hai");
        } else {
            balance = balance - wd;
        }
    }
}
//calculate result
class Q15 {
    public static void main(String[] args) {
        // int mrk[] = new int[]{94, 67, -3, 109, 5};
        Result r = new Result("Dev Patel", 16, "12/12/2022", 4, 109, 5);
        r.giveResult();
    }
}

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String s) {
        System.out.println(s);
    }
}

class Result {
    int seatno, cno, n, marks;
    String date = new String();
    String name = new String();

    Result(String nm, int s, String d, int center, int m, int no) {
        this.name = nm;
        this.date = d;
        this.seatno = s;
        this.cno = center;
        this.marks = m;
        this.n = no;
    }

    void giveResult() {
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Seat No: " + seatno);
        System.out.println("Center No: " + cno);
        try {
            if (marks > 100 || marks < 0) {
                throw new MarksOutOfBoundsException("Exception: Marks out of range");
            } else {
                System.out.println("Marks for subject: " + marks);
            }
        } catch (MarksOutOfBoundsException e) {
            System.out.print(e);
        }
    }
}
//command line and find valid and invalid integer
import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of characters: ");
        String x = sc.nextLine();
        int validCount = 0;
        int invalidCount = 0;

        for (int i = 0; i < x.length(); i++) {
            try {
                int num = Integer.parseInt(Character.toString(x.charAt(i)));
                validCount += 1;
            } catch (NumberFormatException e) {
                invalidCount += 1;
            }
        }

        System.out.println("Valid integers: " + validCount);
        System.out.println("Invalid integers: " + invalidCount);
        sc.close();
    }
}
//thread Synchronization (TicketBooking Example)
class Q17 {
    public static void main(String[] args) {
        Booking d = new Booking(1);
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.setName("Dev");
        t2.setName("Alistair");
        t2.start();
        t1.start();
    }
}

class Booking extends Thread {
    int vacant = 1, reqd;

    Booking(int r) {
        this.reqd = r;
    }

    public synchronized void run() {
        if (reqd <= vacant) {
            System.out.println(reqd + " ticket(s) booked for " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            vacant = vacant - reqd;
        } else {
            System.out.println("No tickets left. Sorry, " + Thread.currentThread().getName());
        }
    }
}




