from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return "Welcome to Zesty Zomato!"

if __name__ == '__main__':
    app.run(debug=True)



menu = []

@app.route('/menu')
def view_menu():
    if len(menu) == 0:
        return "Menu is empty."
    else:
        menu_text = ""
        for dish in menu:
            menu_text += f"Dish ID: {dish['id']}, Name: {dish['name']}, Price: {dish['price']}, Availability: {dish['availability']}\n"
        return menu_text

@app.route('/menu/add/<int:dish_id>/<string:name>/<float:price>/<string:availability>')
def add_dish(dish_id, name, price, availability):
    for dish in menu:
        if dish['id'] == dish_id:
            return f"Dish with ID {dish_id} already exists."
    new_dish = {'id': dish_id, 'name': name, 'price': price, 'availability': availability}
    menu.append(new_dish)
    return f"Dish with ID {dish_id} added to the menu."

@app.route('/menu/remove/<int:dish_id>')
def remove_dish(dish_id):
    for dish in menu:
        if dish['id'] == dish_id:
            menu.remove(dish)
            return f"Dish with ID {dish_id} removed from the menu."
    return f"Dish with ID {dish_id} not found in the menu."

@app.route('/menu/update/<int:dish_id>/<string:availability>')
def update_availability(dish_id, availability):
    for dish in menu:
        if dish['id'] == dish_id:
            dish['availability'] = availability
            return f"Availability of Dish with ID {dish_id} updated."
    return f"Dish with ID {dish_id} not found in the menu."


orders = []
order_id_counter = 1

@app.route('/orders')
def view_orders():
    if len(orders) == 0:
        return "No orders yet."
    else:
        order_text = ""
        for order in orders:
            order_text += f"Order ID: {order['id']}, Customer: {order['customer']}, Dishes: {order['dishes']}, Status: {order['status']}\n"
        return order_text

@app.route('/orders/new/<string:customer>/<int:dish_id>')
def new_order(customer, dish_id):
    order_dishes = []
    for dish in menu:
        if dish['id'] == dish_id:
            if dish['availability'].lower() == 'yes':
                order_dishes.append(dish)
            else:
                return f"Dish with ID {dish_id} is not available."
    if len(order_dishes) > 0:
        global order_id_counter
        new_order = {'id': order_id_counter, 'customer': customer, 'dishes': order_dishes, 'status': 'received'}
        orders.append(new_order)
        order_id_counter += 1
        return f"New order taken with ID {new_order['id']}."
    else:
        return "No dishes available for the order."

@app.route('/orders/update/<int:order_id>/<string:status>')
def update_order_status(order_id, status):
    for order in orders:
        if order['id'] == order_id:
            order['status'] = status
            return f"Status of Order with ID {order_id} updated."
    return f"Order with ID {order_id} not found."

@app.route('/orders/review')
def review_orders():
    if len(orders) == 0:
        return "No orders yet."
    else:
        review_text = ""
        for order in orders:
            review_text += f"Order ID: {order['id']}, Customer: {order['customer']}, Status: {order['status']}\n"
        return review_text




@app.route('/orders/price/<int:order_id>')
def calculate_order_price(order_id):
    for order in orders:
        if order['id'] == order_id:
            total_price = 0
            for dish in order['dishes']:
                total_price += dish['price']
            return f"Total price of Order with ID {order_id}: {total_price}"
    return f"Order with ID {order_id} not found."
