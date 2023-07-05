from flask import Flask, render_template, request, redirect

app = Flask(__name__)

# Menu data
menu = [
    {'id': 1, 'name': 'Pizza', 'price': 10, 'availability': True},
    {'id': 2, 'name': 'Burger', 'price': 5, 'availability': True},
    {'id': 3, 'name': 'Pasta', 'price': 8, 'availability': True},
]

# Order data
orders = []
order_id = 1


@app.route('/')
def index():
    return render_template('base.html')


@app.route('/menu')
def show_menu():
    return render_template('menu.html', menu=menu)


@app.route('/orders')
def show_orders():
    return render_template('orders.html', orders=orders)


@app.route('/order/update/<int:order_id>', methods=['GET', 'POST'])
def update_order(order_id):
    if request.method == 'POST':
        status = request.form['status']
        for order in orders:
            if order['id'] == order_id:
                order['status'] = status
                break
        return redirect('/orders')
    else:
        return render_template('order_update.html', order_id=order_id)


@app.route('/order', methods=['POST'])
def place_order():
    global order_id
    name = request.form['name']
    dish_ids = request.form.getlist('dish_id')
    order = {'id': order_id, 'name': name, 'dish_ids': dish_ids, 'status': 'received'}
    orders.append(order)
    order_id += 1
    return redirect('/orders')


if __name__ == '__main__':
    app.run(debug=True)
