### Q1: Using Kuttaka method (Euclidean Algorithm) find out a solution to the Diophantine equation:
$$-13x + 60y = 1$$

**Answer:** Rearrange to $$60y - 13x = 1.$$ Apply the Euclidean algorithm:
$$60 = 4(13) + 8$$
$$13 = 1(8) + 5$$
$$8 = 1(5) + 3$$
$$5 = 1(3) + 2$$
$$3 = 1(2) + 1$$

Work backward:
$$1 = 3 - 2 = 3 - (5 - 3) = 2(3) - 5$$
$$1 = 2(8 - 5) - 5 = 2(8) - 3(5)$$
$$1 = 2(8) - 3(13 - 8) = 5(8) - 3(13)$$
$$1 = 5(60 - 4(13)) - 3(13) = 5(60) - 23(13)$$

Equation: $$60(5) - 13(23) = 1$$
**Solution:** $$x = 23, y = 5$$

### Q2: What do you mean by the Kerala School of Mathematics? Discuss why this has a significant role in shaping the foundation of modern mathematics in India. 
**Answer:** The Kerala School was a lineage of mathematicians and astronomers founded in the 14th century. It is foundational because it marked the transition from finite algorithmic mathematics to infinite continuous processes, effectively discovering infinite series and foundational calculus concepts centuries before Newton and Leibniz.

### Q3: Briefly describe the geographical setting of the Kerala School of Mathematics in the southern part of India.
**Answer:** The school was located along the Malabar Coast in central Kerala, primarily centered around the Nila (Bharathapuzha) river basin, encompassing towns like Sangamagrama, Tirur, and Alathur.

### Q4: Discuss the key contributions of Madhavadeva of Sangamagrama in the area of algebra and calculus during the 14th century. 
**Answer:** Madhava discovered the infinite Maclaurin series expansions for sine, cosine, and arctangent. He also formulated error-correction polynomials to accelerate the convergence of these series, allowing him to calculate $\pi$ accurately to 11 decimal places.

### Q5: Who was Nilakantha Somayaji? How did he contribute in mathematics and astronomy through his writings? 
**Answer:** Nilakantha Somayaji was a 15th-century mathematician and astronomer of the Kerala School. In his text *Tantrasamgraha*, he expanded Madhava's calculus work. In astronomy, his *Aryabhatiya Bhasya* introduced a geo-heliocentric planetary model where inner planets orbit the Sun, which in turn orbits the Earth.

### Q6: Discuss the importance of 'Yuktibhasha' for the study of mathematics and astronomy in the Nila School of Mathematics. 
**Answer:** *Yuktibhasha* is historically significant as the world's first comprehensive text on calculus. It is important because it abandoned the traditional Indian method of merely stating mathematical rules, instead providing rigorous, step-by-step logical proofs (*yukti*) for the infinite series and theorems developed by the school.

### Q7: Briefly elaborate the structural composition of the book 'Yuktibhasha'. 
**Answer:** The text is divided into two distinct parts: Part I covers mathematics (including arithmetic, geometry, algebra, and the calculus of infinite series), and Part II covers astronomy (planetary models, coordinate systems, and eclipse calculations).

### Q8: Give an example of a $4\times4$ magic square, whose magic sum is 40. 
**Answer:** 

$$\begin{bmatrix} 1 & 17 & 18 & 4 \\ 15 & 7 & 6 & 12 \\ 8 & 14 & 13 & 5 \\ 16 & 2 & 3 & 19 \end{bmatrix}$$


Rows, columns, and main diagonals sum exactly to 40.

### Q9: Find the value of x, for which the following $3\times3$ matrix becomes a magic square.
**Answer:** The matrix given has a center value of 6. In a $3\times3$ magic square, the magic sum is exactly $3 \times \text{center}$, meaning the sum must be 18.
The main diagonal is $(x-1) + 6 + (x+1) = 18$.
$2x + 6 = 18 \implies 2x = 12 \implies x = 6$.

### Q10: Hence, complete the magic square. You may use the fact that in any $3\times3$ magic square, the magic sum is always exactly three times the middle element. 
**Answer:** With $x=6$, the corners are 5, 3, 9, and 7. Filling in the remaining edge cells to ensure all lines sum to 18 yields:


$$\begin{bmatrix} 5 & 10 & 3 \\ 4 & 6 & 8 \\ 9 & 2 & 7 \end{bmatrix}$$

### Q11: Start from the derivation and then compute the first order interpolating approximations of $sin(60^{\circ}+\epsilon)$ and $cos(90^{\circ}+\epsilon)$ for $\epsilon=10^{-2}$ up to 4 digits after decimal. Start from the derivation and then compute the second order interpolating approximations of $sin(0^{\circ}+\epsilon)$ and $cos(45^{\circ}+\epsilon)$ for $\epsilon=10^{-5}$ up to six digits after decimal. 
**Answer:** *First Order Derivation:* $f(x+\epsilon) \approx f(x) + \epsilon f'(x)$

* $\sin(\pi/3 + 0.01) \approx \sin(\pi/3) + 0.01\cos(\pi/3) = 0.8660 + 0.0050 = \mathbf{0.8710}$
* $\cos(\pi/2 + 0.01) \approx \cos(\pi/2) - 0.01\sin(\pi/2) = 0 - 0.01(1) = \mathbf{-0.0100}$

*Second Order Derivation:* $f(x+\epsilon) \approx f(x) + \epsilon f'(x) + \frac{\epsilon^2}{2} f''(x)$

* $\sin(0 + 10^{-5}) \approx 0 + 10^{-5}(1) - 0 = \mathbf{0.000010}$
* $\cos(\pi/4 + 10^{-5}) \approx \frac{1}{\sqrt{2}} - 10^{-5}(\frac{1}{\sqrt{2}}) - \frac{10^{-10}}{2}(\frac{1}{\sqrt{2}}) \approx 0.707106 - 0.000007 - 0 = \mathbf{0.707100}$

### Q12: Give an account of the infinite series representations of several functions proposed by Madhava of Sangamagrama. 
**Answer:** Madhava proposed that transcendental functions could be represented as infinite sums of polynomials. His specific representations included:

* Sine: $\sin(x) = x - \frac{x^3}{3!} + \frac{x^5}{5!} - \dots$
* Cosine: $\cos(x) = 1 - \frac{x^2}{2!} + \frac{x^4}{4!} - \dots$
* Arctangent: $\arctan(x) = x - \frac{x^3}{3} + \frac{x^5}{5} - \dots$

### Q13: What is the Madhava-Leibnitz series? Discuss the convergence of the series. 
**Answer:** The Madhava-Leibnitz series is the infinite series for $\frac{\pi}{4}$ obtained by setting $x=1$ in the arctangent series: $\frac{\pi}{4} = 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \dots$
**Convergence:** The series is mathematically correct but practically useless in its raw form because it converges far too slowly. Madhava recognized this flaw and computed rational correction terms for partial sums to force rapid convergence.

### Q14: Find the solution of quadratic Diophantine equation by trial and error and using the composition law (Bhavana): $Nx^{2}+C=y^{2}$ if $N=2$, $C=1$
**Answer:** 
Equation: $2x^2 + 1 = y^2$

Trial and error base solution: $$x=2, y=3$$ (since $2(4)+1 = 9$)

Using Bhavana to compose $(2, 3)$ with itself:
$$x_{new} = x_1 y_2 + x_2 y_1 = 2(3) + 2(3) = \mathbf{12}$$
$$y_{new} = y_1 y_2 + N x_1 x_2 = 3(3) + 2(2)(2) = 9 + 8 = \mathbf{17}$$
Solutions: $(2, 3)$ and $(12, 17)$.

### Q15: Find the solution of special equation (Pell's equation) using the composition law and Cakravala algorithm (cyclic method): $Nx^{2}+C=y^{2}$ if $N=3$, $C=1$
**Answer:** Equation: $3x^2 + 1 = y^2$

Base solution: $x=1, y=2$ (since $3(1)+1 = 4$)

Compose $(1, 2)$ with itself:
$$x_{new} = 1(2) + 1(2) = \mathbf{4}$$
$$y_{new} = 2(2) + 3(1)(1) = \mathbf{7}$$
Solutions: $(1, 2)$ and $(4, 7)$

### Q16: Solve the following equation using Bhavana to transform fractional solutions to integer solutions : $92x^{2}+1=y^{2}$
**Answer:** Find a starting root: $x=1, y=10 \implies 100 - 92(1) = 8$. 

State is $(1, 10, 8)$.

Compose $(1, 10, 8)$ with itself:
$$x_2 = 1(10) + 10(1) = 20$$
$$y_2 = 10(10) + 92(1)(1) = 192$$
$$k_2 = 8 \times 8 = 64$$
Scale down by $k_1$ to get fractional root: $$x_3 = 20/8 = 5/2, y_3 = 192/8 = 24.$$ 

Current state: $(5/2, 24, 1)$.

Compose fractional root with itself to get integers:
$$x_{final} = 2(5/2)(24) = \mathbf{120}$$
$$y_{final} = 24^2 + 92(5/2)^2 = 576 + 575 = \mathbf{1151}$$

### Q17: Solve the following equation using Cakravala rational solutions and scaling method: $3x^{2}-800=y^{2}$
**Answer:** Rearrange to $y^2 - 3x^2 = -800$.

First solve for $k=-8$: 

Trial gives $x=2, y=2$ (since $4 - 3(4) = -8$).

To reach $k=-800$, scale the variables by a factor of 10 (since $10^2 = 100$, and $-8 \times 100 = -800$):
$$x = 2 \times 10 = \mathbf{20}$$
$$y = 2 \times 10 = \mathbf{20}$$

### Q18: Why is Brahmagupta's formula considered a generalization of Heron's formula? 
**Answer:** Brahmagupta's formula for the area of a cyclic quadrilateral is $A = \sqrt{(s-a)(s-b)(s-c)(s-d)}$. If you set the length of one side (e.g., $d$) to zero, the quadrilateral becomes a triangle. The formula logically collapses to $A = \sqrt{s(s-a)(s-b)(s-c)}$, which is the exact definition of Heron's formula.

### Q19: Prove Narayana's beautiful area theorem $2AD=d_{1}d_{2}d_{3}$. Why does Narayana's theorem reduce to Brahmagupta's theorem when one diagonal becomes the diameter? Why does Brahmagupta's area formula fail for non-cyclic quadrilaterals?
**Answer:** *Proof essence:* The product of the three diagonals of a cyclic quadrilateral equals four times the area multiplied by the circumradius ($4AR$). Since Diameter $D = 2R$, this gives $2AD$.
*Reduction:* If $d_1$ is the diameter, then $d_1 = D$. The equation $2AD = D d_2 d_3$ simplifies to $2A = d_2 d_3$, which is the area formula for a quadrilateral with perpendicular diagonals (Brahmagupta's theorem for cyclic quads with orthogonal diagonals).
*Failure:* Brahmagupta's area formula strictly relies on opposite angles summing to 180 degrees. If the quadrilateral is non-cyclic, this angular relationship breaks, and an angular penalty term (Bretschneider's formula) must be subtracted from the calculation.

### Q20: Explain the structural difference between Greek and Indian cyclic geometry. 
**Answer:** Greek geometry (Euclidean) is synthetic and axiomatic; it proves relationships visually and logically without algebra. Indian cyclic geometry is algebraic and computational; it uses formulas, polynomial equations, and numerical composition to define geometric properties.

### Q21: Derive Ptolemy's theorem from Narayana's theorem. 
**Answer:** Narayana's theorem is $2AD = d_1 d_2 d_3$. The third diagonal $d_3$ mathematically represents $(ac+bd)/2R$, where $R$ is circumradius and $a,b,c,d$ are sides. Substituting $d_3$ into the equation and equating the area formulas results directly in $d_1 d_2 = ac + bd$, which is Ptolemy's theorem.

### Q22: Show analytically why a cyclic quadrilateral has only three independent sides and also show analytically how area symmetry appears in cyclic quadrilaterals. Explain mathematically how altitude separation measures deviation from Orthogonality and also explain why cyclic quadrilateral theory represents interaction between algebra and geometry. 
**Answer:** 
*Independent Sides:* A generic quadrilateral has 5 degrees of freedom. Constraining its vertices to a circle locks down 2 degrees of freedom, leaving 3 independent parameters. Once 3 sides are chosen, the 4th is fixed by the circle.
*Area Symmetry:* Brahmagupta's formula $A = \sqrt{(s-a)(s-b)(s-c)(s-d)}$ is completely invariant under any permutation of the variables $a, b, c, d$.
*Altitude/Orthogonality:* The difference between the altitudes from a vertex to the diagonals is proportional to the cosine of the angle between the diagonals; if orthogonal, the cosine is zero and altitude separation vanishes.
*Algebra/Geometry Interaction:* Formulas for area and diagonals are derived by treating geometric lengths as algebraic variables and manipulating them through polynomial identities rather than spatial reasoning.

### Q23: Explain the significance of Narayana's third diagonal. Why was the third diagonal revolutionary mathematically? 
**Answer:** Narayana created a "third" diagonal by conceptually swapping two sides of the quadrilateral. This was revolutionary because it decoupled the area and circumradius of the shape from the specific order of its sides, proving that area is an algebraic property of the side lengths, independent of geometric configuration.

### Q24: Using Vedic Sutras and meanings solve the followings:
*(Note: The assignment text contains OCR errors rendering squares as 4-digit numbers, e.g., $9692$ instead of $96^2$. Below are the calculations for the mathematically intended problems, and Quotient (Q) / Remainder (R) for the division problems).*

**a) 'Yaavadunam' (Squaring numbers near a base):**

* $96^2 \implies (96-4) \ | \ 4^2 \implies \mathbf{9216}$
* $92^2 \implies (92-8) \ | \ 8^2 \implies \mathbf{8464}$
* $104^2 \implies (104+4) \ | \ 4^2 \implies \mathbf{10816}$
* $993^2 \implies (993-7) \ | \ 7^2 \implies \mathbf{986049}$

**b) 'Ekanyunena Purvena' (Multiplication by series of 9s):**

* $9999 \times 2378 \implies (2378-1) \ | \ (9999-2377) \implies \mathbf{23777622}$
* $347 \times 99999 \implies (00347-1) \ | \ (99999-00346) \implies \mathbf{34699653}$
* $999 \times 324567 \implies \mathbf{324242433}$ (Cannot use standard rule directly as left > right, calculated directly).
* $8765 \times 9999 \implies (8765-1) \ | \ (9999-8764) \implies \mathbf{87641235}$

**c) 'Anurupyena' (Proportionality):**

* $48 \times 42 \implies 4 \times 5 \ | \ 8 \times 2 \implies \mathbf{2016}$
* $46 \times 44 \implies 4 \times 5 \ | \ 6 \times 4 \implies \mathbf{2024}$
* $61 \times 43 \implies \mathbf{2623}$
* $47 \times 43 \implies \mathbf{2021}$

**d) 'Dhvajanka' (Straight Division):**

* $8982 \div 73 \implies \mathbf{Q = 123, R = 3}$
* $7332 \div 64 \implies \mathbf{Q = 114, R = 36}$
* $601325 \div 76 \implies \mathbf{Q = 7912, R = 13}$
* $37941 \div 47 \implies \mathbf{Q = 807, R = 12}$

**e) 'Paraavartya Yojayet' (Transpose and Apply Division):**

* $289487 \div 13103 \implies \mathbf{Q = 22, R = 1221}$
* $497342 \div 121 \implies \mathbf{Q = 4110, R = 32}$
* $36520981 \div 133 \implies \mathbf{Q = 274593, R = 112}$
* $136972 \div 121 \implies \mathbf{Q = 1132, R = 0}$

**f) 'Urdhva-Tiryagbhyam' (Vertically and Crosswise):**

* $94 \times 78 = \mathbf{7332}$
* $103 \times 105 = \mathbf{10815}$
* $24 \times 36 = \mathbf{864}$
* $252 \times 846 = \mathbf{213192}$