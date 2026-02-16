📘 Java Lecture 1
📅 Date: 16/02/2026
📌 Topic: Introduction to Java & Portability Concept
☕ Introduction to Java
🔙 Background (1980s–1990s)

1980s–90s ke time par main programming languages thi:

C  →  C++  →  Java ?

🧠 C / C++ Features (90s me)

⚡ Fast

✨ Simple

🔩 Low-level

🖥 Direct computer se connect hoti thi

C/C++ computer ke hardware se directly interact karti thi, isliye performance fast tha.

❓ Why Java Needed?
🚫 Problem in C / C++

C/C++ me Portability nahi hoti thi.

📦 What is Portability?

👉 Portability ka matlab:

Ek hi program ko different computers par bina dobara compile kiye run kar pana.

🔎 C/C++ me kya problem thi?

C/C++ me source code ko run karne ke liye compiler use hota hai.

Agar:

💻 Laptop 1 me compile kiya

🖥 Dusre computer me run karna hai

Toh wapas compile karna padega ❗

Isliye C/C++ ko kehte hain:

❌ Platform Dependent Language
🖥 What is Platform?
Platform =
   Processor  +  Operating System

Example:
Processor	OS	Platform
Intel x86	Windows	P1
ARM	MacOS	P2

Agar C/C++ ka same source code:

P1 (Windows) me compile karoge → Windows machine code banega

P2 (Mac) me compile karoge → Mac machine code banega

⚠ Machine code har platform ke liye different hota hai.

🧠 ISA (Instruction Set Architecture)
Program → ISA → Processor


ISA batata hai:

Add kaise karna hai

Load kaise karna hai

Store kaise karna hai

Jump kaise karna hai

👉 Har processor ka ISA alag hota hai.
Isi wajah se machine code alag hota hai.

❌ C/C++ Disadvantages

Platform Dependent

Simplicity kam thi

Security kam thi

Isi problems ko solve karne ke liye Java ka janam hua 💡

☕ Java Features
Java =
   ✔ Portability
   ✔ Simplicity
   ✔ Security

🚀 How Java Solved Portability Problem?

Java ne introduce kiya:

🔹 BYTECODE Concept
Execution Flow:
hello.java  →  Compile  →  hello.class (Bytecode)
                                  ↓
                                JVM
                                  ↓
                           Machine Code

🔍 Step-by-Step:

Java source file (.java) compile hoti hai

Compile hone ke baad .class file banti hai

Ye .class file machine code nahi hoti

Ye hoti hai BYTECODE

🧩 JVM (Java Virtual Machine)

JVM ek translator hai.

👉 JVM ka kaam:

Bytecode ko read karna

Platform ke hisab se machine code banana

Isliye:

Same .class file Windows me bhi chalegi

Mac me bhi chalegi

Linux me bhi chalegi

Bas JVM install hona chahiye ✅

🌍 Java is Platform Independent

Java ka famous slogan:

✨ Write Once, Run Anywhere (WORA)
🎯 Conclusion
Language	Platform Dependent?	Portability
C	Yes	No
C++	Yes	No
Java	No	Yes

Java ne Bytecode + JVM ka use karke portability problem solve ki.