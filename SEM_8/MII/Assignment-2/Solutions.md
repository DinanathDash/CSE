### **1. Who was Aryabhata and his contributions?**
**Answer:**  Aryabhata was a pioneering 5th-century Indian mathematician and astronomer. His critical contributions to mathematics include the earliest use of algebra, the approximation of $\pi$ to four decimal places, the creation of the first sine tables, and the development of the *Kuttaka* algorithm to solve Diophantine equations. 

### **2. Structure of the Aryabhatiya**
**Answer:**  The *Aryabhatiya* is divided into four main chapters (padas):
1.  **Gitikapada:** Covers cosmology, planetary parameters, and basic astronomical units.
2.  **Ganitapada:** Focuses heavily on mathematics, including arithmetic, progressions, and early trigonometry.
3.  **Kalakriyapada:** Deals with the reckoning of time, planetary motions, and eclipses.
4.  **Golapada:** Covers spherical astronomy and the geometric modeling of the celestial sphere.

### **3. The Siddhantas**
**Answer:**  A "Siddhanta" translates roughly to an established astronomical doctrine or treatise. The *Pañcasiddhāntikā* was written by Varāhamihira. The five specific Siddhantas it summarizes are the Surya, Romaka, Paulisa, Vasishtha, and Paitamaha.

### **4. The Kuttaka Method**
**Answer:**  The *Kuttaka* (meaning "pulverizer") is an iterative algorithm developed by Aryabhata to solve linear Diophantine equations of the form $ax + by = c$. Its primary purpose was astronomical: it was used to find the integer number of planetary cycles required for celestial bodies to align or reach a specific mean longitude.

### **5. Aryabhata’s rule for $\pi$**
**Answer:**  Aryabhata's rule states: "Add 4 to 100, multiply by 8, and then add 62,000. By this rule the circumference of a circle with a diameter of 20,000 can be approached.". 
Mathematically, this is $\frac{8(100 + 4) + 62000}{20000} = \frac{62832}{20000} = 3.1416$.

### **6. Polygon Doubling Formula**
**Answer:**  To compute $\pi$, ancient mathematicians inscribed a regular polygon (like a hexagon) inside a circle. By using the Pythagorean theorem, they calculated the side length of a polygon with double the number of sides (e.g., moving from 6 to 12 to 24 sides). As the number of sides approaches infinity, the perimeter of the polygon approaches the circumference of the circle.

### **7. Recursive Sine Difference Formula**
**Answer:**  Aryabhata calculated his sine tables using a second-order recursive difference equation. He established that the difference between consecutive sine values decreases proportionally to the sine value itself. The modern algebraic equivalent of his rule is:
$\sin(n+1)\theta - \sin(n)\theta = \sin(n)\theta - \sin(n-1)\theta - \frac{\sin(n)\theta}{\text{constant}}$.

### **8. Trigonometry and Sine Tables**
**Answer:**  Aryabhata revolutionized trigonometry by introducing the concept of *ardhajya* (half-chord), which is the direct geometric ancestor of the modern sine function. Before this, Greeks used full chords. He generated the first known sine tables ranging from 0° to 90° at intervals of 3°45'.

### **9: Calculate the cube root of the following non-perfect numbers using Vedic mathematics: 29, 38, 53, 59, 67, 79, 107, 131.**
**Answer:** Using the differential approximation method (approximate to two decimal places):
* 29 $\approx$ 3.07
* 38 $\approx$ 3.36
* 53 $\approx$ 3.76
* 59 $\approx$ 3.89
* 67 $\approx$ 4.06
* 79 $\approx$ 4.30
* 107 $\approx$ 4.75
* 131 $\approx$ 5.08

### **Question 10: Calculate the cube root of the following perfect numbers using Vedic mathematics: 9261, 74088, 6859, 50653, 389017, 42875, -941192, -226981, 438.976, -531.441.**
**Answer:** Using observation and unit digits:
* 9261 = 21
* 74088 = 42
* 6859 = 19
* 50653 = 37
* 389017 = 73
* 42875 = 35
* -941192 = -98
* -226981 = -61
* 438.976 = 7.6
* -531.441 = -8.1

### **Question 11: Find out the square root of the following numbers using Vedic mathematics: 2376.592, 15876, 125316, 3.58021, 0.8931, 372.4318].**
**Answer:** Using the Vilokanam method (with approximation for non-perfect squares):
* 2376.592 $\approx$ 48.75
* 15876 = 126
* 125316 = 354
* 3.58021 $\approx$ 1.89
* 0.8931 $\approx$ 0.94
* 372.4318 $\approx$ 19.30

### **Question 12: Using Kuttaka method (Euclidean Algorithm) find out a solution to the Diophantine equation: $47x+30y=1$.**
**Answer:** $x = -7$, $y = 11$.
*(Derivation: $47 = 1(30) + 17 \rightarrow 30 = 1(17) + 13 \rightarrow 17 = 1(13) + 4 \rightarrow 13 = 3(4) + 1$. Back-substituting yields $1 = 11(30) - 7(47)$).*

### **Question 13: For each of the following linear Diophantine equations, either find the form of a general solution, or show there are no integer solutions.**
**Answer:**
* **a. $21x+14y=147$**: Solutions exist. General form: $x = 7 - 2k$, $y = 3k$.
* **b. $30x+47y=-11$**: Solutions exist. General form: $x = -121 + 47k$, $y = 77 - 30k$.
* **c. $21x+14y=146$**: No integer solutions. The $\gcd(21, 14) = 7$, and 146 is not divisible by 7.
* **d. $30x+47y=2$**: Solutions exist. General form: $x = 22 + 47k$, $y = -14 - 30k$.
* **e. $4x-6y=77$**: No integer solutions. The $\gcd(4, -6) = 2$, and 77 is not divisible by 2.
* **f. $4x-6y=78$**: Solutions exist. General form: $x = 21 + 3k$, $y = 1 + 2k$.

### **Question 14: Ekanyunena Purvena (By one less than the previous one): i. $9999 \times 2378$, ii. $999 \times 324567$.**
**Answer:** * i. 23,777,622
* ii. 324,242,433

### **Question 15: Anurupyena (Proportionately): a. $46\times44$, b. $48\times42$, c. $61\times43$.**
**Answer:** * a. 2,024
* b. 2,016
* c. 2,623

### **Question 16: Compute the square of the following integers: i. 149, ii. 642, iii. 1024, iv. 1777, v. 9614.**
**Answer:** * i. 22,201
* ii. 412,164
* iii. 1,048,576
* iv. 3,157,729
* v. 92,428,996

### **Question 17: Find the positive square roots for each of the followings: ii. 390625, ii. 1234321, iii. 285156, iv. 31329, v. 135424.**
**Answer:** * ii. 625
* ii. 1,111
* iii. 534
* iv. 177
* v. 368

### **Question 18: Write the name of the following numbers mentioned in the Vedic literatures: $10^7$, $10^9$, $10^{11}$, $10^{12}$, $10^{14}$, $10^{16}$, $10^{17}$, and $10^{53}$.**
**Answer:** * $10^7$: Koti
* $10^9$: Vrinda
* $10^{11}$: Kharva
* $10^{12}$: Maha-Kharva
* $10^{14}$: Padma
* $10^{16}$: Antya
* $10^{17}$: Parardha
* $10^{53}$: Tallakshana