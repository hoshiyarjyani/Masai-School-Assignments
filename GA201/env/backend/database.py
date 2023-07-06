# database.py

from flask import current_app
from flask_mysqldb import MySQL

def get_db():
    
    if 'db' not in current_app.config:
        current_app.config['db'] = MySQL(current_app)
    return current_app.config['db']

def init_db():
 
    db = get_db()
    db.init_app(current_app)
    db.connect()

def close_db():
   
    db = get_db()
    db.connection.close()

def create_tables():
   
    db = get_db()
    cursor = db.connection.cursor()

    # Create the dishes table
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS dishes (
            id INT AUTO_INCREMENT PRIMARY KEY,
            name VARCHAR(255) NOT NULL,
            price DECIMAL(8, 2) NOT NULL,
            availability BOOLEAN NOT NULL DEFAULT TRUE
        )
    """)

    # Create the orders table
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS orders (
            id INT AUTO_INCREMENT PRIMARY KEY,
            dish_id INT NOT NULL,
            customer_name VARCHAR(255) NOT NULL,
            status VARCHAR(20) NOT NULL DEFAULT 'received',
            FOREIGN KEY (dish_id) REFERENCES dishes(id)
        )
    """)

    db.connection.commit()
    cursor.close()
