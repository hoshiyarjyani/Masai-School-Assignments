# app.py

from flask import Flask, render_template, request, jsonify, current_app
from database import init_db, close_db, create_tables

app = Flask(__name__)
app.config.from_pyfile('config.py')

@app.before_first_request
def initialize_database():
    
    init_db()
    create_tables()

@app.teardown_appcontext
def close_database(exception=None):
    
    close_db()

@app.route('/')
def index():
    return render_template('index.html')

if __name__ == '__main: In the above code, we first import the necessary modules and packages required for database integration. Then, we define the `get_db` function, which retrieves the MySQL database connection. The function checks if the connection exists in the current Flask application context and creates a new connection if it doesn't. This helps ensure that we have a single database connection throughout the application.
# app.py

from flask import Flask, render_template, request, jsonify, current_app
from database import init_db, close_db, create_tables
from api import api_bp

app = Flask(__name__)
app.config.from_pyfile('config.py')
app.register_blueprint(api_bp, url_prefix='/api')

