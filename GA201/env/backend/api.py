# api.py

from flask import Blueprint, request, jsonify
from database import get_db

api_bp = Blueprint('api', __name__)

@api_bp.route('/menu', methods=['GET'])
def get_menu():
    """
    Get the menu of dishes.
    """
    db = get_db()
    cursor = db.connection.cursor()
    cursor.execute("SELECT * FROM dishes")
    dishes = cursor.fetchall()
    cursor.close()

    menu = []
    for dish in dishes:
        menu.append({
            'id': dish[0],
            'name': dish[1],
            'price': float(dish[2]),
            'availability': bool(dish[3])
        })

    return jsonify(menu)

@api_bp.route('/menu', methods=['POST'])
def add_dish():
    """
    Add a new dish to the menu.
    """
    dish_data = request.get_json()
    name = dish_data['name']
    price = dish_data['price']
    availability = dish_data['availability']

    db = get_db()
    cursor = db.connection.cursor()
    cursor.execute(
        "INSERT INTO dishes (name, price, availability) VALUES (%s, %s, %s)",
        (name, price, availability)
    )
    db.connection.commit()
    cursor.close()

    return jsonify({'message': 'Dish added successfully'})

@api_bp.route('/orders', methods=['POST'])
def place_order():
    """
    Place a new order.
    """
    order_data = request.get_json()
    dish_id = order_data['dish_id']
    customer_name = order_data['customer_name']

    db = get_db()
    cursor = db.connection.cursor()
    cursor.execute(
        "SELECT * FROM dishes WHERE id = %s AND availability = TRUE",
        (dish_id,)
    )
    dish = cursor.fetchone()

    if dish is None:
        return jsonify({'message': 'Invalid dish ID or dish not available'})

    cursor.execute(
        "INSERT INTO orders (dish_id, customer_name) VALUES (%s, %s)",
        (dish_id, customer_name)
    )
    db.connection.commit()
    cursor.close()

    return jsonify({'message': 'Order placed successfully'})
