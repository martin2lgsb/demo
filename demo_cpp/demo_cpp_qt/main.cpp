#include <QApplication>
#include <QPushButton>
#include <QLabel>

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);
    QWidget w;
    w.setWindowTitle("asdf");

    QLabel textLabel;
    textLabel.resize(100, 15);
    textLabel.move(150, 170);
    textLabel.setText("jghfjj");
//    textLabel.setParent(&w);
    w.show();


    return QApplication::exec();
}
