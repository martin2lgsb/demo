from flask import Flask, url_for, request, render_template


app = Flask(__name__)

@app.route("/")
def index():
    return 'index page'

@app.route("/hello")
def hello():
    return 'hello page'

@app.route("/user/<username>")
def show_user(username):
    return 'user: %s' % username

@app.route("/post/<int:post_id>")
def show_post(post_id):
    return 'post: %d' % post_id

@app.route("/login", methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        do_the_login()
    else:
        return render_template('login.html', name='ceshi_login_get')

with app.test_request_context():
    print(url_for('index'))
    print(url_for('hello'))
    print(url_for('hello', para='bitch'))
    print(url_for('show_user', username='laozhang'))


if __name__ == '__main__':
    app.run(debug=True)
