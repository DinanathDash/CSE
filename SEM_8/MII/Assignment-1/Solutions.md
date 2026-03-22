## Part 1: Historical and Conceptual Mathematics

### **1. Explain the role of the Indus Valley Civilisation in early mathematics.**
**Answer:**  The Indus Valley Civilization (IVC) established the foundation for practical mathematics in the Indian subcontinent. Their role was primarily in standardization and metrology. They developed highly accurate systems of weights and measures, utilized a combination of binary and decimal ratios, and applied practical geometry on a massive scale for urban planning, advanced drainage systems, and standardized brick manufacturing. 

### **2. Major differences between mathematics in the Indus Valley Civilization and the Vedic Period?**
**Answer:** 
* **Indus Valley:** Mathematics was highly practical, commercial, and administrative. It focused on standardized weights, measuring scales, and construction geometry. There are no surviving written mathematical treatises.
* **Vedic Period:** Mathematics was driven by religious and ritualistic requirements. It focused heavily on astronomy (to determine timing for rituals) and precise geometry for constructing complex fire altars (Agnicayana). This period produced the first formal written mathematical texts in India, the *Sulbasutras*.

### **3. What is the contribution of Pāṇini to Indian intellectual thought?**
**Answer:** Pāṇini wrote the *Ashtadhyayi*, a treatise on Sanskrit grammar. His contribution goes far beyond linguistics; he created a highly rigorous, rule-based, logical framework that functions exactly like a modern algorithmic system. His use of meta-rules, transformations, and recursive structures is widely considered the precursor to formal language theory and computer science.

### **4. What does "Sulba" mean? Mention the name of four Sulbakars and their contributions.**
**Answer:** "Sulba" means string or cord, referring to the primary tool used for geometric measurements. 
Four major Sulbakars:
1.  **Baudhayana:** Formulated the earliest recorded statement of the Pythagorean theorem and calculated an accurate approximation of $\sqrt{2}$.
2.  **Apastamba:** Expanded on Baudhayana's work, providing more precise geometric proofs and altar construction rules.
3.  **Manava:** Contributed to the problem of squaring the circle and circular altars.
4.  **Katyayana:** Wrote the latest of the major Sulbasutras, summarizing and adding general geometric rules.

### **5. Explain the role of the Sulba Sutras in early Indian mathematics / Geometrically proof $(a-b)^{2}+2ab=(a)^{2}+(b)^{2}$**
**Answer:** 
* **Role:** The Sulbasutras are the oldest known mathematical texts from India. They served as manuals for constructing geometrically precise fire altars, making them the foundational texts for early Indian geometry and algebra.
* **Proof:** The assignment asks for a geometric proof. Algebraically, expanding the left side gives $a^{2} - 2ab + b^{2} + 2ab$, which simplifies to $a^{2} + b^{2}$. Geometrically, if you have a large square of side $a$, and you subtract a rectangle of $a \times b$ twice (which removes the corner square $b^{2}$ twice), you are left with $(a-b)^{2}$. Adding the two rectangles $2ab$ back effectively reorganizes the area to equal a square of side $a$ and a square of side $b$.

### **6. How a circle can be constructed from a square according to Baudhayana?**
**Answer:** Baudhayana’s method for "circling the square" is an approximation. Draw a square. Draw a line from the center to a corner (half the diagonal). Keeping the center fixed, rotate this line to the side of the square. It will extend outside the square. Divide the part of the line that lies outside the square into three equal parts. Add one of those thirds to the distance from the center to the edge of the square. Use this new length as the radius of your circle.

### **7. How a square can be constructed from a rectangle?**
**Answer:** Cut off a square from the rectangle using its shorter side. You are left with a smaller rectangle. Divide this smaller rectangle in half, and place one half on the adjacent side of the square to form a gnomon. Complete the larger square by adding a small square to the empty corner. To find the exact equivalent area, you apply the Pythagorean theorem: the area of the desired square is the difference between the large constructed square and the small corner square ($c^{2} - b^{2} = a^{2}$).

### **8. What sources are used to reconstruct Indus Valley mathematics?**
**Answer:** Since we cannot decipher their script, we rely entirely on physical artifacts: standardized chert weights, marked measuring scales (like the Mohenjo-Daro ruler and Lothal ivory scale), and the precise dimensions of their baked bricks and buildings.

### **9. What geometric features are visible in Indus town planning?**
**Answer:** Grid-based city layouts with streets intersecting at exact right angles, perfectly aligned cardinal directions (North-South, East-West), and the rigorous use of the 4:2:1 ratio for all construction bricks.

### **10. Mention two examples of geometry from the Indus Valley.**
**Answer:** 
1. The Mohenjo-Daro shell object, which features slits that can measure angles in multiples of 30 degrees (functioning like an early protractor).
2. The prevalence of precise repeating intersecting circle motifs found on their painted pottery.

### **11. Did Indus Mathematics Influence Later India?**
**Answer:** Yes. While textual continuity is broken, practical continuity is obvious. The decimal system of weights, standardized measurement scales, and the 4:2:1 brick ratio persisted in the subcontinent long after the IVC declined, suggesting a direct transmission of practical mathematical knowledge.

### **12. Explain the decimal binary system in Indus Valley Civilisation with examples.**
**Answer:** Their weight system combined binary and decimal logic. The smaller weights followed a strict binary progression: 1, 2, 4, 8, 16, 32, 64. Once the weights reached a certain size, they switched to decimal multiples of the base ratio: 160, 200, 320, 640. 

---

## Part 2: Numeral Systems (Katapayadi & Bhuta-samkhya)

### **13. Identify the number represented by the Katapayadi system**
**Answer:** The rules are simple: Consonants represent digits 0-9. Vowels are ignored. Compound consonants use the final consonant. Importantly, standard Indian cryptographic systems read digits from right to left (the phrase "ankanam vamato gatih" means digits go right to left). 

I am decoding the first three. You will apply the table to complete the rest.
* **a) Līlāvatī:** Consonants: la (3), la (3), va (4), ta (6). Digits: 3-3-4-6. Reversed: **6433**.
* **b) Anuyogadvārasūtra:** Consonants: na (0), ya (1), ga (3), d-va -> va (4), ra (2), sa (7), tra -> ra (2). Digits: 0-1-3-4-2-7-2. Reversed: **2724310**.
* **c) Sulbasutras:** Consonants: sa (7), l-ba -> ba (3), sa (7), t-ra -> ra (2), sa (7). Digits: 7-3-7-2-7. Reversed: **72737**.

### **14. Identify the number represented by the Bhuta-sankhya system:**
**Answer:** This system uses nouns to represent numbers based on their physical or mythological properties (e.g., "eyes" = 2, "Vedas" = 4). Digits are reversed.
* **a) rama (3) - chandra (1) - guna (3) - nanda (9) - risi (7) - vedah (4)**. 
    * Number: **479313**.
* **b) guna (3) - adri (7) - kha (0) - sastra (5) - nayana (2) - bhujangah (8)**. ("nayana" means eyes, which is 2, functioning like "pairs of limbs" ).
    * Number: **825073**.
* **c) purna (0) - tri (3) - veda (4) - gruha (9) - nanda (9) - rtu (6) - padah (2)**.
    * Number: **2699430**.

*To write the above numbers using the Katapayadi system, you reverse the process by choosing consonants from Table 1. For example, 479313 could be written as gha (4) - Cha (7) - Jha (9) - ga (3) - pa (1) - ga (3).*

### **15. Rewrite the numbers below using the bhuta-samkhya system using Table 6.3**
**Answer:** You must read the number right-to-left and assign a word to each digit using the provided table.
* **a) 179,532,695:** Digits right-to-left are 5-9-6-2-3-5-9-7-1.
    * Translation: *bhūta-nanda-rtu-aśvin-guņa-śāstra-grha-rşi-candra*.
* **b) 345, 447:** Digits right-to-left are 7-4-4-5-4-3.
    * Translation: *adri-veda-śruti-bāņa-yuga-rāma*.
* **c) 670,087,123:** Digits right-to-left are 3-2-1-7-8-0-0-7-6.
    * Translation: *loka-ayana-adi-svara-vasu-śūnya-kha-dhātu-anga*.

---

## Part 3: Advanced Calculations

### **16. Sayanacharya gives us the speed of sunlight in 1/2 nimesa is 2202 yojanas. Calculate speed of the light?**
**Answer:** We need to convert ancient units to modern ones. 
* Distance: 2202 yojanas. (1 Yojana is roughly 9.06 miles). 
    * $2202 \times 9.06 \approx 19,950$ miles.
* Time: Half a *nimesa*. (1 nimesa is exactly $16/75$ of a second, so half a nimesa is $8/75$ of a second, which is roughly $0.1066$ seconds).
* Speed = Distance / Time = $19,950 / 0.1066 \approx 187,148$ miles per second.
* **Accuracy:** The modern measured speed of light is roughly $186,282$ miles per second. Sayanacharya's calculated value is incredibly close to the modern scientific reality, within a margin of error of less than 1%.

### **17. Using Vedic Sutras solve the followings:**
* **c) 'Yaavadunam': 989 X 1005**
    **Answer:** This sutra is used for numbers close to a base (like 1000).
    * Deviations from 1000: $989$ is $-11$. $1005$ is $+5$.
    * Cross-add the base numbers with the deviations: $989 + 5 = 994$ (or $1005 - 11 = 994$). This forms the first part of the answer: $994$.
    * Multiply the deviations: $-11 \times 5 = -55$.
    * Because it's base 1000, we write $-55$ as $-055$.
    * Combine them: $994,000 - 55 = 993,945$.
* *Note:* Question 17d (`60132576 = ?`) is fundamentally flawed as written in your document. You cannot perform division without a divisor. Go back to your source and find the missing variable.

### **18. Brahmagupta's cyclic quadrilateral.**
**Answer:** You are given sides $a=39, b=52, c=60, d=25$.
Brahmagupta's formula for the square of the diagonals ($x$ and $y$) based on your text's exact wording is:
$$x^{2} = \frac{ab+cd}{ad+bc} \times (ac+bd)$$
$$y^{2} = \frac{ad+bc}{ab+cd} \times (ac+bd)$$

Let's calculate the products:
* $ab+cd = (39 \times 52) + (60 \times 25) = 2028 + 1500 = 3528$
* $ad+bc = (39 \times 25) + (52 \times 60) = 975 + 3120 = 4095$
* $ac+bd = (39 \times 60) + (52 \times 25) = 2340 + 1300 = 3640$

Calculate diagonal $x$:
* $x^{2} = (3528 / 4095) \times 3640$
* Simplify the fraction $3528 / 4095$ by dividing by $63$: it equals $56 / 65$.
* $x^{2} = (56 / 65) \times 3640 = 56 \times 56 = 3136$.
* **Diagonal $x = 56$.**

Calculate diagonal $y$:
* $y^{2} = (4095 / 3528) \times 3640 = (65 / 56) \times 3640 = 65 \times 65 = 4225$.
* **Diagonal $y = 65$.**

**Find Area and Circumradius:**
* **Area ($A$):** Use Brahmagupta's formula $A = \sqrt{(s-a)(s-b)(s-c)(s-d)}$, where semiperimeter $s = (39+52+60+25)/2 = 88$.
    * $s-a = 49$, $s-b = 36$, $s-c = 28$, $s-d = 63$.
    * $A = \sqrt{49 \times 36 \times 28 \times 63} = \sqrt{3111696}$.
    * **Area = 1764.**
* **Circumradius ($R$):** The formula is $R = \sqrt{(ab+cd)(ac+bd)(ad+bc)} / 4A$.
    * $R = \sqrt{3528 \times 3640 \times 4095} / (4 \times 1764)$.
    * $R = (56 \times 65 \times 63) / 7056$.
    * $R = 229320 / 7056$.
    * **Circumradius = 32.5.**
