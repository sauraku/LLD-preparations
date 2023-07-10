+ users should be able to add new products to item to sell
+ user should be able to search for products by name or category
+ user needs to be registered to buy the product
+ user can checkout items in cart
+ user can rate and review products
+ user should be notified when the order statsus changes
--------------------


Product
-----------
+ id: string
+ price: float
+ name: string
+ category: ProductCategory
-----------------------

Item
--------------
+ product: Product
+ quantity: int
-------------------

ProductCategory
--------------------
+ categories: enum
-----------------------

Address
------------------
+ name: string
+ addressLine: string
+ city: string
+ country: string
+ pincode: int
+ phoneNo: int
--------------------



Cart
----------------
+ items: List<Item>
-------------------------
+ getTotalPrice(): totalPrice: float
+ addItem(item: Item): void
+ removeItem(item: Item): void
+ checkout(address:Address): order: Order
----------------------------------------

Order
-------------------
+ items: List<Item>
+ totalPrice: float
+ userID: string
+ status: OrderStatus
--------------

User
-------------------
+ userID: string
+ addresses: List<Address>
-----------------------





