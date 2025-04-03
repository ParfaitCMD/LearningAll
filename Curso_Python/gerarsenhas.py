import random
import string

def generate_secure_password(length=24):
    chars = string.ascii_letters + string.digits + "!@#$%^&*_-+="
    return ''.join(random.choice(chars) for _ in range(length))

# Gera a senha e imprime
print(generate_secure_password())
