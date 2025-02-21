import unittest
import math

def square(side):
    if side < 0:
        return -1
    return side * side

def rectangle(side1, side2):
    if side1 < 0 or side2 < 0:
        return -1
    return side1 * side2

def circle(radius):
    if radius < 0:
        return -1
    return math.pi * radius * radius

def right_triangle(base, height):
    if base < 0 or height < 0:
        return -1
    return 0.5 * base * height

class TestGeometricFunctions(unittest.TestCase):
    def test_square(self):
        self.assertEqual(square(4), 16)
        self.assertEqual(square(0), 0)
        self.assertEqual(square(-3), -1)
    
    def test_rectangle(self):
        self.assertEqual(rectangle(10, 5), 50)
        self.assertEqual(rectangle(0, 5), 0)
        self.assertEqual(rectangle(10, -5), -1)
    
    def test_circle(self):
        self.assertAlmostEqual(circle(3), math.pi * 9)
        self.assertEqual(circle(0), 0)
        self.assertEqual(circle(-3), -1)
    
    def test_right_triangle(self):
        self.assertEqual(right_triangle(4, 5), 10)
        self.assertEqual(right_triangle(0, 5), 0)
        self.assertEqual(right_triangle(3, -5), -1)

if __name__ == "__main__":
    unittest.main()
