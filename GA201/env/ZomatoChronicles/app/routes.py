from flask import render_template
from flask_socketio import emit, join_room
from app import app, socketio

@app.route('/order_status/<order_id>')
def order_status(order_id):
    return render_template('order_status.html', order_id=order_id)

@socketio.on('join')
def join(message):
    room = message['order_id']
    join_room(room)

@socketio.on('status_update')
def status_update(data):
    emit('status_update', {'status': data['status']}, room=data['order_id'])

from flask import request
from app import app, socketio

@app.route('/update_status', methods=['POST'])
def update_status():
    order_id = request.form.get('order_id')
    new_status = request.form.get('status')
 
    socketio.emit('status_update', {'status': new_status}, room=order_id)

    return 'Status updated successfully'
