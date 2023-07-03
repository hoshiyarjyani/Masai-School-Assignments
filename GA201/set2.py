### Solution 1: Print the following pattern

```python
for i in range(1, 6):
    for j in range(1, i + 1):
        print(j, end=" ")
    print()
```

### Solution 2: Display numbers from a list using loop

```python
numbers = [12, 75, 150, 180, 145, 525, 50]
for num in numbers:
    if num > 500:
        break
    if num % 5 == 0 and num <= 150:
        print(num)
```

### Solution 3: Append new string in the middle of a given string

```python
s1 = "Ault"
s2 = "Kelly"
middle_index = len(s1) // 2
s3 = s1[:middle_index] + s2 + s1[middle_index:]
print(s3)
```

### Solution 4: Arrange string characters such that lowercase letters should come first

```python
str1 = "PyNaTive"
lowercase_letters = ""
uppercase_letters = ""
for char in str1:
    if char.islower():
        lowercase_letters += char
    else:
        uppercase_letters += char
arranged_string = lowercase_letters + uppercase_letters
print(arranged_string)
```

### Solution 5: Concatenate two lists index-wise

```python
list1 = ["M", "na", "i", "Ke"]
list2 = ["y", "me", "s", "lly"]
concatenated_list = [list1[i] + list2[i] for i in range(min(len(list1), len(list2)))]
if len(list1) > len(list2):
    concatenated_list.extend(list1[len(list2):])
else:
    concatenated_list.extend(list2[len(list1):])
print(concatenated_list)
```

### Solution 6: Concatenate two lists in the following order

```python
list1 = ["Hello ", "take "]
list2 = ["Dear", "Sir"]
concatenated_list = [x + y for x in list1 for y in list2]
print(concatenated_list)
```

### Solution 7: Iterate both lists simultaneously

```python
list1 = [10, 20, 30, 40]
list2 = [100, 200, 300, 400]
for x, y in zip(list1, reversed(list2)):
    print(x, y)
```

### Solution 8: Initialize dictionary with default values

```python
employees = ['Kelly', 'Emma']
defaults = {"designation": 'Developer', "salary": 8000}
employee_dict = {employee: defaults for employee in employees}
print(employee_dict)
```

### Solution 9: Create a dictionary by extracting the keys from a given dictionary

```python
sample_dict = {
    "name": "Kelly",
    "age": 25,
    "salary": 8000,
    "city": "New york"
}
keys = ["name", "salary"]
new_dict = {key: sample_dict[key] for key in keys}
print(new_dict)
```

### Solution 10: Modify the tuple

```python
tuple1 = (11, [22, 33], 44, 55)
list_inside_tuple = list(tuple1[1])
list_inside_tuple[0] = 222
modified_tuple = tuple([tuple1[0], list_inside_tuple, *tuple1[2:]])
print(modified_tuple)
```