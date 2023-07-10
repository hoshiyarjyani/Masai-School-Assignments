employees = [
    {"name":"John", "salary":3000, "desi":"devloper"},
    {"name":"Emma", "salary":4000, "desi":"manager"},
    {"name":"kelly", "salary":3500, "desi":"tester"},
]

print(max(employees,key=lambda e:e["salary"]))
