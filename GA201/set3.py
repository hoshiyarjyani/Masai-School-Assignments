### Solution 1: Tuple Unpacking

```python
people = [("John", 25), ("Jane", 30)]
for name, age in people:
    print(f"{name} is {age} years old.")
```

### Solution 2: Dictionary Manipulation

```python
ages = {"John": 25}
print(ages)  # Output: {'John': 25}

# Add new name-age pair
ages["Jane"] = 30
print(ages)  # Output: {'John': 25, 'Jane': 30}

# Update age of a name
ages["John"] = 26
print(ages)  # Output: {'John': 26, 'Jane': 30}

# Delete a name from the dictionary
del ages["John"]
print(ages)  # Output: {'Jane': 30}
```

### Solution 3: Two Sum Problem

```python
def two_sum(nums, target):
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[num] = i
    return []

nums = [2, 7, 11, 15]
target = 9
result = two_sum(nums, target)
print(result)
```

### Solution 4: Palindrome Check

```python
def is_palindrome(word):
    reversed_word = word[::-1]
    if word == reversed_word:
        return f"The word {word} is a palindrome."
    else:
        return f"The word {word} is not a palindrome."

word = "madam"
result = is_palindrome(word)
print(result)
```

### Solution 5: Selection Sort

```python
def selection_sort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr

arr = [64, 25, 12, 22, 11]
sorted_arr = selection_sort(arr)
print(sorted_arr)
```

### Solution 6: Implement Stack using Queue

```python
from queue import Queue

class Stack:
    def __init__(self):
        self.q1 = Queue()
        self.q2 = Queue()

    def push(self, item):
        self.q2.put(item)
        while not self.q1.empty():
            self.q2.put(self.q1.get())
        self.q1, self.q2 = self.q2, self.q1

    def pop(self):
        if self.q1.empty():
            return None
        return self.q1.get()

stack = Stack()
stack.push(1)
stack.push(2)
print(stack.pop())  # Output: 2
stack.push(3)
print(stack.pop())  # Output: 3
print(stack.pop())  # Output: 1
```

### Solution 7: FizzBuzz

```python
for num in range(1, 101):
    if num % 3 == 0 and num % 5 == 0:
        print("FizzBuzz")
    elif num % 3 == 0:
        print("Fizz")
    elif num % 5 == 0:
        print("Buzz")
    else:
        print(num)
```

### Solution 8: File I/O

```python
with open("input.txt", "r") as file:
    content = file.read()
    word_count = len(content.split())

with open("output.txt", "w") as

 file:
    file.write(f"Number of words: {word_count}")
```

### Solution 9: Exception Handling

```python
def divide_numbers(a, b):
    try:
        result = a / b
        return result
    except ZeroDivisionError:
        return "Cannot divide by zero."

a = 5
b = 0
result = divide_numbers(a, b)
print(result)
```