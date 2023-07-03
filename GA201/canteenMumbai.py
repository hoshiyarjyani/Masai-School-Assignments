# Initialize empty inventory and sales record
inventory = []
sales_record = []

# Function to add a snack to the inventory
def add_snack():
    snack_id = input("Enter snack ID: ")
    snack_name = input("Enter snack name: ")
    snack_price = float(input("Enter snack price: "))
    snack_availability = input("Is the snack available? (yes/no): ")
    snack = {
        "id": snack_id,
        "name": snack_name,
        "price": snack_price,
        "availability": snack_availability.lower() == "yes"
    }
    inventory.append(snack)
    print("Snack added successfully.")

# Function to remove a snack from the inventory
def remove_snack():
    snack_id = input("Enter snack ID to remove: ")
    for snack in inventory:
        if snack["id"] == snack_id:
            inventory.remove(snack)
            print("Snack removed successfully.")
            return
    print("Snack not found in the inventory.")

# Function to update the availability of a snack
def update_availability():
    snack_id = input("Enter snack ID to update availability: ")
    for snack in inventory:
        if snack["id"] == snack_id:
            new_availability = input("Enter new availability (yes/no): ")
            snack["availability"] = new_availability.lower() == "yes"
            print("Availability updated successfully.")
            return
    print("Snack not found in the inventory.")

# Function to record a snack sale
def record_sale():
    snack_id = input("Enter snack ID sold: ")
    for snack in inventory:
        if snack["id"] == snack_id:
            if snack["availability"]:
                sales_record.append(snack)
                inventory.remove(snack)
                print("Sale recorded successfully.")
                return
            else:
                print("Snack is not available for sale.")
                return
    print("Snack not found in the inventory.")

# Function to display the current inventory
def display_inventory():
    print("Current Inventory:")
    if len(inventory) == 0:
        print("Inventory is empty.")
    else:
        for snack in inventory:
            print(f"ID: {snack['id']}, Name: {snack['name']}, Price: {snack['price']}, Availability: {snack['availability']}")

# Function to display the sales record
def display_sales_record():
    print("Sales Record:")
    if len(sales_record) == 0:
        print("No sales recorded.")
    else:
        for snack in sales_record:
            print(f"ID: {snack['id']}, Name: {snack['name']}, Price: {snack['price']}")

# Main loop for user interaction
while True:
    print("\n======= Mumbai Munchies: The Canteen Chronicle =======")
    print("1. Add a snack to the inventory")
    print("2. Remove a snack from the inventory")
    print("3. Update snack availability")
    print("4. Record a snack sale")
    print("5. Display current inventory")
    print("6. Display sales record")
    print("7. Exit")
    choice = input("Enter your choice (1-7): ")

    if choice == "1":
        add_snack()
    elif choice == "2":
        remove_snack()
    elif choice == "3":
        update_availability()
    elif choice == "4":
        record_sale()
    elif choice == "5":
        display_inventory()
    elif choice == "6":
        display_sales_record()
    elif choice == "7":
        print("Exiting the program. Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")
