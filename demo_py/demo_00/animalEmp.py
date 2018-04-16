class Animal(object):
    pass

# 大类
class Mammal(Animal):
    pass

class Bird(Animal):
    pass

# 技能
class RunnableMixIn(object):
    def run(self):
        print('Running...')

class FlyableMixIn(object):
    def fly(self):
        print('Flying...')

class CarnivorousMixIn(object):
    def eat(self):
        print('eat meat.')

class HerbivoresMixIn(object):
    def eat(self):
        print('eat grass.')

# 各种动物
class Dog(Mammal, Runnable, CarnivorousMixIn):
    pass

class Bat(Mammal, Flyable):
    pass


