from item import Item
import jsonpickle

inventory_file_name = "inventory.txt"
inventory = []

inventory.append(Item("Star Wars", "1973", "5.00", "Sci-Fi", "4", "None"))
inventory.append(Item("Predator", "1985", "5.00", "Thriller", "2", "Chad"))


def load_inventory_json(inventory):
    inventory.clear()
    inventory_file = open('inventory.json', 'r')
    inventory = jsonpickle.decode(inventory_file.read())
    inventory_file.close()
    return inventory

def save_inventory_json(inventory):
    inventory_file = open('inventory.json', 'w')
    json_string = jsonpickle.encode(inventory)
    inventory_file.write(json_string)
    inventory_file.close()

def load_inventory():
    inventory.clear()
    inventory_file = open(inventory_file_name, 'r')
    for line in inventory_file.readlines():
        item_array = line.split('/t')
        for x in range(len(item_array)):
            inventory.append(Item(x[0], x[1], x[2], x[3], x[4], x[5]))
    inventory_file.close()

def save_inventory():
    inventory_file = open(inventory_file_name, 'w')
    for i in inventory:
        item_string = str(i.title) + '\t' + str(i.year) + '\t' + str(i.price) + '\t' + str(i.genre) + '\t' + str(i.shelf_number) + '\t' + str(current_renter)
        inventory_file.write(item_string)
    inventory_file.close()

def print_inventory():
    for i in inventory:
        print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")

def create_new_item():
    title = input("Enter Title: ")
    year = input("Enter Year: ")
    price = input("Enter Price: ")
    genre = input("Enter Genre: ")
    shelf_number = input("Enter Shelf Number: ")
    current_renter = input("Enter Current Renter: ")
    item = Item(title, year, price, genre, shelf_number, current_renter)
    inventory.append(item)
    save_inventory_json(inventory)

save_inventory_json(inventory)
inventory = load_inventory_json(inventory)
while True:
    print("choose an option")
    print("1. create inventory")
    print("2. view inventory")
    print("3. exit")
    choice = input(">")
    if choice == '3':
        break
    elif choice == '2':
        print_inventory()
    elif choice == '1':
        create_new_item()
    else:
        print("Enter the right number please")