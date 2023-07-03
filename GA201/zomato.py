 
menu = [
    {"dish_id": 1, "dish_name": "Margherita Pizza", "price": 12.99, "availability": True},
    {"dish_id": 2, "dish_name": "Pasta Alfredo", "price": 9.99, "availability": True},
    {"dish_id": 3, "dish_name": "Garlic Bread", "price": 4.99, "availability": True},
    
]

def add_dish(dish_id, dish_name, price):
   
    dish = {
        "dish_id": dish_id,
        "dish_name": dish_name,
        "price": price,
        "availability": True
    }
    menu.append(dish)
    print(f"Dish '{dish_name}' has been added to the menu.")

def remove_dish(dish_id):
    
    for dish in menu:
        if dish["dish_id"] == dish_id:
            dish["availability"] = False
            print(f"Dish '{dish['dish_name']}' has been removed from the menu.")
            return
    print("Dish not found in the menu.")

def update_availability(dish_id, availability):
   
    for dish in menu:
        if dish["dish_id"] == dish_id:
            dish["availability"] = availability
            if availability:
                print(f"Dish '{dish['dish_name']}' is now available.")
            else:
                print(f"Dish '{dish['dish_name']}' is no longer available.")
            return
    print("Dish not found in the menu.")

def display_menu():
   
    print("Menu:")
    for dish in menu:
        availability = "Available" if dish["availability"] else "Not available"
        print(f"{dish['dish_id']}. {dish['dish_name']} - ${dish['price']} - {availability}")

 
add_dish(4, "Chicken Tikka", 14.99)
display_menu()
remove_dish(3)
display_menu()
update_availability(2, False)
display_menu()
