from app import app, db

class Order(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    status = db.Column(db.String(50), nullable=False)

    def __repr__(self):
        return f"Order(id={self.id}, status={self.status})"
