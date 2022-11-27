// **Problem-2 Grade Student Marks**

// - Given an object of student grades and their marks in the mentioned below format, print the highest scored student for each grade along with the total

// === Sample Output ===
// V-Prateek-90
// VI-Albert-90
// VII-Sandhya-90

function gradeMarks(Arr) {
  let l = Arr.students[0].marks.length;
  let marks1 = 0;
  let marks2 = 0;
  for (let i = 0; i < l; i++) {
    marks1 += Arr.students[0].marks[i];
    marks2 += Arr.students[1].marks[i];
  }
  if (marks1 > marks2) {
    console.log(Arr.grade + "-" + Arr.students[0].name + "-" + marks1);
  } else {
    console.log(Arr.grade + "-" + Arr.students[1].name + "-" + marks2);
  }
}

let Arr = [
  {
    grade: "V",
    students: [
      { name: "Nrupul", marks: [10, 20, 30] },
      { name: "Prateek", marks: [20, 30, 40] },
    ],
  },
  {
    grade: "VI",
    students: [
      { name: "Aman", marks: [10, 20, 30] },
      { name: "Albert", marks: [20, 30, 40] },
    ],
  },
  {
    grade: "VII",
    students: [
      { name: "Yogesh", marks: [10, 20, 30] },
      { name: "Sandhya", marks: [20, 30, 40] },
    ],
  },
];

for (let i = 0; i < Arr.length; i++) {
  gradeMarks(Arr[i]);
}
// === Sample Output ===
// V-Prateek-90
// VI-Albert-90
// VII-Sandhya-90
