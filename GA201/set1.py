### Solution 1: Hello, World!

```python
print("Hello, World!")
```

### Solution 2: Data Type Play

```python
integer_var = 10
float_var = 3.14
string_var = "Hello"
boolean_var = True
list_var = [1, 2, 3]
tuple_var = (4, 5, 6)
dictionary_var = {"a": 1, "b": 2}
set_var = {7, 8, 9}

print("Type of integer_var:", type(integer_var), "Value:", integer_var)
print("Type of float_var:", type(float_var), "Value:", float_var)
print("Type of string_var:", type(string_var), "Value:", string_var)
print("Type of boolean_var:", type(boolean_var), "Value:", boolean_var)
print("Type of list_var:", type(list_var), "Value:", list_var)
print("Type of tuple_var:", type(tuple_var), "Value:", tuple_var)
print("Type of dictionary_var:", type(dictionary_var), "Value:", dictionary_var)
print("Type of set_var:", type(set_var), "Value:", set_var)
```

### Solution 3: List Operations

```python
numbers = list(range(1, 11))
print(numbers)

numbers.append(20)
print(numbers)

numbers.remove(3)
print(numbers)

numbers.sort()
print(numbers)
```

### Solution 4: Sum and Average

```python
def calculate_sum_average(numbers):
    total_sum = sum(numbers)
    average = total_sum / len(numbers)
    return total_sum, average

input_list = [10, 20, 30, 40]
sum_result, average_result = calculate_sum_average(input_list)
print("Sum:", sum_result, "Average:", average_result)
```

### Solution 5: String Reversal

```python
def reverse_string(string):
    return string[::-1]

input_string = "Python"
reversed_string = reverse_string(input_string)
print(reversed_string)
```

### Solution 6: Count Vowels

```python
def count_vowels(string):
    vowels = "aeiouAEIOU"
    vowel_count = 0
    for char in string:
        if char in vowels:
            vowel_count += 1
    return vowel_count

input_string = "Hello"
vowel_count = count_vowels(input_string)
print("Number of vowels:", vowel_count)
```

### Solution 7: Prime Number

```python
def is_prime(number):
    if number <= 1:
        return False
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False
    return True

input_number = 13
if is_prime(input_number):
    print(input_number, "is a prime number.")
else:
    print(input_number, "is not a prime number.")
```

### Solution 8: Factorial Calculation

```python
def calculate_factorial(number):
    factorial = 1
    if number < 0:
        return "Factorial is not defined for negative numbers."
    elif number == 0:
        return "Factorial of 0 is 1."
    else:
        for i in range(1, number + 1):
            factorial *= i
        return "Factorial of", number, "is", factorial

input_number = 5
factorial_result = calculate_factorial(input_number)
print(factorial_result)
```

### Solution 9: Fibonacci Sequence

```python
def generate_fibonacci_sequence(n):
    sequence = [0, 1]
    for i in

 range(2, n):
        next_number = sequence[i-1] + sequence[i-2]
        sequence.append(next_number)
    return sequence[:n]

input_number = 5
fibonacci_sequence = generate_fibonacci_sequence(input_number)
print(fibonacci_sequence)
```

### Solution 10: List Comprehension

```python
squared_numbers = [x ** 2 for x in range(1, 11)]
print(squared_numbers)
```